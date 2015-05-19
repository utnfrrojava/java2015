package ejercicio3;

public class Empleado extends Persona {
	
	String puesto;
	int legajo;
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getLegajo() {
		return legajo;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	
	public String descGral(){
		return super.descGral()+"\tPuesto:"+this.getPuesto()+"\tLegajo:"+String.valueOf(this.getLegajo());
	}

}
