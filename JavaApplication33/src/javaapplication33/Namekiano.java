/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.ArrayList;

/**
 *
 * @author Morella
 */
public class Namekiano extends Extraterrestre {

    public Namekiano(int energia) {
        super(energia);
        this.energia= energia;
        this.planeta="namekusei";
    }
    

    
    @Override
   
     public int comer(){
         this.energia = energia + 100*cantidadAliados(this.aliados) + 10;
         return energia;
    }
     
     public void agregarAliado(Personaje aliado){
         this.aliados.add(aliado);
}
}
