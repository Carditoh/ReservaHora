package entidad;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.Conexion;

public class LoginDao {
	public static int validar(String username, String password) {
		Connection con;
		Conexion cn = new Conexion();
		
		PreparedStatement ps;
		ResultSet rs;
		String us = "";
		int valido = 0;
		String sql = "Select * from examf.usuario where nombreUsuario = ? and password = ?";
		
		try {
			con = cn.getConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1,username);
			ps.setString(2,password);
			rs = ps.executeQuery();
			while(rs.next()) {
				us = rs.getString("nombreUsuario");
			}
			if(us.equals(username) && us!="" && us!=null) {
				valido = 1;
			} else {
				valido = 0;
			}
		} catch (Exception e) {}
		return valido;
	}
}
