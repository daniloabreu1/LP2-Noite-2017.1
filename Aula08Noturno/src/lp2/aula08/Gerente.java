/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula08;

/**
 *
 * @author Danilo Abreu
 */
public class Gerente extends Funcionario implements Autenticavel{
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

    @Override
    public boolean autentica(int senha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
