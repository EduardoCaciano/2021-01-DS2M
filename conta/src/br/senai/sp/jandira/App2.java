package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App2 {

	public static void main(String[] args) {
		
//		Cria��o do Cliente
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro �vares Cabral");
		pedro.setCpf("45424542245");
		pedro.setTelefone("(11) 98696-4639");
		pedro.setCep("06604-060");
		
//		Criar da conta do Pedro
		Conta contaPedro = new Conta();
		contaPedro.setTitular(pedro);
		contaPedro.depositar(100);
		contaPedro.setNumero("2222-2");
		
		System.out.println(contaPedro.getTitular().getTelefone());
		contaPedro.getTitular().setNome("Pedro da Silva");
		System.out.println(contaPedro.getTitular().getNome());
		System.out.println(pedro.getNome());
	}

}
