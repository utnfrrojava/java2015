package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public void ejecutar() {
		
		Scanner s=new Scanner(System.in);
		
		ArrayList<Integer> nros = new ArrayList<Integer>();
		
		for (int indice = 0; indice < 15; indice++) {
			System.out.println("Ingrese el número "+String.valueOf(indice+1));
			nros.add(Integer.parseInt(s.nextLine()));
		}
		
		System.out.println("#######################");
		System.out.println("Números en orden inverso");
		for (int indice = nros.size()-1; indice >=0; indice--) {
			System.out.println(nros.get(indice));
		}
		s.close();
		
	}

}
