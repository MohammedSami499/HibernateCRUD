/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber;

import hiber.compoundPk.CompPk;
import hiber.compoundPk.Student;
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
        
        Address address = new Address();
        address.setState("Cairo");
        address.setCity("Nasr City");
        address.setStreet("Rabaa");
        
        Address address1 = new Address();
        address1.setState("Cairo");
        address1.setCity("Nasr City");
        address1.setStreet("Rabaa");
        
        Pojo pojo = new Pojo();
        pojo.setAge("24");
        pojo.setName("Mohammed Sami");
        pojo.setHomeAddress(addressHome);
        pojo.setAddress(address);
        pojo.setBirthdate("15-4-1999");
        pojo.setEmail("mshelal555@gmail.com");
        pojo.setPhone("01069484817");
        pojo.setHireDate(new Date());
        
        CompPk comp = new CompPk(1 , 100);
        
        Student student = new Student();
        
        student.setName("Mohammed Sami");
        student.getAddList().add(addressHome);
        student.getAddList().add(address);
        student.getAddList().add(address1);
        
        Student student2 = new Student();
        
        Address addressHome2 = new Address();
        addressHome2.setState("Menofia2");
        addressHome2.setCity("Sadat City2");
        addressHome2.setStreet("Akhmas2"); 
        
        Address address2 = new Address();
        address2.setState("Cairo2");
        address2.setCity("Nasr City2");
        address2.setStreet("Rabaa2");
        
        Address address12 = new Address();
        address12.setState("Beheira2");
        address12.setCity("Nasr Beheira City");
        address12.setStreet("Rabaa Beheira");
        
        student.setName("Mohammed Sami2222");
        student.getAddList().add(addressHome2);
        student.getAddList().add(address2);
        student.getAddList().add(address12);


        
        Crud crud = new Crud();
        crud.insert(pojo);
        crud.insertStudent(student);
    }
    
}
