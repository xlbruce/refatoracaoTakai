/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package locadora;

/**
 *
 * @author 31409695
 */
public class Locadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente("Gilson");
        Fita f1 = new Fita("Filme 01", Fita.Tipo.NORMAL);
        Fita f2 = new Fita("Filme 02", Fita.Tipo.NORMAL);
        Aluguel aluguel1 = new Aluguel(f1, 1);
        Aluguel aluguel2 = new Aluguel(f2, 1);
        c.adicionaAluguel(aluguel1);
        c.adicionaAluguel(aluguel2);
        System.out.println(c.extrato());
    }
    
}
