package mainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Buscar Archivos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Candara", Font.PLAIN, 12));
		textField.setEditable(false);
		textField.setBounds(10, 38, 376, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Candara", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Productos", "prt");
				chooser.setFileFilter(filter);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					textField.setText(chooser.getSelectedFile().getAbsolutePath());
				}
								
			}
		});
		btnNewButton.setBounds(396, 37, 89, 23);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setFont(new Font("Candara", Font.PLAIN, 12));
		textField_1.setEditable(false);
		textField_1.setBounds(10, 94, 376, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Buscar");
		btnNewButton_1.setFont(new Font("Candara", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Clientes", "clt");
				chooser.setFileFilter(filter);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					textField.setText(chooser.getSelectedFile().getAbsolutePath());
				}
			}
		});
		btnNewButton_1.setBounds(396, 89, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setFont(new Font("Candara", Font.PLAIN, 12));
		textField_2.setEditable(false);
		textField_2.setBounds(10, 150, 376, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.setFont(new Font("Candara", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Empleados", "emp");
				chooser.setFileFilter(filter);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					textField.setText(chooser.getSelectedFile().getAbsolutePath());
				}
			}
		});
		btnNewButton_2.setBounds(396, 147, 89, 23);
		contentPane.add(btnNewButton_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setFont(new Font("Candara", Font.PLAIN, 12));
		textField_3.setEditable(false);
		textField_3.setBounds(10, 204, 376, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Buscar");
		btnNewButton_3.setFont(new Font("Candara", Font.BOLD, 15));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Venta", "fct");
				chooser.setFileFilter(filter);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					textField.setText(chooser.getSelectedFile().getAbsolutePath());
				}
			}
		});
		btnNewButton_3.setBounds(396, 201, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblArchivoProductos = new JLabel("Archivo Productos");
		lblArchivoProductos.setFont(new Font("Candara", Font.BOLD, 13));
		lblArchivoProductos.setBounds(20, 21, 117, 14);
		contentPane.add(lblArchivoProductos);
		
		JLabel lblArchivoClientes = new JLabel("Archivo Clientes");
		lblArchivoClientes.setFont(new Font("Candara", Font.BOLD, 13));
		lblArchivoClientes.setBounds(20, 79, 117, 14);
		contentPane.add(lblArchivoClientes);
		
		JLabel lblArchivoEmpleados = new JLabel("Archivo Empleados");
		lblArchivoEmpleados.setFont(new Font("Candara", Font.BOLD, 13));
		lblArchivoEmpleados.setBounds(20, 135, 110, 14);
		contentPane.add(lblArchivoEmpleados);
		
		JLabel lblArchivoVentas = new JLabel("Archivo Ventas");
		lblArchivoVentas.setFont(new Font("Candara", Font.BOLD, 13));
		lblArchivoVentas.setBounds(20, 190, 94, 14);
		contentPane.add(lblArchivoVentas);
	}
}
