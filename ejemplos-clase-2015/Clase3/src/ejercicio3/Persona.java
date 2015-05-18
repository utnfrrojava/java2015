package ejercicio3;

public class Persona {
	
	int dni;
	String nombre;
	String apellido;
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String descGral(){
		return "DNI:"+String.valueOf(this.getDni())+"\tNombre:"+this.getNombre()+"\tApellido:"+this.getApellido();
	}

}
