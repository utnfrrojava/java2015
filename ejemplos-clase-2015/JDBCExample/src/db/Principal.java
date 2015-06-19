package db;

import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjemploDB db= new EjemploDB();
		try {
			db.add();
			db.getAll();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
