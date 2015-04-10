package herencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("p");
		Padre p=new Padre();//da error porque no tengo un constructor por defecto
		p.setClase("Padre");
		p.setTipo("Padre");
		
		System.out.println(p.getDescipcionClase());
		
		System.out.println("h");
		Hijo h=new Hijo(); //las clases hijas heredan los métodos de la clase padre
		
		System.out.println(h.getDescipcionClase());
		System.out.println(h.metodoHijo());
		
		System.out.println("h2");
		Padre h2=new Hijo();//boxing
		
		System.out.println(h2.getDescipcionClase());
		System.out.println(h2.metodoHijo());//por el tipo de la variable no puede asegurar que ese método exista
	}

}
