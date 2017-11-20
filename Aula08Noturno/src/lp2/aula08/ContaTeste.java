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
public class ContaTeste {

    public static void main(String args[]) {
        Gerente g1 = new Gerente("Joao");
        g1.setSalario(1000);
        g1.setCpf("111.222.333-44");
       // g1.setSenha(123456);
        
        System.out.println("nome: "+g1.getNome());
        System.out.println("CPF: "+g1.getCpf());
        System.out.println("Salario: "+g1.getSalario());
        System.out.println("Senha: "+g1.getSenha());
        System.out.println("Valida: "+g1.autenticar(123456));
        System.out.println("Bonificacao: "+g1.getBonificacao());
        
        Funcionario f = new Funcionario("Maria");
        f.setSalario(800);
        
        ControleBonificacao c = new ControleBonificacao();
        c.setTotalBonificacao(f);
        c.setTotalBonificacao(g1);
        System.out.println("Total de bonificacoes: "+c.getTotalBonificacao());
        System.out.println(f.toString());
        
    }
}
