package locadora;

public class Fita {
    
    public enum Tipo {
        NORMAL, LANCAMENTO, INFANTIL
    };
    
    private String título;
    private Tipo códigoDePreço;
    
    public Fita(String título, Tipo códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
    }
    public String getTítulo() {
        return título;
    }
    public Tipo getCódigoDePreço() {
        return códigoDePreço;
    }
    public void setCódigoDePreço(Tipo códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }

    @Override
    public String toString() {
        return "Fita{" + "t\u00edtulo=" + título + ", c\u00f3digoDePre\u00e7o=" + códigoDePreço + '}';
    }
    
    
}
