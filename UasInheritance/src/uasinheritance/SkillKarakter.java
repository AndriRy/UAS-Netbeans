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
public class SkillKarakter extends HeroMobileLegends{
    private int tank;
    public void setTank(int t){
    tank=t;
    }
    public int getTank(){
    return tank;
    }
    public int Role(){
    int r=getGatotKaca()* getKadita()*tank;
    return r;
    }
}
