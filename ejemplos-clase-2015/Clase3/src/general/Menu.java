package general;

import java.util.Scanner;

import ejercicios.Ejercicio1;

public class Menu {

	public static void main(String[] args) {
		System.out.println("Ingrese el número de ejercicio a ejecutar (1, 2 o 3):");
		Scanner s = new Scanner(System.in);
		String op = s.nextLine();
		
		switch (op) {
		case "1":
			new Ejercicio1().ejecutar();
			break;
		case "2":
			break;
		case "3":
			break;
		}

	}

}
