package co.edu.unbosque.model;

import co.edu.unbosque.model.persistences.UsuarioDAO;
import co.edu.unbosque.model.persistences.VentaMetasDAO;


public class MercadoLibre {
	
	private UsuarioDAO usuario;
	private VentaMetasDAO ventas;
	
	public MercadoLibre() {
		usuario = new UsuarioDAO();
		ventas = new VentaMetasDAO();
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

	/**
	 * @return the ventas
	 */
	public VentaMetasDAO getVentas() {
		return ventas;
	}

	/**
	 * @param ventas the ventas to set
	 */
	public void setVentas(VentaMetasDAO ventas) {
		this.ventas = ventas;
	}

	
}
