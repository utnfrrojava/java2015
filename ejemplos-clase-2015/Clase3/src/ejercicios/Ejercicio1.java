package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public void ejecutar() {
		
		Scanner s=new Scanner(System.in);
		
		int[] nros=new int[15];
		
		for (int indice = 0; indice < 15; indice++) {
			System.out.println("Ingrese el número "+String.valueOf(indice+1));
			nros[indice]=Integer.parseInt(s.nextLine());
		}
		
		System.out.println("#######################");
		System.out.println("Números en orden inverso");
		for (int indice = nros.length-1; indice >0; indice--) {
			System.out.println(nros[indice]);
		}
		
	}

}
