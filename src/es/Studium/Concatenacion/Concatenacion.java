package es.Studium.Concatenacion;

import java.util.Scanner;

public class Concatenacion {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
				
		char a, b;
		
		System.out.println("Dame un car�cter");
		a=teclado.next().charAt(0);
		System.out.println("Dame otro car�cter");
		b=teclado.next().charAt(0);
		
		System.out.println(a+""+b);
		
		teclado.close();
	}
}
