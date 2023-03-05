package com.github.pessoas.dados;

public class Pessoa {

	private String nome;
	private int cpf;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getCpf(String cpf) {
		return 0;
	}

	public String getEndereco(String endereco) {
		return null;
	}

	public String getProfissao(String profissao) {
		return null;
	}

}
