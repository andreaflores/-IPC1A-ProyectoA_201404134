package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import elementos.Producto_201404134;
import listas.ListaProducto_201404134;


public class BuscarP_201404134 extends JDialog{
	private JPanel contentPane;
	private JLabel buscarL;
	private JTextField buscarT;
	private JTextArea text;
	
	public BuscarP_201404134(Frame parent, ListaProducto_201404134 listaProducto){
		super(parent, true);
	this.setBounds(100, 100, 330, 290);
	this.setTitle("Buscar Productos");
//	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.getContentPane().setLayout(null);
	this.setLocationRelativeTo(null);
	contentPane = new JPanel();
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	buscarL = new JLabel("Código del producto");
	buscarL.setFont(new Font("Candara", Font.BOLD, 14));
	buscarL.setBounds(20, 15, 200, 14);
	this.getContentPane().add(buscarL);
	
	buscarT = new JTextField();
	buscarT.setBackground(new Color(255, 255, 255));
	buscarT.setFont(new Font("Candara", Font.PLAIN, 12));
	buscarT.setEditable(true);
	buscarT.setBounds(10, 35, 200, 20);
	this.contentPane.add(buscarT);
	buscarT.setColumns(10);
	
	JButton buscarP = new JButton("Buscar Producto");
	buscarP.setBounds(30, 70, 160, 23);
	this.getContentPane().add(buscarP);
	buscarP.setFont(new Font("Candara", Font.BOLD, 15));
	buscarP.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			try{
				int codigo=Integer.parseInt(buscarT.getText());
				Producto_201404134 producto =listaProducto.buscar(codigo);
				if(producto==null){
					JOptionPane.showMessageDialog(null, "No se encontró el producto");
				}else{
					String productoPlano=producto.toString();
					productoPlano=productoPlano.replace(',','\t');
					text.append(productoPlano+"\n");
				}
				
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null, "El código ingresado no es correcto");
			}
		}
		});
	
	text=new JTextArea();
	
	text.setBounds(10, 120, 285, 50);
	text.setEditable(false);
	text.setFont(new Font("Candara", Font.BOLD, 12));
	text.append("Código\tDescripción\tPrecio\n");
	this.getContentPane().add(text);
	
	}
}
