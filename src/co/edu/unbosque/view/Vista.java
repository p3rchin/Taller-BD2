package co.edu.unbosque.view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import co.edu.unbosque.controller.Controller;

public class Vista extends JFrame {
	
	private final String COMANDO_CREAR_CLIENTE = "CREARCLIENTE";

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem1;
	private PanelCrearUsuario panelCrearUsuario;
	private JPanel panelPrincipal;


	public Vista(Controller controller) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(650, 400);
		this.setTitle("Mercado Libre");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setVisible(true);
		panelPrincipal = new JPanel();
		panelPrincipal.setSize(650, 400);
		panelPrincipal.setLayout(null);
		menuBar = new JMenuBar();
		menu = new JMenu("Opciones");
		menuBar.add(menu);
		menuItem1 = new JMenuItem("Crear usuario");
		menuItem1.setActionCommand(COMANDO_CREAR_CLIENTE);
		menu.add(menuItem1);
		
		panelCrearUsuario = new PanelCrearUsuario();
		panelCrearUsuario.setVisible(false);
		panelPrincipal.add(panelCrearUsuario);
		panelCrearUsuario.setBounds(0, 0, 640, 345);

		setJMenuBar(menuBar);
		add(panelPrincipal);
		asignarOyentes(controller);
		repaint();
		revalidate();
	}

	public void asignarOyentes(Controller controller) {
		menuItem1.addActionListener(controller);
		panelCrearUsuario.getBtnCrear().addActionListener(controller);
	}
	
	/**
	 * Método encargado de mostrar un mensaje de advertencia.
	 * 
	 * @param mensaje
	 */
	public void mostrarMensajeAdvertencia(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Mensaje de advertencia", JOptionPane.WARNING_MESSAGE);
	}

	/**
	 * Método encargado de mostrar un mensaje informativo.
	 * 
	 * @param mensaje
	 */
	public void mostrarMensajeInformacion(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
	}

	/**
	 * Método encargado de mostrar un mensaje de error.
	 * 
	 * @param mensaje
	 */
	public void mostrarMensajeError(String mensaje) {
		JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * @return the cOMANDO_CREAR_CLIENTE
	 */
	public String getCOMANDO_CREAR_CLIENTE() {
		return COMANDO_CREAR_CLIENTE;
	}

	/**
	 * @return the panelCrearUsuario
	 */
	public PanelCrearUsuario getPanelCrearUsuario() {
		return panelCrearUsuario;
	}

	/**
	 * @param panelCrearUsuario the panelCrearUsuario to set
	 */
	public void setPanelCrearUsuario(PanelCrearUsuario panelCrearUsuario) {
		this.panelCrearUsuario = panelCrearUsuario;
	}

	/**
	 * @return the panelPrincipal
	 */
	public JPanel getPanelPrincipal() {
		return panelPrincipal;
	}

	/**
	 * @param panelPrincipal the panelPrincipal to set
	 */
	public void setPanelPrincipal(JPanel panelPrincipal) {
		this.panelPrincipal = panelPrincipal;
	}

}
