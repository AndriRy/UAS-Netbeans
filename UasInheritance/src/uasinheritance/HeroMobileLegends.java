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
public class HeroMobileLegends {
    private int GatotKaca;
    private int Kadita;
    public void setGatotKaca(int g){
    GatotKaca=g;
    }
    public void setKadita(int k){
    Kadita=k;
    }
    public int getGatotKaca(){
    return GatotKaca;
    }
    public int getKadita(){
    return Kadita;
    }
    public int Hero(){
    int Hero=GatotKaca*Kadita;
    return Hero;
    }
    
}
