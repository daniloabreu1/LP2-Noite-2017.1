package lab01.classes;

/**
 *
 * @author Danilo Abreu
 */
public class Quarto {
    //Atributos
    private String cor;
    private Janelas janela1;
    private Janelas janela2;
    
    //Construtor estar público pois a classe de teste está em outro pacote
    public Quarto(String cor){
        this.cor=cor;
    }

    //Métodos
    public int quantasJanelasAbertas(){
        int quantidade = 0;
        if (this.getJanela1().estarAberta()) {
            quantidade++;
        }
        if (this.getJanela2().estarAberta()) {
            quantidade++;
        }

        return quantidade;
    }
    
    public String getCor() {
        return cor;
    }

    public void pintar(String cor) {
        this.cor = cor;
    }

    public Janelas getJanela1() {
        return janela1;
    }

    public void setJanela1(Janelas janela1) {
        this.janela1 = janela1;
    }

    public Janelas getJanela2() {
        return janela2;
    }

    public void setJanela2(Janelas janela2) {
        this.janela2 = janela2;
    }
    
    
}
