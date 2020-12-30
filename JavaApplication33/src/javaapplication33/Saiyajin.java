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
public class Saiyajin extends Extraterrestre {
    
        public Saiyajin (int energia, int cantidadAliados) {
        super(energia);
        this.energia= energia;
        this.planeta = "vegueta";
        this.cantidadAliados=cantidadAliados;
    }
        
      @Override
     public int comer(){
         this.energia = (energia + (100*this.cantidadAliados))*2;
         return energia;
    }
}
