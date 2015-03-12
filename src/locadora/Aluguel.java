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
    
    public double calcula() {
        double valorCorrente = 0;
        switch (this.getFita().getCodigoDePreço()) {
            case NORMAL:
                valorCorrente += 2;
                if (this.getDiasAlugada() > 2) {
                    valorCorrente += (this.getDiasAlugada() - 2) * 1.5;
                }
                break;
            case LANCAMENTO:
                valorCorrente += this.getDiasAlugada() * 3;
                break;
            case INFANTIL:
                valorCorrente += 1.5;
                if (this.getDiasAlugada() > 3) {
                    valorCorrente += (this.getDiasAlugada() - 3) * 1.5;
                }
                break;
        }
        return valorCorrente;
    }

    @Override
    public String toString() {
        return "Aluguel{" + "fita=" + fita + ", diasAlugada=" + diasAlugada + '}';
    }
    
}

