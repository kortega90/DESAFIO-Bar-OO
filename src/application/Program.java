package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bill bill = new Bill();
		
		System.out.println("Sexo: ");
		char gender_= sc.next().charAt(0);
		bill.gender = Character.toUpperCase(gender_);
		System.out.println("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.println("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.println("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = %.2f%n",bill.cover());
	
	}

}
