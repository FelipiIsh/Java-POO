package aula_7_jdbcConnection;

public class Teste {

	public static void main(String[] args) {

		UsuarioDAO dao = new UsuarioDAO();
		Usuario felipi = new Usuario(1, "Felipi", "ABC123");
		
		dao.insert(felipi);
		
		
	}

}
