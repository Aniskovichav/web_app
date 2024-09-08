package com.example.demowebapp.test;

import com.example.demowebapp.dao.impl.EmployeeDao;
import com.example.demowebapp.entity.Employee;
import com.example.demowebapp.utils.HibernateAnnotationUtil;
import com.example.demowebapp.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Date;

public class HibernateMain {

    static EmployeeDao dao = new EmployeeDao();

    public static void main(String[] args) {

//        Employee empl = dao.getByKey(19);
//        System.out.println(empl);
//
//        Transaction txn = null;
//        try(Session session = HibernateAnnotationUtil.getSessionFactory().getCurrentSession()) {
//            //Get Session OLD -> HibernateUtil.getSessionFactory().getCurrentSession();
//
//            //start transaction
//            txn = session.beginTransaction();
//            Employee empl = session.get(Employee.class, 19);
//            txn.commit();
//
//            System.out.println(empl);
//        } catch (Exception e){
//            e.printStackTrace();
//            if(txn != null){
//                txn.rollback();
//            }
//        }
//         finally {
//            //terminate session factory, otherwise program won't end
//            HibernateAnnotationUtil.close();
//        }

    }


}
