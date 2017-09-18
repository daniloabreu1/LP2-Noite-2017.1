/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula05;

/**
 *
 * @author Danilo Abreu
 */
public class ContaTeste {

    public static void main(String args[]) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente("Maria");
        Cliente c3 = new Cliente("Marta","1111222003939");
        Agencia a = new Agencia();

        Conta conta1 = new Conta();
        conta1.numero = 123;
        conta1.limite = 250;
        conta1.saldo = 100;
        conta1.correntista = c1;
        conta1.agencia = a;

        conta1.agencia.numero = 1111;
        conta1.agencia.nome = "Centro";
        
        conta1.correntista.cpf = "111222233344";

        System.out.println("Cliente: " + conta1.correntista.nome);
        System.out.println("Saldo: " + conta1.saldo);
        conta1.depositarValor(200);
        System.out.println("Novo Saldo: " + conta1.saldo);
        System.out.println("Saldo+Limite: "+conta1.consultarSaldo());
    }
}
