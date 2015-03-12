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
        //Calcula o valor total dos alugueis
        for (Aluguel fitaAlugada : fitasAlugadas) {
            pontosDeAlugadorFrequente++;
            if (fitaAlugada.getFita().getCodigoDePreço() == Fita.Tipo.LANCAMENTO
                    && fitaAlugada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }
            resultado += "\t" + fitaAlugada.getFita().getTitulo() + "\t"
                    + fitaAlugada.calcula() + fimDeLinha;
            valorTotal += fitaAlugada.calcula();
        }
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                + " pontos de alugador frequente";
        return resultado;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", fitasAlugadas=" + fitasAlugadas + ", pontosDeAlugadorFrequente=" + pontosDeAlugadorFrequente + '}';
    }

}
