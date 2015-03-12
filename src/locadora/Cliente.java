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
    
    public Collection<Aluguel> getFitasAlugadas(){
        return this.fitasAlugadas;
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
            valorTotal += f.calculaExtrato();
            // Trata de pontos de alugador frequente
            getPontos(f);
            
            // Mostra valores para este aluguel
            resultado += "\t" + f.getFita().getTítulo() + "\t"
                    + f.calculaExtrato() + fimDeLinha;
        }
        
        // Adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        /*Neste caso, os pontos de aluguél são acumulativos, portanto criamos uma variável no cliente.
        Desta forma, o "pontosDeAlugadorFrequente" NÃO é uma variável temporária
        */
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                + " pontos de alugador frequente";
        return resultado;
    }
    
    public void getPontos(Aluguel f) {
        // adiciona bonus para aluguel de um lançamento por pelo menos 2
        // dias
        pontosDeAlugadorFrequente++;
        if (f.getFita().getCódigoDePreço() == Fita.Tipo.LANCAMENTO && f.getDiasAlugada() > 1) {
            pontosDeAlugadorFrequente++;
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", fitasAlugadas=" + fitasAlugadas + ", pontosDeAlugadorFrequente=" + pontosDeAlugadorFrequente + '}';
    }
    
}