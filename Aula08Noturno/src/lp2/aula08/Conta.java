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
public abstract class Conta {

    private double saldo;
    private int numero;
    private Cliente correntista;
    private Agencia agencia;
    private static int quantidade = 0;

    Conta() {
        quantidade++;
    }
    public abstract double gerarExtrato();
    
    public static int getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(int aQuantidade) {
        quantidade = aQuantidade;
    }

    void depositarValor(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Cliente correntista) {
        this.correntista = correntista;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static void zerarQuantidade() {
        setQuantidade(0);
    }
}
