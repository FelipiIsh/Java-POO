package aula_7_jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection conectar() {
		try {
			return DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL", "TM_Felipi_Ishida","021004");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
	
	}
	
	

}