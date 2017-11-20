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
public class TestePessoa {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Joao", TipoPessoa.PESSOA_FISICA);
        System.out.println(p);
        String nome = "maria";
        System.out.println(nome.toUpperCase());
        System.out.println(nome);
    }
    
}
