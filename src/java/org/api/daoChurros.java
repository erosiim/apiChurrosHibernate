/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.api;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author exkapp
 */
public class daoChurros implements Idao<churros>{
    private SessionFactory factory;
    private Session session;
    
    public daoChurros() {
        factory = HibernateUtil.getSessionFactory();
    }
    
    @Override
    public boolean insert(churros t) {
        session= factory.openSession();
        session.beginTransaction();
        
        session.save(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean delete(churros t) {
        session= factory.openSession();
        session.beginTransaction();
        session.delete(t);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public boolean update(churros t) {
        session= factory.openSession();
        session.beginTransaction();
        
        session.update(t);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public churros readOne(churros t) {
        session= factory.openSession();
        session.beginTransaction();
        churros ch = (churros) session.get(churros.class,t.getId_churro());
        session.getTransaction().commit();
        session.close();
        return ch;
    }

    @Override
    public List<churros> readAll() {
        session = factory.openSession();
        
        Query query = session.createQuery("from churros"); 
        
        List list=query.list();
        
        session.close();
        return list;
    }
    
}
