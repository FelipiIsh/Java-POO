package aula_2;

import java.util.Date;

public class TestaConta {

	public static void main(String[] args) {

		Cliente felipi = new Cliente("Felipi", "123456789", "123456789", "Rua 123 de oliveira, 4");
		Cliente adriane = new Cliente("Adriane", "987654321", "987654321", "Rua 321 de oliveira, 3");
		Conta contaFelipi = new Conta(felipi, 1, 1, "teste");
		Conta contaAdriane = new Conta(adriane, 2, 1, "teste");

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
		
		
	}

}
