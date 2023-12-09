package atividadecanvasdia10;

import java.util.Scanner;

public class Lista2_While_Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int idade;
        int totalMenoresDe21 = 0;
        int totalMaioresDe50 = 0;

        System.out.println("Insira as idades (a ultima idade deve ser negativa)");

        while (true) {
            System.out.print("Insira uma idade: ");
            idade = scanner.nextInt();

            if (idade < 0) {
                break; 
            }

            if (idade < 21) {
                totalMenoresDe21++;
            } else if (idade > 50) {
                totalMaioresDe50++;
            }
        }

        System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaioresDe50);

        scanner.close();
    }


	}

