/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samiapp;

import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Mohammmed Sami
 */
public class Crud {
    
    public void insert(PojoData pojo){
        Session se = SamioHibernateUtil.getSessionFactory().openSession();
        try{
        se.beginTransaction();
        se.save(pojo);
        se.getTransaction().commit();
        System.out.println("Inserted successfully...");
        
        }catch(HibernateException h){
            System.out.println("Error is : " +  h.getMessage());
            se.getTransaction().rollback();
        }
        finally{
            se.close();
        }
    }
    
    public PojoData select(int id){
        
        Session se = SamioHibernateUtil.getSessionFactory().openSession();
        
        try{
        //se.beginTransaction();
        
        PojoData pojo = (PojoData) se.get(PojoData.class, id);
        
            System.out.println(" Name: " + pojo.getName() + "  :  " + " email: " + pojo.getEmail());
            
       // se.getTransaction().commit();
        return pojo;
        }catch(HibernateException h){
            System.out.println("Error is : " +  h.getMessage());
            se.getTransaction().rollback();
        }
        finally{
            se.close();
        }
        return null;
    }
    
    
    public void update(PojoData pojo){
        
        Session se = SamioHibernateUtil.getSessionFactory().openSession();
        
        try{
        se.beginTransaction();
        se.update(pojo);
        
        System.out.println(" updated successfully ... ");
            
        se.getTransaction().commit();
        }catch(HibernateException h){
            System.out.println("Error is : " +  h.getMessage());
            se.getTransaction().rollback();
        }
        finally{
            se.close();
        }
    }
    
    
    public void delete(PojoData pojo){
        Session se = SamioHibernateUtil.getSessionFactory().openSession();
        
        try{
        se.beginTransaction();
        se.delete(pojo);
        
        System.out.println(" deleted successfully ... ");
            
        se.getTransaction().commit();
        }catch(HibernateException h){
            System.out.println("Error is : " +  h.getMessage());
            se.getTransaction().rollback();
        }
        finally{
            se.close();
        }
    }
    
}
