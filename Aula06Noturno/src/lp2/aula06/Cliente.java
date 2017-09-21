/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula06;

/**
 *
 * @author Danilo Abreu
 */
public class Cliente {
    String nome, cpf;
    Cliente(){
    }
    Cliente(String nome){
        this.nome=nome;
    }
    Cliente(String nome, String cpf){
        this(nome);
        this.cpf=cpf;
    }
    void mudarNome(String nome){
        this.nome = nome;
    }
}
