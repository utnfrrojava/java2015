package ejercicio3;

public class Cliente extends Persona {
	
	int cuit;
	String direccion;
	
	public int getCuit() {
		return cuit;
	}
	public void setCuit(int cuit) {
		this.cuit = cuit;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String descGral(){
		return super.descGral()+"\tCUIT:"+String.valueOf(this.getCuit())+"\tDirección:"+this.getDireccion();
	}

}
