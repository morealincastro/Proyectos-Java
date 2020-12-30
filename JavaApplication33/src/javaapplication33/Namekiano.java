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
public class Namekiano extends Extraterrestre {

    public Namekiano(int energia, int cantidadAliados) {
        super(energia);
        this.energia= energia;
        this.planeta="namekusei";
        this.cantidadAliados=cantidadAliados;
    }
    
    @Override
    
    
     public int comer(){
         this.energia = energia + 100*this.cantidadAliados + 10;
         return energia;
    }
}
