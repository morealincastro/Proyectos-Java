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
public class Extraterrestre extends Personaje {
    int cantidadAliados;

    public int getCantidadAliados() {
        return cantidadAliados;
    }

    public void setCantidadAliados(int cantidadAliados) {
        this.cantidadAliados = cantidadAliados;
    }
    
    public Extraterrestre(int CantidadAliados){
        super();
        this.cantidadAliados = cantidadAliados;
    }
    
}
