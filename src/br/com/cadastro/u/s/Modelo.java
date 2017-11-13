package br.com.cadastro.u.s;

import java.util.LinkedList;
import java.util.List;

public class Modelo {
	
	private List<Usuario> usuarios = new LinkedList<Usuario>();	
	private List<Administrador> administradores = new LinkedList<Administrador>();

	
	public void cadastrarUsuario(Usuario usuario) {
		usuarios.add(usuario);
		
	}
	
	public void cadastrarAdministrador(Administrador administrador) {
		administradores.add(administrador);
	}
	//teste
	
	
	
	//public void cadastrarExame
	public void cadastrarExame(String cpf, Exame exame) {// método cadastrar exame passando parâmetro cpf e exame
		Usuario u = buscarUsuario(cpf);
		if(u.equals(null)) {
			
		} else {
			u.addExame(exame); 
		}
		
	
	}
	
	public Usuario buscarUsuario(String cpf) {
		for(Usuario u: usuarios ) { // for each em java
			if(cpf.equals(u.getCpf())) {
				return u;
			}
					
		}
		return null;
	}
	
	
//
	
	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}
	
	public List<Administrador> getAdministradors() {
		return this.administradores;
	}
	

	
	
	

}




