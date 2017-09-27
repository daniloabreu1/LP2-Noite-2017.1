package lab01.teste;

import lab01.classes.Janelas;
import lab01.classes.Quarto;

/**
 *
 * @author Danilo Abreu
 */
public class Lab01Teste {

    public static void main(String[] args) {
        //criando o quarto
        Quarto quarto = new Quarto("branco");
        //adicionando janelas ao quarto
        quarto.setJanela1(new Janelas(2.0, 2.0));
        quarto.setJanela2(new Janelas(0.70, 0.35));
        //pintando as janelas
        quarto.getJanela1().pintar("Azul");
        quarto.getJanela2().pintar("Verde");
        //abrindo e fechando as janelas
        quarto.getJanela1().abrir();
        quarto.getJanela2().fechar();
        //mostrando informações do quarto e das janelas
        System.out.println("Cor do Quarto: "+quarto.getCor());
        System.out.println("janela 1");
        System.out.println("Cor: "+quarto.getJanela1().getCor());
        System.out.println("Dimensões: "+quarto.getJanela1().getDimX()+" , "+quarto.getJanela1().getDimY());
        System.out.println("janela 2");
        System.out.println("Cor: "+quarto.getJanela2().getCor());
        System.out.println("Dimensões: "+quarto.getJanela2().getDimX()+" , "+quarto.getJanela2().getDimY());
        //verificando quando estão abertas
        System.out.println("Janelas abertas: "+quarto.quantasJanelasAbertas());
    }
    
}
