package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	Persona[] personas = new Persona[5];
	
	public void ejecutar() {
		
		this.cargarPersonas();
		this.ordenarPersonas();
		this.listarPersonas();
		
	}
	
	private void ordenarPersonas(){ //reemplazar por un ordenamiento con un comparator cuando se vea el tema
		for (int i = 0; i < personas.length - 1; i++) {
			for (int j = i + 1; j < personas.length; j++) {
				if(personas[i].dni>personas[j].dni){
					Persona p = personas[i];
					personas[i] = personas [j];
					personas[j] = p;
				}
			}
		}
	}
	
	private void listarPersonas(){
		for (int indice = 0; indice < personas.length; indice++) {
			System.out.println(personas[indice].descGral());
		}
	}

	private void cargarPersonas() {
		
		Scanner s = new Scanner(System.in);
		
		String rta="";
		
		for (int i = 0; i < personas.length; i++) {
			
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

			personas[i] = p;
			
		}
		
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
