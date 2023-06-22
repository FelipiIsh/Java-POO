package aula_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<String>();
		lista.add("Pedro");
//		lista.add("Joao");
		lista.add("Maria");
//		lista.add("Marcos");
//		lista.add("Anna");
		lista.add("Jose");
//		lista.add("Pedro II");

		List<Usuario> list = new ArrayList<Usuario>();
		Usuario jose = new Usuario("Jose", "123");
		Usuario maria = new Usuario("Maria", "123");
		Usuario pedro = new Usuario("Pedro", "123");
		list.add(jose);
		list.add(maria);
		list.add(pedro);
		
		for(Usuario usuario: list) {
			System.out.println("Nome: " + usuario);
			System.out.println("---------");
		
		}
		
		for (String usuario : lista) {
			System.out.println("Nome: " + usuario);
			System.out.println("---------");
		}
		
		
		
//		public List<Usuario> remover(String nome) {
//			Iterator<Usuario> iterator = list.iterator();
//			while (iterator.hasNext()) {
//				Usuario usuario = iterator.next();
//				if (usuario.getNome() == nome) {
//					iterator.remove();
//				}
//				}
//			return list;
//			}
//		
//		listaAtualizada = test.remover("Pedro");
//		for (Usuario user : ListaAtualizada) {
//			System.out.println(user.getNome());
//		
//		}
//		
//		
		
	}
}