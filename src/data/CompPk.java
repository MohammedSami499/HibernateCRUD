/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author Samy
 */
@Embeddable
public class CompPk implements Serializable  {
    
    private int id;
    private int val;

    public CompPk(int id, int val) {
        this.id = id;
        this.val = val;
    }

    public CompPk() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
    
}
