package co.edu.unbosque.model;

import co.edu.unbosque.model.persistences.UsuarioDAO;

public class MercadoLibre {
	
	private UsuarioDAO usuario;
	
	public MercadoLibre() {
		usuario = new UsuarioDAO();
	}

	/**
	 * @return the usuario
	 */
	public UsuarioDAO getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuarioDAO usuario) {
		this.usuario = usuario;
	}
	
}
