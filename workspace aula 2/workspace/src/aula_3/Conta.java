package aula_3;

import java.util.Date;
//ctrl + shift + o

public abstract class Conta {
	// abstract - proibe as instâncias da classe

	// atributos
	protected int numeroConta, agencia;
	protected String senhaTitular;
	protected Date dataAbertura;
	protected double saldo;
	protected Cliente cliente; // composição
	private static long contador;

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, String senhaTitular) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senhaTitular = senhaTitular;
		this.dataAbertura = new Date(System.currentTimeMillis());
		contador++;
	}

	// Métodos
	// sacar
	public boolean sacar(double valor) throws SaldoInsificiente{
		if (valor > 0) {
			if (this.saldo >= valor) {
				this.saldo -= valor;
				return true;
			}
		} else {
			throw new SaldoInsuficiente ();
		}
		return false;
	}

	// depositar

	public void depositar(double valor) {
		this.saldo += valor;
	}

	// consultarSaldo
	public abstract void exibirSaldo();

// transferir

	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
		}

	}

	public static void exibirContador() {

		System.out.println("Contas: " + contador);

	}

}

// consultar
