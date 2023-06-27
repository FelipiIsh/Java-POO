package aulaCollections.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {

		//objetos tipo Usuario
		Usuario felipi = new Usuario(1, "Felipi", "abc");
		Usuario isabelle = new Usuario(2, "Isabelle", "abc");
		Usuario guilherme = new Usuario(3, "Guilherme", "abc");
		Usuario ikram = new Usuario(4, "Ikram", "abc");
		Usuario jose = new Usuario(5, "Jose", "abc");
		
		//Collection (lista de usuarios)
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		//adicionando objetos Usuario a lista de usuario
		listaUsuarios.add(jose);
		listaUsuarios.add(ikram);
		listaUsuarios.add(guilherme);
		listaUsuarios.add(isabelle);
		listaUsuarios.add(felipi);

		//iterando a lista 
		for(Usuario usuario: listaUsuarios) {
			System.out.println("id: " + usuario.getIdUsuario() + " --- Nome: " + usuario.getNome());
		}

		//ordenar a lista conforme regra definida no compareTo
		Collections.sort(listaUsuarios);
		
		System.out.println("-------------------------");
		
		//iterando a lista ordenada
		
		for(Usuario usuario: listaUsuarios) {
			System.out.println("id: " + usuario.getIdUsuario() + " --- Nome: " + usuario.getNome());
		}
		
		System.out.println("---------------");
		
		Map mapa = new HashMap();

		mapa.put(felipi, felipi);

		Object objeto = mapa.get(felipi);
		Usuario usuario = (Usuario) objeto;
		System.out.println(usuario.getNome());
		
	}

}
