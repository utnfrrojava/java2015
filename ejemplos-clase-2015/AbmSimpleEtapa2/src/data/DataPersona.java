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
		PreparedStatement stmt=null;
		
		try {
			stmt = FactoryConexion.getInstancia().getConn().prepareStatement(
					 "update personas set nombre=?, apellido=?, email=? where dni=?"
					);
			
			stmt.setString(1, newPer.getNombre());
			stmt.setString(2, newPer.getApellido());
			stmt.setString(3, newPer.getEmail());
			stmt.setInt(4, newPer.getDni());
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FactoryConexion.getInstancia().releaseConn();
		}
	}
	
	public void delete(Persona p){
		PreparedStatement stmt=null;
		
		try {
			stmt=FactoryConexion.getInstancia().getConn().prepareStatement(
					  "delete from personas where dni=?"
					);
			stmt.setInt(1, p.getDni());
			stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			FactoryConexion.getInstancia().releaseConn();
		}
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
