package negocio;

import appExceptions.ApplicationException;
import data.DataPersona;
import entidades.Persona;

public class CtrlABMPersona {
	private DataPersona catalogo;
	
	public CtrlABMPersona(){
		catalogo = new DataPersona();
	}
	
	public void save(Persona p) throws ApplicationException {
		if (catalogo.getByDni(p.getDni())==null){
			catalogo.add(p);
		} else {
			catalogo.update(p);
		}
	}
	
	public void delete(Persona p){
		catalogo.delete(p);
	}
	
	public Persona getByDni(int dni){
		return catalogo.getByDni(dni);
	}
}
