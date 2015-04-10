package herencia;

public class Hijo extends Padre{ //extends se utiliza para indicar que Hijo hereda de Padre
	public Hijo(){
		super("Hijo","Hijo");//invoco al constructor padre con parametros
		//los constructores no se heredan implicitamente
	}
	
	public Hijo(String clase, String tipo){
		super(clase,tipo);
	}
	
	public String metodoHijo(){
		return "Metodo específico de la clase Hijo";
	}
	
	public String getDescipcionClase(){
		return "La clase del objeto es:"+this.getClase()+
				"\nEl tipo de la variable es:"+this.getTipo();
	}

}
