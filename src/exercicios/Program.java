package exercicios;

import java.util.Locale;
import java.util.Scanner;

import util.Quarto;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quarto[] vect =  new Quarto[10];
		
		System.out.println(" Quantos quartos quer alugar? " );
		int n = sc.nextInt();
		
		for (int i=1; i <=n; i++) {
			
			System.out.println();
			System.out.println(" Alugado# " + i + ":" );
			System.out.print(" Nome : " );
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print(" Email : ");
			String email = sc.nextLine();
			System.out.print(" Quarto : ");
			int quarto = sc.nextInt();
			vect [quarto] = new Quarto(nome ,email);
			
		}
		System.out.println();
		System.out.println("Quartos ocupados : " );
		for (int i = 0; i < 10; i ++) {
			if (vect [i] != null ) {
				System.out.println(i + "," + vect[i]);
				
			}
		}
			
		sc.close();

	}

}
