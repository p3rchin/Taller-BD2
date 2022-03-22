package co.edu.unbosque.model.persistences;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import co.edu.unbosque.model.Usuario;

public class UsuarioDAO extends ManejoConexion {

	public UsuarioDAO() {
		try {
			establecerConexion();
		} catch (SQLException e) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
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

		} catch (SQLException e) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
			return false;
		}

	}

	public ArrayList<Usuario> consultarUsuarios() {
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
		try {

			String comandoSQL = "SELECT NOMBRE, APELLIDO, CORREO, ID_USUARIO, DIRECCION, TELEFONO, SEXO FROM USUARIO WHERE ESTADO = 'A'";
			PreparedStatement consulta = conexion.prepareStatement(comandoSQL);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				Usuario usuario = new Usuario(res.getString("id_usuario"), res.getString("nombre"),
						res.getString("apellido"), res.getString("telefono"), res.getString("correo"),
						res.getString("direccion"), res.getString("sexo"));
				listaUsuario.add(usuario);
			}
			res.close();
			consulta.execute();
			consulta.close();
		} catch (Exception e) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
			return null;
		}
		return listaUsuario;
	}

	public ArrayList<Usuario> consultarUsuarios(String nombre) {
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
		try {

			String comandoSQL = "SELECT NOMBRE, APELLIDO, CORREO, ID_USUARIO, DIRECCION, TELEFONO, SEXO FROM USUARIO WHERE NOMBRE LIKE '%"
					+ nombre + "%' and ESTADO = 'A'";
			PreparedStatement consulta = conexion.prepareStatement(comandoSQL);
			ResultSet res = consulta.executeQuery();
			while (res.next()) {
				Usuario usuario = new Usuario(res.getString("id_usuario"), res.getString("nombre"),
						res.getString("apellido"), res.getString("telefono"), res.getString("correo"),
						res.getString("direccion"), res.getString("sexo"));
				listaUsuario.add(usuario);
			}
			res.close();
			consulta.execute();
			consulta.close();
		} catch (Exception e) {
			Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
			return null;
		}
		return listaUsuario;
	}
	
	public void cambiarSaldo(String idUsuario) {
		try {

            if (!conexion.isClosed()) {
                //llamado al procedimiento almacenado pa_cambiarPuntos
                CallableStatement c=conexion.prepareCall("{call cambiarSaldo(?)}"); 
                c.setString(1, idUsuario);
                c.execute(); 
            } else {
                System.out.print("error en llamado");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	public String[][] mostarInfoUsuarios(ArrayList<Usuario> listaUsuarios) {

		String[][] infoUsuarios = new String[listaUsuarios.size()][7];
		for (int i = 0; i < listaUsuarios.size(); i++) {
			infoUsuarios[i][0] = listaUsuarios.get(i).getNombre();
			infoUsuarios[i][1] = listaUsuarios.get(i).getApellidos();
			infoUsuarios[i][2] = listaUsuarios.get(i).getCorreo();
			infoUsuarios[i][3] = listaUsuarios.get(i).getId_usuario();
			infoUsuarios[i][4] = listaUsuarios.get(i).getDireccion();
			infoUsuarios[i][5] = listaUsuarios.get(i).getTelefono();
			infoUsuarios[i][6] = listaUsuarios.get(i).getSexo();
		}
		return infoUsuarios;
	}
}
