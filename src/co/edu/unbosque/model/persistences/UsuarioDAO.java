package co.edu.unbosque.model.persistences;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.edu.unbosque.model.Usuario;

public class UsuarioDAO extends ManejoConexion {

	public UsuarioDAO() {
		try {
            establecerConexion();
        } catch (SQLException ex) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
	
	 public boolean crearUsuario(Usuario usuario) {
	        try {

	            String comandoSQL = "INSERT INTO USUARIO (ID_USUARIO, NOMBRE, APELLIDO, TELEFONO, CORREO, DIRECCION, SEXO, SALDO, ESTADO) VALUES (?,?,?,?,?,?,?,?,?)";
	            if (!conexion.isClosed()) {

	                PreparedStatement ps = conexion.prepareStatement(comandoSQL);
	                ps.setString(1, usuario.getId_usuario());
	                ps.setString(2, usuario.getNombre());
	                ps.setString(3, usuario.getApellidos());
	                ps.setString(4, usuario.getTelefono());
	                ps.setString(5, usuario.getCorreo());
	                ps.setString(6, usuario.getDireccion());
	                ps.setString(7, usuario.getSexo());
	                ps.setInt(8, usuario.getSaldo());
	                ps.setString(9, usuario.getEstado());


	                return ps.executeUpdate() > 0;
	            } else {
	                return false;
	            }

	        } catch (SQLException ex) {
	            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
	            return false;
	        }

	    }
}
