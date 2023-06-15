package aula_3;

import java.text.ParseException;
import java.util.Date;

public class TestaConta {

	public static void main(String[] args) throws ParseException {

		//objetos
		Cliente clienteFelipi = new Cliente("Felipi", "123456789", "123456789", "Rua 123 de oliveira, 4", "02/10/2004");
		Cliente clienteAdriane = new Cliente("Adriane", "987654321", "987654321", "Rua 321 de oliveira, 3", "20/05/1980");
		ContaCorrente contaFelipi = new ContaCorrente(clienteFelipi, 1, 1, "teste");
		ContaCorrente contaAdriane = new ContaCorrente(clienteAdriane, 2, 1, "teste");
		CDB cdb = new CDB();
		LCI lci = new LCI();
		LCA lca = new LCA();
		
		// simulações

		contaFelipi.depositar(10000);
		contaAdriane.depositar(20000);

		contaFelipi.exibirSaldo();
		contaAdriane.exibirSaldo();

		contaFelipi.sacar(5000);
		contaAdriane.sacar(10000);

		contaFelipi.exibirSaldo();
		contaAdriane.exibirSaldo();

		contaFelipi.transferir(contaAdriane, 1000);

		contaFelipi.exibirSaldo();
		contaAdriane.exibirSaldo();

		contaAdriane.transferir(contaFelipi, 1100);

		contaFelipi.exibirSaldo();
		contaAdriane.exibirSaldo();

		Conta.exibirContador();
		
		contaFelipi.investimento(lci, 1000);
		
		contaFelipi.exibirSaldo();
		
		System.out.println(contaFelipi);
		
		//

		
	}

}
