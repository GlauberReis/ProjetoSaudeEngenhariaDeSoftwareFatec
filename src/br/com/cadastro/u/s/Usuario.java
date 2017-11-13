package br.com.cadastro.u.s;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
	private String cpf;
	private String senha;
	private String nome;
	private List<Exame> exames = new LinkedList<Exame>();
	private List<Vacina> vacinas = new LinkedList<Vacina>();
	private String restricoes;
	
	
	public Usuario(String cpf, String senha, String nome, String restricoes) {		
		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;
		this.restricoes = restricoes;
	}
	
	
	
	
	public String getCpf() {
		return cpf;
	}	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Vacina> getVacinas() {
		return vacinas;
	}
	public void setVacinas(List<Vacina> vacinas) {
		this.vacinas = vacinas;
	}
	public String getRestricoes() {
		return restricoes;
	}
	public void setRestricoes(String restricoes) {
		this.restricoes = restricoes;
	}
	public List<Exame> getExames() {
		return exames;
	}
	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}
	
	//método para adicionar exame
	public void addExame(Exame exame) {
		exames.add(exame);
	}
	
	
	//método para adicionar vacina
	public void addVacina(Vacina vacina) {
		vacinas.add(vacina);
	}
	

	
	

}
