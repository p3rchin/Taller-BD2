package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;

public class PanelCrearUsuario extends JPanel {

	private final String COMANDO_CREAR = "CREAR21";
	private JLabel labelCorreo;
	private JLabel labelCedula;
	private JLabel labelNombre;
	private JLabel labelApellido;
	private JLabel labelDirrecion;
	private JLabel labelTelefono;
	private JLabel labelSexo;
	private JTextField txtCorreo;
	private JTextField txtCedula;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDirrecion;
	private JTextField txtTelefono;
	private JComboBox<String> comboSexo;
	private JButton btnCrear;
	private JPanel panel;
	private JSplitPane splitPane;

	public PanelCrearUsuario() {
		setBorder(new TitledBorder("Registro de usuario"));
		setLayout(new BorderLayout());
		Font font1 = new Font("SansSerif", Font.BOLD, 30);
		Font font2 = new Font("SansSerif", Font.BOLD, 18);
		labelCorreo = new JLabel("Correo: ");
		labelCorreo.setFont(font2);
		labelCorreo.setBorder(BorderFactory.createLineBorder(new Color(5, 5, 5)));
		labelCedula = new JLabel("Cedula: ");
		labelCedula.setFont(font2);
		labelCedula.setBorder(BorderFactory.createLineBorder(new Color(5, 5, 5)));
		labelNombre = new JLabel("Nombres: ");
		labelNombre.setFont(font2);
		labelNombre.setBorder(BorderFactory.createLineBorder(new Color(5, 5, 5)));
		labelApellido = new JLabel("Apellidos: ");
		labelApellido.setFont(font2);
		labelApellido.setBorder(BorderFactory.createLineBorder(new Color(5, 5, 5)));
		labelDirrecion = new JLabel("Dirección: ");
		labelDirrecion.setFont(font2);
		labelDirrecion.setBorder(BorderFactory.createLineBorder(new Color(5, 5, 5)));
		labelTelefono = new JLabel("Telefono: ");
		labelTelefono.setFont(font2);
		labelTelefono.setBorder(BorderFactory.createLineBorder(new Color(5, 5, 5)));
		labelSexo = new JLabel("Sexo: ");
		labelSexo.setFont(font2);
		labelSexo.setBorder(BorderFactory.createLineBorder(new Color(5, 5, 5)));
		txtCorreo = new JTextField();
		txtCedula = new JTextField();
		txtNombre = new JTextField();
		txtApellido = new JTextField();
		txtDirrecion = new JTextField();
		txtTelefono = new JTextField();
		comboSexo = new JComboBox<String>();
		comboSexo.addItem("Seleccione");
		comboSexo.addItem("M");
		comboSexo.addItem("F");
		btnCrear = new JButton("Crear Usuario");
		btnCrear.setActionCommand(COMANDO_CREAR);
		panel = new JPanel();
		panel.setLayout(new GridLayout(7, 7));
		panel.add(labelCorreo);
		panel.add(txtCorreo);
		panel.add(labelCedula);
		panel.add(txtCedula);
		panel.add(labelNombre);
		panel.add(txtNombre);
		panel.add(labelApellido);
		panel.add(txtApellido);
		panel.add(labelDirrecion);
		panel.add(txtDirrecion);
		panel.add(labelTelefono);
		panel.add(txtTelefono);
		panel.add(labelSexo);
		panel.add(comboSexo);

		splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
		splitPane.setDividerLocation(250);
		splitPane.setTopComponent(panel);
		splitPane.setBottomComponent(btnCrear);
		add(splitPane, BorderLayout.CENTER);

	}

	public String[] verificarEntradas() {
		String[] entradas = new String[8];

		entradas[0] = "0";

		if (!txtCorreo.getText().equals("") && !txtCedula.getText().equals("") && !txtNombre.getText().equals("")
				&& !txtApellido.getText().equals("") && !txtDirrecion.getText().equals("")
				&& !txtTelefono.getText().equals("") && !comboSexo.getSelectedItem().toString().equals("Seleccione")) {
			entradas[1] = txtCorreo.getText();
			entradas[2] = txtCedula.getText();
			entradas[3] = txtNombre.getText();
			entradas[4] = txtApellido.getText();
			entradas[5] = txtDirrecion.getText();
			entradas[6] = txtTelefono.getText();
			entradas[7] = comboSexo.getSelectedItem().toString();

		} else {
			entradas[0] = "1";
			entradas[1] = "Por favor complete todos los campos";
		}

		return entradas;
	}

	/**
	 * @return the labelCorreo
	 */
	public JLabel getLabelCorreo() {
		return labelCorreo;
	}

	/**
	 * @param labelCorreo the labelCorreo to set
	 */
	public void setLabelCorreo(JLabel labelCorreo) {
		this.labelCorreo = labelCorreo;
	}

	/**
	 * @return the labelCedula
	 */
	public JLabel getLabelCedula() {
		return labelCedula;
	}

	/**
	 * @param labelCedula the labelCedula to set
	 */
	public void setLabelCedula(JLabel labelCedula) {
		this.labelCedula = labelCedula;
	}

	/**
	 * @return the labelNombre
	 */
	public JLabel getLabelNombre() {
		return labelNombre;
	}

	/**
	 * @param labelNombre the labelNombre to set
	 */
	public void setLabelNombre(JLabel labelNombre) {
		this.labelNombre = labelNombre;
	}

	/**
	 * @return the labelApellido
	 */
	public JLabel getLabelApellido() {
		return labelApellido;
	}

	/**
	 * @param labelApellido the labelApellido to set
	 */
	public void setLabelApellido(JLabel labelApellido) {
		this.labelApellido = labelApellido;
	}

	/**
	 * @return the labelDirrecion
	 */
	public JLabel getLabelDirrecion() {
		return labelDirrecion;
	}

	/**
	 * @param labelDirrecion the labelDirrecion to set
	 */
	public void setLabelDirrecion(JLabel labelDirrecion) {
		this.labelDirrecion = labelDirrecion;
	}

	/**
	 * @return the labelTelefono
	 */
	public JLabel getLabelTelefono() {
		return labelTelefono;
	}

	/**
	 * @param labelTelefono the labelTelefono to set
	 */
	public void setLabelTelefono(JLabel labelTelefono) {
		this.labelTelefono = labelTelefono;
	}

	/**
	 * @return the labelSexo
	 */
	public JLabel getLabelSexo() {
		return labelSexo;
	}

	/**
	 * @param labelSexo the labelSexo to set
	 */
	public void setLabelSexo(JLabel labelSexo) {
		this.labelSexo = labelSexo;
	}

	/**
	 * @return the txtCorreo
	 */
	public JTextField getTxtCorreo() {
		return txtCorreo;
	}

	/**
	 * @param txtCorreo the txtCorreo to set
	 */
	public void setTxtCorreo(JTextField txtCorreo) {
		this.txtCorreo = txtCorreo;
	}

	/**
	 * @return the txtCedula
	 */
	public JTextField getTxtCedula() {
		return txtCedula;
	}

	/**
	 * @param txtCedula the txtCedula to set
	 */
	public void setTxtCedula(JTextField txtCedula) {
		this.txtCedula = txtCedula;
	}

	/**
	 * @return the txtNombre
	 */
	public JTextField getTxtNombre() {
		return txtNombre;
	}

	/**
	 * @param txtNombre the txtNombre to set
	 */
	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	/**
	 * @return the txtApellido
	 */
	public JTextField getTxtApellido() {
		return txtApellido;
	}

	/**
	 * @param txtApellido the txtApellido to set
	 */
	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	/**
	 * @return the txtDirrecion
	 */
	public JTextField getTxtDirrecion() {
		return txtDirrecion;
	}

	/**
	 * @param txtDirrecion the txtDirrecion to set
	 */
	public void setTxtDirrecion(JTextField txtDirrecion) {
		this.txtDirrecion = txtDirrecion;
	}

	/**
	 * @return the txtTelefono
	 */
	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	/**
	 * @param txtTelefono the txtTelefono to set
	 */
	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	/**
	 * @return the comboSexo
	 */
	public JComboBox<String> getComboSexo() {
		return comboSexo;
	}

	/**
	 * @param comboSexo the comboSexo to set
	 */
	public void setComboSexo(JComboBox<String> comboSexo) {
		this.comboSexo = comboSexo;
	}

	/**
	 * @return the btnCrear
	 */
	public JButton getBtnCrear() {
		return btnCrear;
	}

	/**
	 * @param btnCrear the btnCrear to set
	 */
	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	/**
	 * @return the panel
	 */
	public JPanel getPanel() {
		return panel;
	}

	/**
	 * @param panel the panel to set
	 */
	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	/**
	 * @return the splitPane
	 */
	public JSplitPane getSplitPane() {
		return splitPane;
	}

	/**
	 * @param splitPane the splitPane to set
	 */
	public void setSplitPane(JSplitPane splitPane) {
		this.splitPane = splitPane;
	}

	/**
	 * @return the cOMANDO_CREAR
	 */
	public String getCOMANDO_CREAR() {
		return COMANDO_CREAR;
	}

}
