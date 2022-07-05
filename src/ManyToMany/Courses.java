/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManyToMany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Samy
 */
@Entity
@Table(name = "MyCourses")
public class Courses implements Serializable {
    
    private int id;
    private String name;
    List<Centers> centers = new ArrayList<>();

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Cours_Centers" , joinColumns = {@JoinColumn(name = "cours_id")}
    , inverseJoinColumns = { @JoinColumn(name = "center_id")})
    public List<Centers> getCenters() {
        return centers;
    }

    public void setCenters(List<Centers> centers) {
        this.centers = centers;
    }
    
    
    
    
}
