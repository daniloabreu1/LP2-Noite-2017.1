/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.lab02;

/**
 *
 * @author Danilo Abreu
 */
public class Partida {
    private Arbitro juizes[] = new Arbitro[5];
    int quantidadeArbitro=0;

    public Arbitro[] getJuizes() {
        return juizes;
    }

    public void setJuizes(Arbitro juizes) {
        this.juizes[this.quantidadeArbitro] = juizes;
        this.quantidadeArbitro++;
    }
    
    
}
