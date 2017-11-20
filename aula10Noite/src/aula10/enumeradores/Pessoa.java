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
public class Pessoa {
    private String nome;
    private TipoPessoa tipo;

    public Pessoa(String nome, TipoPessoa tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", tipo=" + tipo.getNome() + 
                ", numero="+tipo.getTipo()+'}';
    }

    
    
    public String getNome() {
        return nome;
    }

    public TipoPessoa getTipo() {
        return tipo;
    }
    
    
}
