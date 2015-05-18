package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public void ejecutar() {
		
		int[] nros=new int[20];
		int cantMayores=0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Ingrese el número base");
		
		int nroBase=Integer.parseInt(s.nextLine());
		
		System.out.println("Ingrese la lista de números");
		
		for (int indice = 0; indice < nros.length; indice++) {
			int nro = Integer.parseInt(s.nextLine());
			if (nro > nroBase) {
				nros[cantMayores]=nro;
				cantMayores++;
			}
		}
		
		System.out.println("Numeros mayores a "+String.valueOf(nroBase));
		for (int indice = 0; indice < cantMayores; indice++) {
			System.out.println(nros[indice]);
		}
		
		s.close();
		
	}

}
