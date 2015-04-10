package herencia;

public class Padre {
	private String clase;
	private String tipo;
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	//al crear un constructor con parametros desaparece el constructor por defecto
	public Padre(String clase, String tipo){
		setClase(clase);
		setTipo(tipo);
	}
	
	public Padre(){} //creo un constructor sin parametros para que no de error
}
