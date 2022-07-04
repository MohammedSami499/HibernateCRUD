/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiber.compoundPk;

import hiber.Address;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Samy
 */
@Entity
public class Student implements Serializable {
    
    int id ;

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    private String name;
    //private CompPk compPk;
    
    List<Address> addList = new ArrayList<>();

    @ElementCollection
    @JoinTable(name = "addList" , joinColumns = @JoinColumn(name = "addlist_id"))
    @GenericGenerator(name = "increment" , strategy ="increment" )
    @CollectionId(columns = {@Column(name = "id")} , generator = "increment" , type = @Type(type = "int" ))
    public List<Address> getAddList() {
        return addList;
    }

    public void setAddList(List<Address> addList) {
        this.addList = addList;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //@Id
    //public CompPk getCompPk() {
    //    return compPk;
   // }

   // public void setCompPk(CompPk compPk) {
   //     this.compPk = compPk;
   // }
    
    
    
}
