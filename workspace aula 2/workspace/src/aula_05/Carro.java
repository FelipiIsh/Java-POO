package aula_05;

public class Carro {

	private String cor;
	private double velocimetro;
	private boolean estaLigado;
	private double qtdTanque;
	private double rendimentoTotal;
	
	public void abastecimento(Combustivel comb, double qtd) {
		if(qtdTanque + qtd <= 50) {
			qtdTanque += qtd;
			rendimentoTotal += comb.abastecer(qtd);
		}
		
		
		
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getVelocimetro() {
		return velocimetro;
	}

	public void setVelocimetro(double velocimetro) {
		this.velocimetro = velocimetro;
	}

	public boolean isEstaLigado() {
		return estaLigado;
	}

	public void setEstaLigado(boolean estaLigado) {
		this.estaLigado = estaLigado;
	}

	public double getQtdTanque() {
		return qtdTanque;
	}

	public void setQtdTanque(double qtdTanque) {
		this.qtdTanque = qtdTanque;
	}

	public double getRendimentoTotal() {
		return rendimentoTotal;
	}

	public void setRendimentoTotal(double rendimentoTotal) {
		this.rendimentoTotal = rendimentoTotal;
	}
	
}
