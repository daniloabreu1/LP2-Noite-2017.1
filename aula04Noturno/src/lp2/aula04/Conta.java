/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula04;

/**
 *
 * @author Danilo Abreu
 */
public class Conta {
    double saldo, limite=250;
    int numero;
    Cliente correntista;
    Agencia agencia;
    void depositarValor(double valor){
        this.saldo+=valor;
    }
    double consultarSaldo(){
        return this.saldo+this.limite;
    }
}
