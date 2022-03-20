package co.edu.unbosque.model;

public class TipoProducto {
	
	private int idTipoProducto;
	private int idCategoria;
	private String nombre;
	private String estado;
	
	public TipoProducto(int idTipoProducto, int idCategoria, String nombre, String estado) {
		this.idTipoProducto = idTipoProducto;
		this.idCategoria = idCategoria;
		this.nombre = nombre;
		this.estado = estado;
	}

	/**
	 * @return the idTipoProducto
	 */
	public int getIdTipoProducto() {
		return idTipoProducto;
	}

	/**
	 * @param idTipoProducto the idTipoProducto to set
	 */
	public void setIdTipoProducto(int idTipoProducto) {
		this.idTipoProducto = idTipoProducto;
	}

	/**
	 * @return the idCategoria
	 */
	public int getIdCategoria() {
		return idCategoria;
	}

	/**
	 * @param idCategoria the idCategoria to set
	 */
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
