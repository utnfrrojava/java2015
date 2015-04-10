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
		System.out.print("Hijo:");
		System.out.println(h instanceof Hijo);
		System.out.print("Padre:");
		System.out.println(h instanceof Padre);
		
		
		System.out.println("h2");
		Padre h2=new Hijo("Hijo", "Padre");//boxing
		
		System.out.println(h2.getDescipcionClase());
		System.out.println(((Hijo)h2).metodoHijo());//debo hacer casteo o unboxing para usar los métodos de la subclase
		System.out.print("Hijo:");
		System.out.println(h2 instanceof Hijo);
		System.out.print("Padre:");
		System.out.println(h2 instanceof Padre);
	}

}
