/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

/**
 *
 * @author Morella
 */
public abstract class Personaje {
    int energia;
    String planeta; 
    
    public Personaje(){
        this.energia = energia;
        this.planeta = planeta;
    }
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }
    
    
    
    
    public int comer(){
        return energia;
    }
}
