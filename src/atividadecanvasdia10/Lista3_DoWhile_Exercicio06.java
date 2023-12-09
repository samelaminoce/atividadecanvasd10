package atividadecanvasdia10;

import java.util.Scanner;

public class Lista3_DoWhile_Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        int numero;
	        int somaMultiplosDeTres = 0;
	        int contadorMultiplosDeTres = 0;

	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero % 3 == 0 && numero != 0) {
	                somaMultiplosDeTres += numero;
	                contadorMultiplosDeTres++;
	            }

	        } while (numero != 0);

	        double media = (contadorMultiplosDeTres == 0) ? 0 : (double) somaMultiplosDeTres / contadorMultiplosDeTres;

	        System.out.println("A média de todos os números múltiplos de 3 é: " + media);

	        scanner.close();
	    }
	
	}

