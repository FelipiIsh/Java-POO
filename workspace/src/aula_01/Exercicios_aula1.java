package aula_01;
import java.util.Scanner;

public class Exercicios_aula1 {

	public static void main(String[] args) {
		//Exercício 1
		/*
				System.out.println("Digite o valor da doação: ");
				
				Scanner sc1 = new Scanner(System.in);
				
				double doacao = sc1.nextDouble();
				
				//double doacao = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da doação");
				
				double investimento;
				
				if (doacao < 1000.00) {
					investimento = 0.05 * doacao;
				} else {
					investimento = 0.15 * doacao;
				}
				
				System.out.println(investimento);
				
				sc1.close();
				*/
				
				//Exercicio 2
				
			System.out.println("Digite a idade: ");
			
			Scanner sc2 = new Scanner(System.in);
			
			float idade = sc2.nextFloat();
			
			if (idade < 16) {
				System.out.println("Não podem votar e nem embarcar");
			} else if (idade >= 16 && idade <= 17) {
				System.out.println("Podem optar por votar");
			} else if (idade >= 18) {
				System.out.println("Devem obrigatoriamente votar");
			}
			
			sc2.close();
				
	}

}
