package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p");
		Padre p=new Padre();//da error porque no tengo un constructor por defecto
		p.setClase("Padre");
		p.setTipo("Padre");
		
		System.out.println("Clase:"+p.getClase()+"\nTipo:"+p.getTipo());
		
		System.out.println("h");
		Hijo h=new Hijo(); //las clases hijas heredan los métodos de la clase padre
		h.setClase("Hijo");
		h.setTipo("Hijo");
		
		System.out.println("Clase:"+h.getClase()+"\nTipo:"+h.getTipo());
	}

}
