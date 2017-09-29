/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula07;

/**
 *
 * @author Danilo Abreu
 */
public class Gerente extends Funcionario{
    private int senha=123456;

    public Gerente(String nome) {
        super(nome);
    }
    
    @Override
     public double getBonificacao(){
        return super.getBonificacao()+1000;
    }
    

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    public boolean autenticar(int senha){
        return this.getSenha()==senha;
    }
}
