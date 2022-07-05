/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author Samy
 */

@Entity
public class Course {

    private int id;
    private String courseName;
    private Center center;
    
    
    public Course(String courseName) {
        this.courseName = courseName;
    }
    public Course(){
        
    }

    
    
    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Cen_id")
    public Center getCenter() {
        return center;
    }

    public void setCenter(Center center) {
        this.center = center;
    }
    
    
    
}
