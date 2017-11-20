/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10.enumeradores;

/**
 *
 * @author Danilo Abreu
 */
public enum TipoPessoa {
    PESSOA_FISICA(1,"Pessoa Física"), PESSOA_JURIDICA(2,"Pessoa Jurídica");
    
    private int tipo;
    private String nome;
    private TipoPessoa(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getTipo() {
        return tipo;
    }
    
}
