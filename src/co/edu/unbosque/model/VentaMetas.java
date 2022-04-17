package co.edu.unbosque.model;

import java.util.Date;

public class VentaMetas {
	
	private String nombreProducto;
	private int precioProdcuto;
	private String nombreUsuario;
	private String telefonoUsuario;
	private String direccionUsuario;
	private int id_usuario;
	private String nombreTipoProducto;
	private String nombreCategoria;
	private Date fechaFactura;
	private Date fechaVenta;
	
	public VentaMetas() {
		
	}
	
	/**
	 * @param nombreProducto
	 * @param precioProdcuto
	 * @param nombreUsuario
	 * @param telefonoUsuario
	 * @param direccionUsuario
	 * @param id_usuario
	 * @param nombreTipoProducto
	 * @param nombreCategoria
	 * @param fechaFactura
	 * @param fechaVenta
	 */
	public VentaMetas(String nombreProducto, int precioProdcuto, String nombreUsuario, String telefonoUsuario,
			String direccionUsuario, int id_usuario, String nombreTipoProducto, String nombreCategoria,
			Date fechaFactura, Date fechaVenta) {
		this.nombreProducto = nombreProducto;
		this.precioProdcuto = precioProdcuto;
		this.nombreUsuario = nombreUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.direccionUsuario = direccionUsuario;
		this.id_usuario = id_usuario;
		this.nombreTipoProducto = nombreTipoProducto;
		this.nombreCategoria = nombreCategoria;
		this.fechaFactura = fechaFactura;
		this.fechaVenta = fechaVenta;
	}

	/**
	 * @return the nombreProducto
	 */
	public String getNombreProducto() {
		return nombreProducto;
	}

	/**
	 * @param nombreProducto the nombreProducto to set
	 */
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	/**
	 * @return the precioProdcuto
	 */
	public int getPrecioProdcuto() {
		return precioProdcuto;
	}

	/**
	 * @param precioProdcuto the precioProdcuto to set
	 */
	public void setPrecioProdcuto(int precioProdcuto) {
		this.precioProdcuto = precioProdcuto;
	}

	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the telefonoUsuario
	 */
	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	/**
	 * @param telefonoUsuario the telefonoUsuario to set
	 */
	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	/**
	 * @return the direccionUsuario
	 */
	public String getDireccionUsuario() {
		return direccionUsuario;
	}

	/**
	 * @param direccionUsuario the direccionUsuario to set
	 */
	public void setDireccionUsuario(String direccionUsuario) {
		this.direccionUsuario = direccionUsuario;
	}

	/**
	 * @return the id_usuario
	 */
	public int getId_usuario() {
		return id_usuario;
	}

	/**
	 * @param id_usuario the id_usuario to set
	 */
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	/**
	 * @return the nombreTipoProducto
	 */
	public String getNombreTipoProducto() {
		return nombreTipoProducto;
	}

	/**
	 * @param nombreTipoProducto the nombreTipoProducto to set
	 */
	public void setNombreTipoProducto(String nombreTipoProducto) {
		this.nombreTipoProducto = nombreTipoProducto;
	}

	/**
	 * @return the nombreCategoria
	 */
	public String getNombreCategoria() {
		return nombreCategoria;
	}

	/**
	 * @param nombreCategoria the nombreCategoria to set
	 */
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}

	/**
	 * @return the fechaFactura
	 */
	public Date getFechaFactura() {
		return fechaFactura;
	}

	/**
	 * @param fechaFactura the fechaFactura to set
	 */
	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	/**
	 * @return the fechaVenta
	 */
	public Date getFechaVenta() {
		return fechaVenta;
	}

	/**
	 * @param fechaVenta the fechaVenta to set
	 */
	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
}
