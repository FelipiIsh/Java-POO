package aula_3;


public class ContaCorrente extends Conta {
	
	private double saldoInvestimento;
	
	public ContaCorrente(Cliente cliente, int numeroConta, int agencia, String senhaTitular) {
		super(cliente, numeroConta, agencia, senhaTitular);
		// TODO Auto-generated constructor stub
	}
	
	public void resgatar(double valor) {
		if (this.saldoInvestimento >= valor) {
			this.saldoInvestimento -= valor;
			this.depositar(valor);
		}
	}

	@Override
	public void exibirSaldo() {
			double saldoTotal = this.saldo + this.saldoInvestimento;
			System.out.println("Cliente: " + this.cliente.getNomeTitular());
			System.out.println("Data de abertura: " + this.dataAbertura);
			System.out.println("Saldo conta corrente: R$ " + this.saldo);
			System.out.println("Saldo investimento: R$ " + this.saldoInvestimento);
			System.out.println("Saldo total: R$ " + saldoTotal + "/n");
		}
		
	
	// design pattern strategy
	public void investimento(Produto produto, double valor) {
		boolean teste = this.sacar(valor);
		if(teste == true) {
			this.saldoInvestimento += produto.investir(valor);
		}
		
	}
	
	
	
	
	}
	
	
	
	


