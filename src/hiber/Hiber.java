/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber;


import ManyToMany.Centers;
import ManyToMany.Courses;
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
//         Center center = new Center();
//
//        Course course1 = new Course();
//        course1.setCourseName("MEAN Stack");
//        course1.setCenter(center);
//        
//        Course course2 = new Course();
//        course2.setCourseName("MEAN Stack");
//        course2.setCenter(center);
//        
//        Course course3 = new Course();
//        course3.setCourseName("MEAN Stack");
//        course3.setCenter(center);
//        
//        Course course = new Course();
//        course.setCourseName("MEAN Stack");
//        course.setCenter(center);
//       
//        center.setCenterName("Al Rahma");
//        center.getCourses().add(course1);
//        center.getCourses().add(course);
//        center.getCourses().add(course2);
//        center.getCourses().add(course3);

        Courses courses = new Courses();
        Courses courses1 = new Courses();
        
        courses.setName("Java");
        courses1.setName("Python");
        
        Centers centers = new Centers();
        Centers centers1 = new Centers();
        
        centers.setName("GOOGLE");
        centers1.setName("APPLE");
        
        centers.getCourses().add(courses1);
        centers1.getCourses().add(courses);
        
        courses.getCenters().add(centers);
        courses1.getCenters().add(centers1);
        
        Crud crud = new Crud();
//        crud.insert(pojo);
//        crud.insertPerson(person);
//        crud.insertBook(book);
        crud.insertManyToMany(centers , centers1);
    }
    
}
