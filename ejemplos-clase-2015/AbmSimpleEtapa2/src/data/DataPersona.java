package data;

import java.util.ArrayList;
import java.sql.*;

import entidades.Persona;

public class DataPersona {
	
	private static ArrayList<Persona> colPersonas;
	
	public DataPersona(){
		colPersonas = new ArrayList<Persona>();
	}
	
	public void add(Persona p){
		ResultSet rs=null;
		PreparedStatement stmt=null;
		
	
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					"insert into personas(dni, nombre, apellido, email) values (?,?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS
				   );
			stmt.setInt(1, p.getDni());
			stmt.setString(2, p.getNombre());
			stmt.setString(3, p.getApellido());
			stmt.setString(4, p.getEmail());
			stmt.execute();

			rs=stmt.getGeneratedKeys();
			
			if(rs!=null && rs.next()){
				p.setId(rs.getInt(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
			try {
				if(rs!=null ) rs.close();
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FactoryConexion.getInstancia().releaseConn();
		}
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
		ResultSet rs=null;
		PreparedStatement stmt=null;
		Persona p=null;
		try {
			stmt = 	FactoryConexion.getInstancia().getConn().prepareStatement(
					"select id, dni, nombre, apellido, email from personas where dni = ?"
					);
			stmt.setInt(1, dni);
			rs = stmt.executeQuery();
			if(rs !=null && rs.next()){
				p=new Persona();
				p.setId(rs.getInt("id"));
				p.setDni(rs.getInt("dni"));
				p.setNombre(rs.getString("nombre"));
				p.setApellido(rs.getString("apellido"));
				p.setEmail(rs.getString("email"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs!=null)rs.close();
				if(stmt!=null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			FactoryConexion.getInstancia().releaseConn();
		}
		return p;
	}
	
	

}
