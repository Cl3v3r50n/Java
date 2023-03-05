package com.github.pessoas.dados.app;

import com.github.pessoas.dados.Pessoa;
import com.github.pessoas.dados.dados;

		public class App {
			
		    public static void main(String[] args) {
		    	
		        Pessoa pessoa = new Pessoa("Cleverson", 40);
		        String nome = pessoa.getNome();
		        int idade = pessoa.getIdade();
		        int cpf = pessoa.getCpf();
		        String endereco = pessoa.getEndereco();
		        String profissao = pessoa.getProfissao();
		        
		        System.out.println("Nome: " + nome);
		        System.out.println("Idade: " + idade);
		        System.out.println("cpf: " + cpf);
		        System.out.println("endereco: " + endereco);
		        System.out.println("profissao: " + profissao);
		    }
	
	}
