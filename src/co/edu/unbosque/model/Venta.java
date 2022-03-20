package co.edu.unbosque.model;

import java.util.Date;

public class Venta {
	
	private int idVenta;
	private int idProducto;
	private int idFactura;
	private String idUsuario;
	private Date fecha;
	private String estado;
	
	public Venta(int idVenta, int idProducto, int idFactura, String idUsuario, Date fecha, String estado) {
		this.idVenta = idVenta;
		this.idProducto = idProducto;
		this.idFactura = idFactura;
		this.idUsuario = idUsuario;
		this.fecha = fecha;
		this.estado = estado;
	}

	/**
	 * @return the idVenta
	 */
	public int getIdVenta() {
		return idVenta;
	}

	/**
	 * @param idVenta the idVenta to set
	 */
	public void setIdVenta(int idVenta) {
		this.idVenta = idVenta;
	}

	/**
	 * @return the idProducto
	 */
	public int getIdProducto() {
		return idProducto;
	}

	/**
	 * @param idProducto the idProducto to set
	 */
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	/**
	 * @return the idFactura
	 */
	public int getIdFactura() {
		return idFactura;
	}

	/**
	 * @param idFactura the idFactura to set
	 */
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	/**
	 * @return the idUsuario
	 */
	public String getIdUsuario() {
		return idUsuario;
	}

	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
