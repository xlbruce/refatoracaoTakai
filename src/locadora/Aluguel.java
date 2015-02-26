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
public class Aluguel {
    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }
    public Fita getFita() {
        return fita;
    }
    public int getDiasAlugada() {
        return diasAlugada;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "fita=" + fita + ", diasAlugada=" + diasAlugada + '}';
    }
    
}

