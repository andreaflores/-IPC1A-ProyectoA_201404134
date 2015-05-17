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

import elementos.Producto_201404134;

public class AgregarProductos_201404134 extends JDialog{

	private JPanel contentPane;
	private JTextField codigo;
	private JTextField descripcion;
	private JTextField precio;
	private JLabel codigoL;
	private JLabel descripcionL;
	private JLabel precioL;
	private Producto_201404134 nuevo;
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					AgregarProductos frame = new AgregarProductos();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}	
	
	public AgregarProductos_201404134(Frame parent ) {
		super(parent,true);
		nuevo=null;
		this.setBounds(100, 100, 360, 270);
		this.setTitle("Agregar Producto");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		
		codigoL = new JLabel();
		codigoL.setBounds(25, 20, 60, 20);
		codigoL.setFont(new Font("Candara", Font.BOLD, 14));
		codigoL.setText("Código");
		this.getContentPane().add(codigoL);
		
		codigo = new JTextField();
		codigo.setBackground(new Color(255, 255, 255));
		codigo.setFont(new Font("Candara", Font.PLAIN, 13));
		codigo.setEditable(true);
		codigo.setBounds(100, 20, 200, 20);
		this.getContentPane().add(codigo);
		
		descripcionL = new JLabel();
		descripcionL.setBounds(25, 60, 70, 20);
		descripcionL.setFont(new Font("Candara", Font.BOLD, 14));
		descripcionL.setText("Descripcion");
		this.getContentPane().add(descripcionL);
		
		descripcion = new JTextField();
		descripcion.setBackground(new Color(255, 255, 255));
		descripcion.setFont(new Font("Candara", Font.PLAIN, 13));
		descripcion.setEditable(true);
		descripcion.setBounds(100, 60, 200, 20);
		this.getContentPane().add(descripcion);
	
		precioL = new JLabel();
		precioL.setBounds(25, 100, 70, 20);
		precioL.setFont(new Font("Candara", Font.BOLD, 14));
		precioL.setText("Precio");
		this.getContentPane().add(precioL);
		
		precio = new JTextField();
		precio.setBackground(new Color(255, 255, 255));
		precio.setFont(new Font("Candara", Font.PLAIN, 13));
		precio.setEditable(true);
		precio.setBounds(100, 100, 200, 20);
		this.getContentPane().add(precio);

		JButton agregar = new JButton("Agregar");
		agregar.setBounds(130, 165, 89, 23);
		this.getContentPane().add(agregar);
		agregar.setFont(new Font("Candara", Font.BOLD, 15));
		agregar.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try{

				int codigoD=Integer.parseInt(codigo.getText());
				String descripcionD=descripcion.getText();
				int precioD=Integer.parseInt(precio.getText());
				nuevo=new Producto_201404134(codigoD,descripcionD,precioD);
				setVisible(false);}
				catch(Exception e){
					
				}
			}});
		}
	public void limpiarCampos(){
		codigo.setText("");
		descripcion.setText("");
		precio.setText("");
		nuevo=null;
	}
	
	public Producto_201404134 getNuevo(){
		return nuevo;
	}
	
}

