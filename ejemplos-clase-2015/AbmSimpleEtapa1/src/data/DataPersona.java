package data;

import java.util.ArrayList;

import entidades.Persona;

public class DataPersona {
	
	private static ArrayList<Persona> colPersonas;
	
	public DataPersona(){
		colPersonas = new ArrayList<Persona>();
	}
	
	public void add(Persona p){
		colPersonas.add(p);
	}
	
	public void update(Persona newPer){
		Persona oldPer = this.getByDni(newPer.getDni());
		oldPer.setNombre(newPer.getNombre());
		oldPer.setApellido(newPer.getApellido());
		oldPer.setEmail(newPer.getEmail());
	}
	
	public void delete(Persona p){
		colPersonas.remove(this.getByDni(p.getDni()));
	}
	
	public Persona getByDni(int dni){
		for (Persona persona : colPersonas) {
			if (persona.getDni()==dni){
				return persona;
			}
		}
		return null;
	}
	
	

}
