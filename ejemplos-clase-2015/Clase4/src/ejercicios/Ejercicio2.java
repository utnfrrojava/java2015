package ejercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {

	public void ejecutar() {
		
		ArrayList<Integer> nros=new ArrayList<Integer>();
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Ingrese el número base");
		
		int nroBase=Integer.parseInt(s.nextLine());
		
		System.out.println("Ingrese la lista de números");
		
		for (int indice = 0; indice < 20; indice++) {
			System.out.println("Ingrese el numero "+String.valueOf(indice+1));
			int nro = Integer.parseInt(s.nextLine());
			if (nro > nroBase) {
				nros.add(nro);
			}
		}
		
		System.out.println("Numeros mayores a "+String.valueOf(nroBase));
		
		for (int nro : nros) {
			System.out.println(nro);
		}
		
		s.close();
		
	}

}
