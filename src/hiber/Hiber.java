/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber;


import data.Pojo;
import data.Address;
import data.Center;
import data.Course;
import java.util.Date;

/**
 *
 * @author Samy
 */
public class Hiber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Address addressHome = new Address();
        addressHome.setState("Menofia");
        addressHome.setCity("Sadat City");
        addressHome.setStreet("Akhmas"); 
        
        
        Pojo pojo = new Pojo();
        pojo.setAge("24");
        pojo.setName("Mohammed Sami");
        pojo.setHomeAddress(addressHome);
        pojo.setBirthdate("15-4-1999");
        pojo.setEmail("mshelal555@gmail.com");
        pojo.setPhone("01069484817");
        pojo.setHireDate(new Date());
        

//        Person person = new Person();
//        person.setName("Mohammed Sami2");
//        
//        Books book = new Books();
//        book.setBookName("Head First Java2");
//        book.setPerson(person);
//        person.setBook(book);
//        
//        
        Center center = new Center();
        center.setCenterName("Al Rahma");
        center.getCourses().add(new Course("Java"));
        center.getCourses().add(new Course(".net"));
        center.getCourses().add(new Course("Python"));
        center.getCourses().add(new Course("MERN Stack"));


        Crud crud = new Crud();
//        crud.insert(pojo);
//        crud.insertPerson(person);
//        crud.insertBook(book);
        crud.insertCenter(center);

    }
    
}
