package br.com.cadastro.u.s;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.List;
import org.junit.Test;



public class Teste {

	@Test
	public void test() {
		Modelo modelo = new Modelo();
		
		assertEquals(modelo.getUsuarios().size(), 0);
		
		Usuario usuario1 = new Usuario("383.883.981-06", "123123", "João do Teste", "salicilamida");
		
			
		//testes para cadastrar usuarios
		modelo.cadastrarUsuario(usuario1);
		
		assertEquals(modelo.getUsuarios().size(), 1);
		
		modelo.cadastrarUsuario(new Usuario("303.093.611-06", "129345341", "Zezinho", null));		
		
		
		// testes para requisito funcional cadastrarUsuario
		assertEquals(modelo.getUsuarios().size(), 2); //continuar aqui
		assertEquals(modelo.getUsuarios().get(0).getCpf(), "383.883.981-06"); 
		assertEquals(modelo.getUsuarios().get(1).getNome(), "Zezinho");			
		
		//verificar se nome de usuário de diferente de outro
		assertTrue(modelo.getUsuarios().get(0) != modelo.getUsuarios().get(1));
		
		//testes para cadastrar administradores
		modelo.cadastrarAdministrador(new Administrador("Carlos Administrador", "285.938.477-84"));
		modelo.cadastrarAdministrador(new Administrador("Administrador suplente", "183.358.247-04"));
		//testes para requisito funcional cadastrarAdministrador
		assertEquals(modelo.getAdministradors().get(0).getCpf(),"285.938.477-84");
		assertEquals(modelo.getAdministradors().get(1).getNome(),"Administrador suplente");
		
		
		
		//teste para verificar exame cadastrado
		
		assertEquals(modelo.buscarUsuario("383.883.981-06").getNome(),"João do Teste");
		
		//teste para verificar cadastrarExame
		Exame exame = new Exame("positivo", LocalDate.now());
		modelo.cadastrarExame("383.883.981-06", exame);
		assertEquals(modelo.getUsuarios().get(0).getExames().get(0).getResultadoExame(),"positivo");
		assertEquals(usuario1.getExames().get(0).getResultadoExame(),"positivo");
		
		//testes para o requisito funcional
		//continuar testes aqui
		
	}

}





//anotar no código dos testes a técnica ex:
	//classes de equivalência
	//análise de valor limite

//ex:
	//-5 |________________|________________|______|________|_______________|___________|      fora 115
	//   0                16               21     70       85              91          100
	





