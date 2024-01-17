package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;

import org.testng.annotations.Test;

public class ConnectionTest {
	Connection con;
  @Test
  public void f() {
	  try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examf", "root", "");
			System.out.println("DB is Running");
		} catch(Exception e) {
			System.out.println("DB ERROR");
		}
  }
}
