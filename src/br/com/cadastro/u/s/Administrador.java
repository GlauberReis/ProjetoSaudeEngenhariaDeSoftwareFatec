package br.com.cadastro.u.s;

public class Administrador {
	private String nome,cpf;
	private int ok;
	private double teste = 5.6;
	
	
	

	public Administrador(String nome, String cpf) {		
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	
	
	
	

}
