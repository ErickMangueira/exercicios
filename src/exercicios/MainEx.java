package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class MainEx {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Empregado> list = new ArrayList<>();

		System.out.print(" Quantos funcionarios? : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println(" Empregado #" + i + ":");

			System.out.print(" ID :");
			int id = sc.nextInt();
			while (hasId (list , id)) {
				System.out.print(" ID ja existe : ");
				id = sc.nextInt();
			}
			System.out.print(" Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print(" Salario : ");
			double salario = sc.nextDouble();
			list.add(new Empregado(id, salario, nome));
		}

		System.out.println();
		System.out.print("Qual funcionario vai receber o aumento: ");
		int id = sc.nextInt();
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println(" Id nao existe ");
			
		}
		else {
			System.out.println(" Digite a porcentgem: ");
			double porcento = sc.nextDouble();
			emp.incrementarSalario(porcento);
		}
		System.out.println();
		System.out.println(" Lista de empregados :");
		
		for (Empregado obj : list) {
			System.out.println(obj);
		}
         sc.close();
	}
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
