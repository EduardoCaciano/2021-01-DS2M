package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		Conta contaDaAnaGomes = new Conta();
		Conta contaDoJoao = new Conta();
		
//		contaDaAnaGomes.setTitular("Ana Gomes");
		contaDaAnaGomes.setNumero("111-98");
		contaDaAnaGomes.setTipo("Poupan�a");
		contaDaAnaGomes.isAtiva(true);
		contaDaAnaGomes.setChequeEspecial(200);
		contaDaAnaGomes.depositar(100);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.depositar(30);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(50);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(500);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(50);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.sacar(80);
		contaDaAnaGomes.mostrarSaldoDaConta();
		contaDaAnaGomes.depositar(100);
		contaDaAnaGomes.mostrarSaldoDaConta();
		
		
		double a = contaDaAnaGomes.getSaldo();
		System.out.println("****" + contaDaAnaGomes.getSaldo());
		
//		System.out.println("Nome: " + contaDaAnaGomes.getTitular());
		System.out.println("Conta: " + contaDaAnaGomes.getNumero());
		System.out.println("Limite: " + contaDaAnaGomes.getChequeEspecial());
		
		Cliente cliente = new Cliente();
		cliente.setNome("Robson De Almeida");
		cliente.setCpf("45224-14552");
		cliente.setTelefone("(11) 98696-4639");
		cliente.setCep("06604-060");
	}
	

}
