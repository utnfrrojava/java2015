package domain;

import java.util.HashMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Cochera, Auto> reservas =new HashMap<Cochera, Auto>();
		
		//Cochera c= new Cochera('c', 5);
		
		reservas.put(new Cochera('a', 1), new Auto("1"));
		//reservas.put(c, new Auto("2"));
		reservas.put(new Cochera('c', 5), new Auto("2"));
		reservas.put(new Cochera('d', 8), new Auto("3"));
		reservas.put(new Cochera('b', 3), new Auto("4"));
		
		
		//System.out.println(reservas.get(c).getDescripcion());
		System.out.println(reservas.get(new Cochera('c', 5)).getDescripcion());
		
	}

}
