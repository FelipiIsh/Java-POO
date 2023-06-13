package aula_2;

import java.util.Date;
//ctrl + shift + o

public class Conta {

	// atributos
	private int numeroConta, agencia;
	private String senhaTitular;
	private Date dataAbertura;
	private double saldo;
	private Cliente cliente; // composição

	// construtor
	public Conta(Cliente cliente, int numeroConta, int agencia, 
			String senhaTitular) {
		this.cliente = cliente;
		this.numeroConta = numeroConta;
		this.agencia = agencia;
		this.senhaTitular = senhaTitular;
		this.dataAbertura = new Date(System.currentTimeMillis());
		System.out.println("Objeto conta criado");
	}

	// Métodos
	// sacar
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// depositar

	public void depositar(double valor) {
		this.saldo += valor;
	}

	// consultarSaldo
	public void exibirSaldo() {
		System.out.println(this.cliente.getNomeTitular() + " - Saldo: " + this.saldo);
	}

// transferir
	
	public void transferir(Conta conta, double valor) {
		boolean teste = this.sacar(valor);
		if(teste==true) {
		conta.depositar(valor);
	}
	}

// consultar

}
