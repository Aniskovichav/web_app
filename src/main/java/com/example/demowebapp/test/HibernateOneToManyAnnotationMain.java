package com.example.demowebapp.test;

import java.util.HashSet;
import java.util.Set;

import com.example.demowebapp.entity.Cart;
import com.example.demowebapp.entity.Item;
import com.example.demowebapp.utils.HibernateAnnotationUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.EntityManagerFactory;

public class HibernateOneToManyAnnotationMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(HibernateOneToManyAnnotationMain.class);

    public static void main(String[] args) {

        Cart cart = new Cart();

        Item item1 = new Item(cart);
        Item item2 = new Item(cart);
        Set<Item> itemsSet = new HashSet<>();
        itemsSet.add(item1);
        itemsSet.add(item2);

        cart.setItems(itemsSet);

        SessionFactory sessionFactory = HibernateAnnotationUtil.getSessionFactory();
        EntityManagerFactory emf = sessionFactory;


        Session session = sessionFactory.getCurrentSession();
        LOGGER.info("Session created");

        try {
            // start transaction
            Transaction tx = session.beginTransaction();

            // Save the Model object
            session.save(cart);
            session.save(item1);
            session.save(item2);

            // Commit transaction
            tx.commit();

            System.out.println("Cart ID="+ cart.getId());
            System.out.println("item1 ID="+ item1.getId()+", Foreign Key Cart ID="+ item1.getCart().getId());
            System.out.println("item2 ID="+item2.getId()+", Foreign Key Cart ID="+ item2.getCart().getId());

        } catch (Exception e) {
            LOGGER.error("Exception occurred", e);
        } finally {
            if (!sessionFactory.isClosed()) {
                LOGGER.info("Closing SessionFactory");
                sessionFactory.close();
            }
        }
    }
}
