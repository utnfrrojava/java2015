package herencia;

public class Hijo extends Padre{ //extends se utiliza para indicar que Hijo hereda de Padre
	public Hijo(){
		super("Hijo","Hijo");//invoco al constructor padre con parametros
		//los constructores no se heredan implicitamente
	}
	
	public String metodoHijo(){
		return "Metodo específico de la clase Hijo";
	}

}
