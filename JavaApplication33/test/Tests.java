/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javaapplication33.Banquete;
import javaapplication33.Namekiano;
import javaapplication33.Personaje;
import javaapplication33.Saiyajin;
import javaapplication33.Terricola;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Morella
 */
public class Tests {
    
    public Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    @Test
     public void TerricolaComer() {
         Terricola terricola = new Terricola(10);
         int totalEsperado = 110;
         int total = terricola.comer();
         
         Assert.assertEquals(totalEsperado, total);
     }
     
     @Test
          public void NamekianoComer() {
         Namekiano namekiano = new Namekiano(10);
         Namekiano nameki = new Namekiano(0);
         Namekiano name  = new Namekiano(0);
         namekiano.agregarAliado(nameki);
         namekiano.agregarAliado(name);
         int totalEsperado = 220;
         int total = namekiano.comer();
         
         Assert.assertEquals(totalEsperado, total);
     }
          
         @Test
          public void SaiyajinComer() {
         Saiyajin sai = new Saiyajin(10);
          Namekiano nameki = new Namekiano(0);
          sai.agregarAliado(nameki);
         int totalEsperado = 220;
         int total = sai.comer();
         
         Assert.assertEquals(totalEsperado, total);
     }
       @Test 
public void testbanquete(){
    Banquete banquete = new Banquete();

    Saiyajin goku = new Saiyajin(0);
    Terricola krilin = new Terricola(0);//200
    Namekiano picollo = new Namekiano(0);
    Saiyajin veggeta = new Saiyajin(0);

    //410
    goku.agregarAliado(veggeta);
    goku.agregarAliado(picollo);

    //410
    veggeta.agregarAliado(goku);
    veggeta.agregarAliado(picollo);

    //210
    picollo.agregarAliado(goku);
    picollo.agregarAliado(krilin);


    banquete.agregarInvitado(goku);
    banquete.agregarInvitado(krilin);
    banquete.agregarInvitado(picollo);
    banquete.agregarInvitado(veggeta);
    

    int energiaTotalEsperada = 1230;
    banquete.iniciar();
    int energiaTotal = banquete.getEnergiaTotalObtenida();

    Assert.assertEquals(energiaTotalEsperada,energiaTotal);

}
}
