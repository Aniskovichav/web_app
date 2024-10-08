package com.example.demowebapp.dao;

import com.example.demowebapp.db.AbstractJpaDAO;
import com.example.demowebapp.entity.Office;
import com.example.demowebapp.utils.HibernateAnnotationUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class OfficeDao extends AbstractJpaDAO<Integer, Office> {

    public void saveOffice(Office office) {
        Transaction transaction = null;
        try (Session session = HibernateAnnotationUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(office);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public Office getOfficeById(String officeCode) {
        try (Session session = HibernateAnnotationUtil.getSessionFactory().openSession()) {
            return session.get(Office.class, officeCode);
        }
    }

    public List<Office> getAllOffices() {
        try (Session session = HibernateAnnotationUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Office", Office.class).list();
        }
    }

    public void updateOffice(Office office) {
        Transaction transaction = null;
        try (Session session = HibernateAnnotationUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(office);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    public void deleteOffice(String officeCode) {
        Transaction transaction = null;
        try (Session session = HibernateAnnotationUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Office office = session.get(Office.class, officeCode);
            if (office != null) {
                session.delete(office);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
}

