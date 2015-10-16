package negocio;

import modelo.*;

public class ControladorLogin {

	
	public modelo.Usuario getUsuarioByEmailAndPassword(String email, String password){
		/*
		 * Este método debería invocar a la capa de datos en el packages data y pedir que traiga el usuario
		 * por el email, luego validar contra la contraseña encriptada
		 * 
		 * El método de la capa de datos debería hacer un select a la base de datos por los datos del usuario
		 * con el email y luego crear un objeto Usuario de la capa modelo y devolverlo a negocio
		 *
		 * Aquí no hacemos eso para hacer el ejemplo más facil de comprender
		 * 
		 */
		
		Usuario u =null;
		if (email.equalsIgnoreCase("adrianmeca@gmail.com") && password.equalsIgnoreCase("1234")){
			u = new Usuario();
			u.setEmail("adrianmeca@gmail.com");
			u.setPassword("1234");
			u.setNombre("Adrián Meca");
		}
		return u;
	}
}
