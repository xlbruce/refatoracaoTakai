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
import java.util.ArrayList;
import java.util.Collection;

public class Cliente {

    private String nome;
    private Collection<Aluguel> fitasAlugadas;
    private int pontosDeAlugadorFrequente;    
    double valorTotal;

    public Cliente(String nome) {
        this.nome = nome;
        fitasAlugadas = new ArrayList<>();
        pontosDeAlugadorFrequente = 0;
        valorTotal = 0;
    }
    
    public int getQtdeFitas() {
        return fitasAlugadas.size();
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }
    
    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        for (Aluguel f : fitasAlugadas) {
            double valorCorrente = 0.0;
            // determina valores para f linha
            // switch com enum
            switch (f.getFita().getCódigoDePreço()) {
                case NORMAL:
                    valorCorrente += 2;
                    if (f.getDiasAlugada() > 2) {
                        valorCorrente += (f.getDiasAlugada() - 2) * 1.5;
                    }
                    break;
                case LANCAMENTO:
                    valorCorrente += f.getDiasAlugada() * 3;
                    break;
                case INFANTIL:
                    valorCorrente += 1.5;
                    if (f.getDiasAlugada() > 3) {
                        valorCorrente += (f.getDiasAlugada() - 3) * 1.5;
                    }
                    break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2
            // dias
            if (f.getFita().getCódigoDePreço() == Fita.Tipo.LANCAMENTO
                    && f.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }
            // mostra valores para este aluguel
            resultado += "\t" + f.getFita().getTítulo() + "\t"
                    + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // for
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                + " pontos de alugador frequente";
        return resultado;
    }

    /*public void getPontos() {
    if (f.getFita().getCódigoDePreço() == Fita.Tipo.LANCAMENTO
    && f.getDiasAlugada() > 1) {
    pontosDeAlugadorFrequente++;
    }
    }*/
    
    /* extrato() {
        Criar string inicial
        calcular valor corrente //calculaValorCorrente()
        calcular os pontos de alugador frequente //calculaPontos()
        completar a string
    }
    */

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", fitasAlugadas=" + fitasAlugadas + ", pontosDeAlugadorFrequente=" + pontosDeAlugadorFrequente + '}';
    }
    
}