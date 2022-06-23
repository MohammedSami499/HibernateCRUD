/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samiapp;


/**
 *
 * @author Mohammmed Sami
 */
public class SamiApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Crud crud = new Crud();
        //crud.select();
        
//        PojoData pojo = new PojoData();
//        pojo.setId(4);
//        pojo.setName("Omar Ayman");
//        pojo.setAge("25");
//        pojo.setEmail("omarAyamn123@gmail.com");
//        pojo.setPhone("01154879621");
//        
//        crud.update(pojo);
        
        PojoData pojo = crud.select(8);
        crud.delete(pojo);
        
    }
    
}
