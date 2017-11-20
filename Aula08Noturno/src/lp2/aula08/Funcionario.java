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
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome) {
        this.nome=nome;
    }
    
    public double getBonificacao(){
        return this.getSalario()*0.10;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + '}';
    }
    
    
}
