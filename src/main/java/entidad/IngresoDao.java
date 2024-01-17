package entidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;

import utils.Conexion;

public class IngresoDao {
	
	public static int ingresarDuenho(String rut, String nombre, String apellido, String direccion, String correo, String telefono, String nombreMascota) {
		Connection con;
		Conexion cn = new Conexion();
		
		PreparedStatement ps;
		//ResultSet rs;
		//String us = "";
		int valido = 0;
		String sql = "Insert into examf.duenho (Rut, nombre, apellido, direccion, correo, telefono, nombreMascota) values (?, ?, ?, ?, ?, ?, ?);";
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,rut);
			ps.setString(2,nombre);
			ps.setString(3,apellido);
			ps.setString(4,direccion);
			ps.setString(5,correo);
			ps.setString(6,telefono);
			ps.setString(7,nombreMascota);
			//rs = ps.executeQuery();
			ps.executeUpdate();
			valido = 1;
		} catch (Exception e) {
			valido = 0;
		}
		return valido;
	}
	
	public static int ingresarMascota(String rutDuenho, String tipoMascota, int edad, String nombreMascota) {
		Connection con;
		Conexion cn = new Conexion();
		PreparedStatement ps;
		int valido = 0;
		String sql = "Insert into examf.mascota (RutDuenho, tipoMascota, Edad, nombreMascota) values (?, ?, ?, ?);";
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,rutDuenho);
			ps.setString(2,tipoMascota);
			ps.setInt(3,edad);
			ps.setString(4,nombreMascota);
			ps.executeUpdate();
			valido = 1;
		} catch (Exception e) {
			valido = 0;
		}
		return valido;
	}
	
	public static int ingresarAgenda(int idMascota,String rutDuenho, String nombreMascota, String hora, String fecha) {
		Connection con;
		Conexion cn = new Conexion();
		PreparedStatement ps;
		int valido = 0;
		String sql = "Insert into examf.agenda (idMascota, rutDuenho, NombreMascota, hora, Fecha) values (?, ?, ?, ?, ?);";
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			ps.setInt(1,idMascota);
			ps.setString(2,rutDuenho);
			ps.setString(3,nombreMascota);
			ps.setString(4,hora);
			ps.setString(5,fecha);
			ps.executeUpdate();
			valido = 1;
		} catch (Exception e) {
			valido = 0;
		}
		return valido;
	}
}
