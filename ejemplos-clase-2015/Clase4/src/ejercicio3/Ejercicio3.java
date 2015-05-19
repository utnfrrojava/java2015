package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

	ArrayList<Persona> personas = new ArrayList<Persona>();
	
	public void ejecutar() {
		
		this.cargarPersonas();
		this.ordenarPersonas();
		this.listarPersonas();
		
	}
	
	private void ordenarPersonas(){ //reemplazar por un ordenamiento con un comparator cuando se vea el tema
		for (int i = 0; i < personas.size() - 1; i++) {
			for (int j = i + 1; j < personas.size(); j++) {
				if(personas.get(i).dni>personas.get(j).dni){
					Persona p = personas.get(i);
					personas.set(i, personas.get(j));
					personas.set(j, p);
				}
			}
		}
	}
	
	private void listarPersonas(){
		for (int indice = 0; indice < personas.size(); indice++) {
			System.out.println(personas.get(indice).descGral());
		}
	}

	private void cargarPersonas() {
		
		Scanner s = new Scanner(System.in);
		
		String rta="";
		
		do{
		
			System.out.println("¿Ingresará Empleado o Cliente? (E/C)");
			String tipo = s.nextLine();
			Persona p;
			
			switch (tipo) {
			case "E":
				p = this.cargaDatosEmpleado(s);
				break;
			case "C":
				p = this.cargaDatosCliente(s);
				break;
			default:
				p = new Persona();
				break;
			}

			personas.add(p);
			
			System.out.println("¿Ingresará otra persona? (S/N)");
			rta = s.nextLine();
			
		} while (!rta.equalsIgnoreCase("N"));
		
		
		s.close();
		
	}
	
	private Cliente cargaDatosCliente(Scanner s){
		Cliente c = new Cliente();
		this.cargaDatosPersona(c, s);
		
		System.out.println("Ingrese CUIT");
		c.setCuit(Integer.parseInt(s.nextLine()));
		
		System.out.println("Ingrese Direccion");
		c.setDireccion(s.nextLine());

		return c;
	}
	
	private Empleado cargaDatosEmpleado(Scanner s){
		Empleado e = new Empleado();
		this.cargaDatosPersona(e,s);

		System.out.println("Ingrese Puesto");
		e.setPuesto(s.nextLine());
		
		System.out.println("Ingrese Legajo");
		e.setLegajo(Integer.parseInt(s.nextLine()));
		
		return e;
	}
	
	private void cargaDatosPersona(Persona p, Scanner s){
		
		System.out.println("Ingrese DNI");
		p.setDni(Integer.parseInt(s.nextLine()));
		
		System.out.println("Ingrese Nombre");
		p.setNombre(s.nextLine());
		
		System.out.println("Ingrese Apellido");
		p.setApellido(s.nextLine());
	}

}
