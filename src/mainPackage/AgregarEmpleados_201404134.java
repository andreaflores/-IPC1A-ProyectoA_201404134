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

import elementos.Empleado_201404134;
import elementos.Producto_201404134;

public class AgregarEmpleados_201404134 extends JDialog{
	
	private JPanel contentPane;
	private JTextField codigo;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField edad;
	private JTextField cargo;
	private JLabel codigoL;
	private JLabel nombreL;
	private JLabel apellidoL;
	private JLabel edadL;
	private JLabel cargoL;
	private Empleado_201404134 nuevo;
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AgregarEmpleados frame = new AgregarEmpleados();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}	
	
	public AgregarEmpleados_201404134(Frame parent) {
		super(parent,true);
		nuevo=null;
		this.setBounds(100, 100, 360, 320);
		this.setTitle("Agregar Empleados");
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
		
		edadL = new JLabel();
		edadL.setBounds(25, 140, 70, 20);
		edadL.setFont(new Font("Candara", Font.BOLD, 14));
		edadL.setText("Edad");
		this.getContentPane().add(edadL);
		
		edad = new JTextField();
		edad.setBackground(new Color(255, 255, 255));
		edad.setFont(new Font("Candara", Font.PLAIN, 13));
		edad.setEditable(true);
		edad.setBounds(100, 140, 200, 20);
		this.getContentPane().add(edad);
		
		cargoL = new JLabel();
		cargoL.setBounds(25, 180, 70, 20);
		cargoL.setFont(new Font("Candara", Font.BOLD, 14));
		cargoL.setText("Cargo");
		this.getContentPane().add(cargoL);
		
		cargo = new JTextField();
		cargo.setBackground(new Color(255, 255, 255));
		cargo.setFont(new Font("Candara", Font.PLAIN, 13));
		cargo.setEditable(true);
		cargo.setBounds(100, 180, 200, 20);
		this.getContentPane().add(cargo);
		
		JButton agregar = new JButton("Agregar");
		agregar.setBounds(130, 230, 89, 23);
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
				int edadD=Integer.parseInt(edad.getText());
				String cargoD=cargo.getText();
				nuevo=new Empleado_201404134(codigoD, nombreD, apellidoD, edadD, cargoD);
				setVisible(false);}
				catch(Exception e){
					
				}
			}});
		}
	public void limpiarCampos(){
		codigo.setText("");
		nombre.setText("");
		apellido.setText("");
		edad.setText("");
		cargo.setText("");
		nuevo=null;
	}
	
	public Empleado_201404134 getNuevo(){
		return nuevo;
	}
	
}
