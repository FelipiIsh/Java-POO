package aula_6;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Usuario  {

	private int id;
	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private Date dataCadastro;
	private static List<Usuario> list = new ArrayList<Usuario>();

	// Construtores
	public Usuario(String nome, String senha) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.dataCadastro = new Date();
	}

//Iterator
	
	public List<Usuario> remover(String nome) {
		Iterator<Usuario> iterator = list.iterator();
		while (iterator.hasNext()) {
			Usuario usuario = iterator.next();
			if (usuario.getNome() == nome) {
				iterator.remove();
			}
			}
		return list;
		}
	
//	listaAtualizada = test.remover("Pedro");
//	for (Usuario user : ListaAtualizada) {
//		System.out.println(user.getNome());
//	
//	}
//	

	
	
	// Getter e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public static void main(String[] args) {

		Usuario usuarios[] = new Usuario[2];
		usuarios[0] = new Usuario("Jose", "root");
		usuarios[1] = new Usuario("Maria", "root");

//	for (int i = 0; i < usuarios.length; i++) {
//			System.out.println(usuario[i].getNome());
//		}

		for(Usuario usuario: usuarios) {
		System.out.println("Nome: " + usuario.getNome());
		System.out.println("Data de cadastro: " + usuario.getDataCadastro());
		System.out.println("---------");
	}
	
}
}


