package exercicios;

import java.util.Locale;
import java.util.Scanner;

import util.Account;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Account account;
		
		System.out.print(" Enter account number ");
		int number = sc.nextInt();
		System.out.println(" Enter account holder  ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.println(" Is there an initial deposit(y/n)?  ");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println(" Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		}
		else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println(" Account data: ");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print(" Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println(" update account date: ");
		System.out.println(account);
		
		System.out.print(" Enter a whitdraw value: ");
		double whitdrawValue = sc.nextDouble();
		account.withDraw(whitdrawValue);
		System.out.println(" update account date: ");
		System.out.println(account);
		
		
		sc.close();
	}

}
