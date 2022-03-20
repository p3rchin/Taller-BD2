package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

public class PanelTablas extends JPanel {

	private JTable tableClientes;

	public PanelTablas() {
		setLayout(new GridLayout(1, 1));
		setBackground(new Color(255, 255, 255));
		tableClientes = new JTable();
	}

	public void limpiarPanel() {
		this.removeAll();
		this.repaint();
	}

	public void mostrarTablaClientes(String[][] infoUsuarios) {
		setBorder(new TitledBorder("Información de usuarios"));
		String[] titulos = { "Nombres", "Apellidos", "Correo", "Cedula", "Dirección", "Número", "Sexo" };
		tableClientes = new JTable(infoUsuarios, titulos);
		JScrollPane sp = new JScrollPane(tableClientes);
		tableClientes.setDefaultEditor(tableClientes.getColumnClass(0), null);
		tableClientes.setRowHeight(20);
		tableClientes.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		sp.setViewportView(tableClientes);
		tableClientes.getTableHeader().setForeground(Color.black);
		tableClientes.getTableHeader().isBackgroundSet();
		tableClientes.getTableHeader().setEnabled(false);
		Font font = new Font("SansSerif", Font.BOLD, 12);
		tableClientes.setFont(font);
		tableClientes.getTableHeader().setFont(font);
		tableClientes.setGridColor(Color.white);
		add(sp);
		validate();
		tableClientes.repaint();
		sp.repaint();
	}

	public JTable getTableClientes() {
		return tableClientes;
	}

	public void setTableClientes(JTable tableClientes) {
		this.tableClientes = tableClientes;
	}

}
