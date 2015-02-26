/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;
import locadora.*;

/**
 *
 * @author 31409695
 */
public class ClienteTest {
    
    @Test
    public void getNomeTest() {
        Cliente c = new Cliente("Gilson");
        assertEquals("Gilson", c.getNome());
    }
    
    @Test
    public void adicionaAluguelTest() {
        Cliente c = new Cliente("Gilson");
        c.adicionaAluguel(new Aluguel(new Fita("Filme1", Fita.Tipo.INFANTIL), 1));
        assertEquals(1, c.getQtdeFitas());
    }
}
