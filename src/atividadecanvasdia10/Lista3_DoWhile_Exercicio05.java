package atividadecanvasdia10;

import java.util.Scanner;

public class Lista3_DoWhile_Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int numero;
	        int somaPositivos = 0;

	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero > 0) {
	                somaPositivos += numero;
	            }

	        } while (numero != 0);

	        System.out.println("A soma dos números positivos é: " + somaPositivos);

	        scanner.close();
	    }
	}

