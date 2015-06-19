package db;

import java.sql.*;

public class EjemploDB {
	
	String dbDriver="com.mysql.jdbc.Driver";
	String host="localhost";
	String port="3306";
	String user="javausr";
	String pass="java123";
	String db="java";
	
	public void getAll() throws ClassNotFoundException, SQLException{
		Class.forName(dbDriver);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+
								host+":"+port+"/"+db+"?user="+user+"&password="+pass);

		Statement stmt = conn.createStatement();
		ResultSet rs= stmt.executeQuery("select * from personas;");
		while(rs.next()){
			int id= rs.getInt("id");
			int dni= rs.getInt("dni");
			String nombre=rs.getString("nombre");
			String apellido=rs.getString("apellido");
			String email=rs.getString("email");
			
			System.out.println(String.valueOf(id)+"\t"+String.valueOf(dni)+"\t"+
					nombre+"\t"+apellido+"\t"+email);
		}
		
		rs.close();
		
		stmt.close();
		
		conn.close();
		
	}
	
	public void add() throws ClassNotFoundException, SQLException{
		Class.forName(dbDriver);
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://"+
								host+":"+port+"/"+db+"?user="+user+"&password="+pass);

		PreparedStatement stmt = conn.prepareStatement(
				"insert into personas(dni, nombre, apellido, email) values (?,?,?,?)");
		stmt.setInt(1, 11111111);
		stmt.setString(2, "Juan");
		stmt.setString(3, "Perez");
		stmt.setString(4, "jp@gmail.com");
		
		stmt.execute();
		
		stmt.close();
		conn.close();
		
	}

}
