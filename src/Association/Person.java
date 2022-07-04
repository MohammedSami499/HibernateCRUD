/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Association;

import java.awt.print.Book;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Samy
 */
@Entity
public class Person {
    private int id;
    private String name;
    private Books book;

    @OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }
    
    
    
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
    
    
}
