/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Morella
 */
public class Banquete {
    ArrayList<Personaje> invitados = new ArrayList();
    int energiaTotalObtenida;
    
    
    public void agregarInvitado(Personaje personaje){
        invitados.add(personaje);
    }
    
    public void iniciar(){
        for (Personaje invitado : invitados){
            invitado.comer();
            this.energiaTotalObtenida = this.energiaTotalObtenida + invitado.energia;
        }
    }
    
   public int getEnergiaTotalObtenida(){
       return energiaTotalObtenida;
   }
}
