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
public class Terricola extends Personaje {
    
    public Terricola(int energia){
        super();
        this.energia = energia;
        this.planeta="tierra";
    }
    
 
    @Override
     public int comer(){
         this.energia = this.energia+100;
         return energia;
    }
}
