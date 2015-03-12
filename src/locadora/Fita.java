package locadora;

public class Fita {
    
    public enum Tipo {
        NORMAL, LANCAMENTO, INFANTIL
    };
    
    private String titulo;
    private Tipo códigoDePreço;
    
    public Fita(String título, Tipo códigoDePreço) {
        this.titulo = título;
        this.códigoDePreço = códigoDePreço;
    }
    public String getTitulo() {
        return titulo;
    }
    public Tipo getCodigoDePreço() {
        return códigoDePreço;
    }
    public void setCodigoDePreço(Tipo códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }

    @Override
    public String toString() {
        return "Fita{" + "t\u00edtulo=" + titulo + ", c\u00f3digoDePre\u00e7o=" + códigoDePreço + '}';
    }
    
    
}
