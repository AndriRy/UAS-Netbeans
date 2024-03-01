/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizpolymorphisme;

/**
 *
 * @author User
 */
public class QuizPolymorphisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Benda be= new Benda();
        
        Bola bo = new Bola();
        Meja me= new Meja();
        Kubus ku= new Kubus();
        Drum dr = new Drum();
        
        be.tampilBentuk();
        bo.tampilBentuk();
        me.tampilBentuk();
        ku.tampilBentuk();
        dr.tampilBentuk();
        
    }  
}
