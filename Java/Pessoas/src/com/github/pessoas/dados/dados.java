package com.github.pessoas.dados;

public class dados {
	//Atributos
    private String endereco;
    private String profissao;
    
    //construtor
	public dados(String nome, int idade, int cpf, String endereco, String profissao) {
		this.endereco = endereco;
		this.profissao = profissao;
	}
	//getters e setters
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

}
