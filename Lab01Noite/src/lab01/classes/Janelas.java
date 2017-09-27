package lab01.classes;

/**
 *
 * @author Danilo Abreu
 */
public class Janelas {

    //atributos
    private boolean aberta;
    private String cor;
    private double dimX;
    private double dimY;

    //Construtor estar público pois a classe de teste está em outro pacote
    public Janelas(double dimX, double dimY) {
        this.dimX = dimX;
        this.dimY = dimY;
    }

    //métodos
    public void abrir() {
        this.setAberta(true);
    }

    public void fechar() {
        this.setAberta(false);
    }
    //método colocado como protected para que apenas quem está no pacote possa utilizá-lo
    protected boolean estarAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public double getDimX() {
        return dimX;
    }

    public void setDimX(double dimX) {
        this.dimX = dimX;
    }

    public double getDimY() {
        return dimY;
    }

    public void setDimY(double dimY) {
        this.dimY = dimY;
    }

}
