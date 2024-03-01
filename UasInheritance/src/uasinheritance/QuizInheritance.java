/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quizinheritance;

/**
 *
 * @author User
 */
public class QuizInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    HeroMobileLegends a= new HeroMobileLegends();
    a.setGatotKaca(7);
    a.setKadita(3);
    System.out.println("");
    System.out.println("Contoh Program Game");
    System.out.println("");
    System.out.println("Superclass HeroMobileLegends");
    System.out.println(" GatotKaca : "+a.getGatotKaca());
    System.out.println(" Kadita : "+a.getKadita());
    System.out.println(" Hero :"+a.Hero());
    System.out.println("");
    
    SkillKarakter s= new SkillKarakter();
    s.setGatotKaca(3);
    s.setKadita(4);
    s.setTank(5);
    System.out.println("Superclass SkillKarakter");
    System.out.println(" GatotKaca :"+s.getGatotKaca());
    System.out.println(" Kadita :"+s.getKadita());
    System.out.println(" Tank :"+s.getTank());
    System.out.println(" Role :"+s.Role());
    }

}
