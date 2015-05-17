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
import elementos.Venta_201404134;

public class AgregarVentas_201404134 extends JDialog{

	private JPanel contentPane;
	private JTextField producto;
	private JTextField fecha;
	private JTextField cantidad;
	private JTextField empleado;
	private JTextField cliente;
	private JLabel productoL;
	private JLabel fechaL;
	private JLabel cantidadL;
	private JLabel empleadoL;
	private JLabel clienteL;
	private Venta_201404134 nuevo;
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AgregarVentas frame = new AgregarVentas();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}	
	
	public AgregarVentas_201404134(Frame parent) {
		super(parent,true);
		nuevo=null;
		this.setBounds(100, 100, 360, 320);
		this.setTitle("Agregar Ventas");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		
		productoL = new JLabel();
		productoL.setBounds(25, 20, 60, 20);
		productoL.setFont(new Font("Candara", Font.BOLD, 14));
		productoL.setText("Producto");
		this.getContentPane().add(productoL);
		
		producto = new JTextField();
		producto.setBackground(new Color(255, 255, 255));
		producto.setFont(new Font("Candara", Font.PLAIN, 13));
		producto.setEditable(true);
		producto.setBounds(100, 20, 200, 20);
		this.getContentPane().add(producto);
		
		fechaL = new JLabel();
		fechaL.setBounds(25, 60, 70, 20);
		fechaL.setFont(new Font("Candara", Font.BOLD, 14));
		fechaL.setText("Fecha");
		this.getContentPane().add(fechaL);
		
		fecha = new JTextField();
		fecha.setBackground(new Color(255, 255, 255));
		fecha.setFont(new Font("Candara", Font.PLAIN, 13));
		fecha.setEditable(true);
		fecha.setBounds(100, 60, 200, 20);
		this.getContentPane().add(fecha);
	
		cantidadL = new JLabel();
		cantidadL.setBounds(25, 100, 70, 20);
		cantidadL.setFont(new Font("Candara", Font.BOLD, 14));
		cantidadL.setText("Cantidad");
		this.getContentPane().add(cantidadL);
		
		cantidad = new JTextField();
		cantidad.setBackground(new Color(255, 255, 255));
		cantidad.setFont(new Font("Candara", Font.PLAIN, 13));
		cantidad.setEditable(true);
		cantidad.setBounds(100, 100, 200, 20);
		this.getContentPane().add(cantidad);
		
		empleadoL = new JLabel();
		empleadoL.setBounds(25, 140, 70, 20);
		empleadoL.setFont(new Font("Candara", Font.BOLD, 14));
		empleadoL.setText("Empleado");
		this.getContentPane().add(empleadoL);
		
		empleado = new JTextField();
		empleado.setBackground(new Color(255, 255, 255));
		empleado.setFont(new Font("Candara", Font.PLAIN, 13));
		empleado.setEditable(true);
		empleado.setBounds(100, 140, 200, 20);
		this.getContentPane().add(empleado);
		
		clienteL = new JLabel();
		clienteL.setBounds(25, 180, 70, 20);
		clienteL.setFont(new Font("Candara", Font.BOLD, 14));
		clienteL.setText("Cliente");
		this.getContentPane().add(clienteL);
		
		cliente = new JTextField();
		cliente.setBackground(new Color(255, 255, 255));
		cliente.setFont(new Font("Candara", Font.PLAIN, 13));
		cliente.setEditable(true);
		cliente.setBounds(100, 180, 200, 20);
		this.getContentPane().add(cliente);
		
		JButton agregar = new JButton("Agregar");
		agregar.setBounds(130, 230, 89, 23);
		this.getContentPane().add(agregar);
		agregar.setFont(new Font("Candara", Font.BOLD, 15));
		agregar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try{
				int productoD=Integer.parseInt(producto.getText());
				String fechaD=fecha.getText();
				int cantidadD=Integer.parseInt(cantidad.getText());
				int empleadoD=Integer.parseInt(empleado.getText());
				int clienteD=Integer.parseInt(cliente.getText());
							
				nuevo=new Venta_201404134(productoD, fechaD, cantidadD,empleadoD, clienteD);
				setVisible(false);}
				catch(Exception e){
					
				}
			}});
		}
	public void limpiarCampos(){
		producto.setText("");
		fecha.setText("");
		cantidad.setText("");
		empleado.setText("");
		cliente.setText("");
		nuevo=null;
	}
	
	public Venta_201404134 getNuevo(){
		return nuevo;
}
	
}
