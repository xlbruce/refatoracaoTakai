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
public class AluguelTest {
    
    public AluguelTest() {
    }

    @Test
    public void testGetFita() {
        System.out.println("getFita");
        Fita f = new Fita("Fita 01", Fita.Tipo.INFANTIL);
        Aluguel instance = new Aluguel(f, 1);
        Fita expResult = f;
        Fita result = instance.getFita();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetDiasAlugada() {
        System.out.println("getDiasAlugada");
        Fita f = new Fita("Fita 01", Fita.Tipo.INFANTIL);
        Aluguel instance = new Aluguel(f, 10);
        int expResult = 10;
        int result = instance.getDiasAlugada();
        assertEquals(expResult, result);
    }
    
}
