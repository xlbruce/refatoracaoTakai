/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31409695
 */
public class FitaTest {
    
    public FitaTest() {
    }

    @Test
    public void testGetTítulo() {
        System.out.println("getT\u00edtulo");
        Fita instance = new Fita("Fita 01", Fita.Tipo.NORMAL);
        String expResult = "Fita 01";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetCodigoDePreço() {
        System.out.println("getC\u00f3digoDePre\u00e7o");
        Fita instance = new Fita("Fita 01", Fita.Tipo.INFANTIL);
        Fita.Tipo expResult = Fita.Tipo.INFANTIL;
        Fita.Tipo result = instance.getCodigoDePreço();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetCodigoDePreço() {
        System.out.println("setC\u00f3digoDePre\u00e7o");
        Fita.Tipo códigoDePreço = Fita.Tipo.LANCAMENTO;
        Fita instance = new Fita("Fita 01", Fita.Tipo.INFANTIL);
        instance.setCodigoDePreço(códigoDePreço);
        assertEquals(códigoDePreço, instance.getCodigoDePreço());
    }

        
}
