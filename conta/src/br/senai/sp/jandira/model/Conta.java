package br.senai.sp.jandira.model;

public class Conta {
	
	private String tipo;
	private double saldo;
	private String numero;
	private Cliente titular;
	private boolean ativa;
	private double chequeEspecial;
	
	public void setTipo(String tipo) {	
		if (tipo.equals("Corrente") || tipo.equals("Poupan�a")) {
			this.tipo = tipo;
		} else {
			System.out.println("Tipo inv�lido!!");
		}	
	}
	public String getTipo() {
		return this.tipo;
	}
	
	
	
	
	
	public void mostrarSaldoDaConta() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Saldo + Limite: " + (saldo + chequeEspecial));
	}
	public double getSaldo(){
		return saldo;
	}
	
	
	
	
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return this.numero;
	}

	
	
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public Cliente getTitular() {
		return this.titular;
	}
	
	
	
	
	
	public void isAtiva(boolean ativa) {
		this.ativa = ativa;
	}
//	public void isAtiva(boolean ativa) {
//		this.ativa = ativa;
//	}
	public boolean getAtiva() {
		return this.ativa;
	}
	
	
	
	
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	public double getChequeEspecial() {
		return this.chequeEspecial;
	}
	

		
	
	
	public void depositar(double valorDeposito) {
		if (valorDeposito < 0) {
			System.out.println("Valor inv�lido!!!");
		} else {
			saldo += valorDeposito;
		}
		
	}
	
	
	
	
	
	public void sacar(double valorDoSaque) {
		
		if ((saldo + chequeEspecial) >= valorDoSaque) {
			saldo -= valorDoSaque;
		} else {
			System.out.println("Saldo insuficiente!");
		}
		
		
	}
	
	
	
	
	
	public void transferir() {
		
	}

}
