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

    public double calculaExtrato() {
        double valorCorrente = 0.0;
        // switch com enum
        switch (fita.getCódigoDePreço()) {
            case NORMAL:
                valorCorrente += 2;
                if (diasAlugada > 2) {
                    valorCorrente += (diasAlugada - 2) * 1.5;
                }
                break;
            case LANCAMENTO:
                valorCorrente += diasAlugada * 3;
                break;
            case INFANTIL:
                valorCorrente += 1.5;
                if (diasAlugada > 3) {
                    valorCorrente += (diasAlugada - 3) * 1.5;
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
