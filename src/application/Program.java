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
		
		System.out.print("Sexo: ");
		char gender_= sc.next().charAt(0);
		bill.gender = Character.toUpperCase(gender_);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("RELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f%n",bill.feeding());
		if (bill.cover() == 0) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.printf("Couvert = R$ %.2f%n",bill.cover());
		}
		System.out.printf("Ingresso = R$ %.2f%n",bill.ticket());
		System.out.println("");
		System.out.printf("Valor a pagar = R$ %.2f%n", bill.total());
		
		sc.close();
	}

}
