package br.com.fiap.test;

import java.util.List;

import br.com.fiap.model.Usuario;
import br.com.fiap.repository.UsuarioDAO;

public class Teste {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario felipi = new Usuario("Felipi", "ABC123");
		Usuario pedro = new Usuario("Pedro", "123");
		
//		dao.insert(felipi);
//		dao.insert(pedro);
		List<Usuario> usuarios = dao.selectAll();
		
		//select
//		for (Usuario usuario : usuarios) {
//			System.out.println("ID: " + usuario.getId());
//			System.out.println("Nome: " + usuario.getNome());
//			System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
//		}
//		
//		System.out.println("----------------------------");
//		
//		//selectById
//		
//		Usuario usuario = dao.selectById(1);
//		System.out.println(usuario.getId());
//		System.out.println(usuario.getNome());
//		System.out.println(usuario.getDataCadastro());
//		
		
//	System.out.println("----------------------------");
//
//		
		//delete
//		List<Usuario> usuarios = dao.selectAll();
//	
//		dao.delete(1);
//		for (Usuario usuario : usuarios) {
//			System.out.println("ID: " + usuario.getId());
//			System.out.println("Nome: " + usuario.getNome());
//			System.out.println("Data de Cadastro: " + usuario.getDataCadastro());
//		}
		
		
		//update
		
//		Usuario usuario = dao.selectById(2);
//		usuario.setNome("Isabelle");
//		usuario.setSenha("xyz");
//		dao.update(usuario);
		
		
	}
}


