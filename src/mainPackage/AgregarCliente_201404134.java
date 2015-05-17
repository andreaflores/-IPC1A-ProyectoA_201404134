package mainPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import elementos.Cliente_201404134;
import elementos.Producto_201404134;

public class AgregarCliente_201404134 extends JDialog{

	private JPanel contentPane;
	private JTextField codigo;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField nit;
	private JLabel codigoL;
	private JLabel nombreL;
	private JLabel apellidoL;
	private JLabel nitL;
	private Cliente_201404134 nuevo;
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AgregarCliente frame = new AgregarCliente();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}	
	
	public AgregarCliente_201404134(Frame parent) {
		super(parent,true);
		nuevo=null;
		this.setBounds(100, 100, 360, 300);
		this.setTitle("Agregar Clientes");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		
		codigoL = new JLabel();
		codigoL.setBounds(25, 20, 50, 20);
		codigoL.setFont(new Font("Candara", Font.BOLD, 14));
		codigoL.setText("Código");
		this.getContentPane().add(codigoL);
		
		codigo = new JTextField();
		codigo.setBackground(new Color(255, 255, 255));
		codigo.setFont(new Font("Candara", Font.PLAIN, 13));
		codigo.setEditable(true);
		codigo.setBounds(100, 20, 200, 20);
		this.getContentPane().add(codigo);
		
		nombreL = new JLabel();
		nombreL.setBounds(25, 60, 70, 20);
		nombreL.setFont(new Font("Candara", Font.BOLD, 14));
		nombreL.setText("Nombre");
		this.getContentPane().add(nombreL);
		
		nombre = new JTextField();
		nombre.setBackground(new Color(255, 255, 255));
		nombre.setFont(new Font("Candara", Font.PLAIN, 13));
		nombre.setEditable(true);
		nombre.setBounds(100, 60, 200, 20);
		this.getContentPane().add(nombre);
	
		apellidoL = new JLabel();
		apellidoL.setBounds(25, 100, 70, 20);
		apellidoL.setFont(new Font("Candara", Font.BOLD, 14));
		apellidoL.setText("Apellido");
		this.getContentPane().add(apellidoL);
		
		apellido = new JTextField();
		apellido.setBackground(new Color(255, 255, 255));
		apellido.setFont(new Font("Candara", Font.PLAIN, 13));
		apellido.setEditable(true);
		apellido.setBounds(100, 100, 200, 20);
		this.getContentPane().add(apellido);
		
		nitL = new JLabel();
		nitL.setBounds(25, 140, 70, 20);
		nitL.setFont(new Font("Candara", Font.BOLD, 14));
		nitL.setText("Nit");
		this.getContentPane().add(nitL);
		
		nit = new JTextField();
		nit.setBackground(new Color(255, 255, 255));
		nit.setFont(new Font("Candara", Font.PLAIN, 13));
		nit.setEditable(true);
		nit.setBounds(100, 140, 200, 20);
		this.getContentPane().add(nit);
		
		JButton agregar = new JButton("Agregar");
		agregar.setBounds(130, 200, 89, 23);
		this.getContentPane().add(agregar);
		agregar.setFont(new Font("Candara", Font.BOLD, 15));
		agregar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try{

				int codigoD=Integer.parseInt(codigo.getText());
				String nombreD=nombre.getText();
				String apellidoD=apellido.getText();
				String nitD=nit.getText();
			
				nuevo=new Cliente_201404134(codigoD,nombreD,apellidoD,nitD);
				setVisible(false);}
				catch(Exception e){
					
				}
			}});
		}
	public void limpiarCampos(){
		codigo.setText("");
		nombre.setText("");
		apellido.setText("");
		nit.setText("");
		nuevo=null;
	}
	
	public Cliente_201404134 getNuevo(){
		return nuevo;
	}
	

}