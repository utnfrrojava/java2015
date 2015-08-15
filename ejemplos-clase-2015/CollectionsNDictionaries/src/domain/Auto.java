package domain;

public class Auto {
	
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Auto(String descripcion){
		setDescripcion(descripcion);
	}

}
