/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.api;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author exkapp
 */
public class daoChurrero implements Idao<churrero>{
    private SessionFactory factory;
    private Session session;

    public daoChurrero() {
        factory = HibernateUtil.getSessionFactory();
    }
    
    

    @Override
    public boolean insert(churrero t) {
         session= factory.openSession();
        session.beginTransaction();
        
        session.save(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(churrero t) {
        session= factory.openSession();
        session.beginTransaction();
        session.delete(t);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(churrero t) {
        session= factory.openSession();
        session.beginTransaction();
        
        session.update(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public churrero readOne(churrero t) {
       session= factory.openSession();
       session.beginTransaction();
       churrero ch = (churrero) session.get(churrero.class,t.getId_churrero());
       session.getTransaction().commit();
       session.close();
       return ch;
    }

    @Override
    public List<churrero> readAll() {
          session = factory.openSession();
        
        Query query = session.createQuery("from churrero"); 
        
        List list=query.list();
        
        session.close();
        return list;
    }
    
}
