/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.api;

/**
 *
 * @author exkapp
 */
public class factoryDao {
    
    public enum DAOTYPE{CHURRO,CHURRERO}
    
    public static Idao getDao(DAOTYPE t){
        Idao dao = null;
        switch(t){
            case CHURRO:
                dao = new daoChurros();
            break;
            case CHURRERO: 
                dao = new daoChurrero();
            break;
        }
        return dao;
    }
    
}
