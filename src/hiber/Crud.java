/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber;

import ManyToMany.Centers;
import data.Pojo;
import data.Books;
import data.Center;
import data.Person;
import data.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Samy
 */
public class Crud {

    public void insert(Pojo pojo) {
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.save(pojo);
            se.getTransaction().commit();
            System.out.println("Inserted successfully...");

        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }

    public void insertStudent(Student student) {
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.save(student);
            se.getTransaction().commit();
            System.out.println("Inserted successfully...");

        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }

    public Pojo select(int id) {

        Session se = NewHibernateUtil.getSessionFactory().openSession();

        try {
            //se.beginTransaction();

            Pojo pojo = (Pojo) se.get(Pojo.class, id);
            System.out.println(" Name: " + pojo.getName() + "  :  " + " address: " + pojo.getAddress());

            // se.getTransaction().commit();
            return pojo;
        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
        return null;
    }

    public void update(Pojo pojo) {

        Session se = NewHibernateUtil.getSessionFactory().openSession();

        try {
            se.beginTransaction();
            se.update(pojo);

            System.out.println(" updated successfully ... ");

            se.getTransaction().commit();
        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }

    public void delete(int id) {
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        Pojo pojo = (Pojo) se.get(Pojo.class, id);

        try {
            se.beginTransaction();
            se.delete(pojo);

            System.out.println(" deleted successfully ... ");

            se.getTransaction().commit();
        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }

    public void insertPerson(Person person) {
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.save(person);
            se.getTransaction().commit();
            System.out.println("Inserted successfully...");

        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }

    public void selectPerson(int id) {

        Session se = NewHibernateUtil.getSessionFactory().openSession();

        try {
            //se.beginTransaction();

            Person person = (Person) se.get(Person.class, id);
            System.out.println(" Name: " + person.getName() + "  :  " + " book: " + person.getBook().getBookName());

            // se.getTransaction().commit();
        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }

    public void insertBook(Books book) {
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.save(book);
            se.getTransaction().commit();
            System.out.println("Inserted successfully...");

        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }

    public void selectBook(int id) {

        Session se = NewHibernateUtil.getSessionFactory().openSession();

        try {
            //se.beginTransaction();

            Books book = (Books) se.get(Books.class, id);
            System.out.println(" book name : " + book.getBookName() + "  ||  " + " person name: " + book.getPerson().getName());

            // se.getTransaction().commit();
        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }
    
    
    
    
     public void insertCenter(Center center) {
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.save(center);
            se.getTransaction().commit();
            System.out.println("Inserted successfully...");

        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }
     
      public void insertManyToMany(Centers center , Centers center2) {
        Session se = NewHibernateUtil.getSessionFactory().openSession();
        try {
            se.beginTransaction();
            se.save(center);
            se.save(center2);
            se.getTransaction().commit();
            System.out.println("Inserted successfully...");

        } catch (HibernateException h) {
            System.out.println("Error is : " + h.getMessage());
            se.getTransaction().rollback();
        } finally {
            se.close();
        }
    }
}
