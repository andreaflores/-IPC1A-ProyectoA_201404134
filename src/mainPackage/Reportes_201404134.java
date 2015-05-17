package mainPackage;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import elementos.Empleado_201404134;
import elementos.Producto_201404134;
import elementos.Venta_201404134;
import listas.ListaCliente_201404134;
import listas.ListaEmpleado_201404134;
import listas.ListaProducto_201404134;
import listas.ListaVenta_201404134;

public class Reportes_201404134 extends JFrame {

	private JPanel contentPane;
	private JLabel reportes;
	private JLabel fondo;
	
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Reportes_201404134 frame = new Reportes_201404134();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	public Reportes_201404134(ListaCliente_201404134 listaCliente, ListaEmpleado_201404134 listaEmpleado, ListaProducto_201404134 listaProducto, ListaVenta_201404134 listaVenta) {
		this.setBounds(100, 100, 240, 330);
		this.setTitle("Generar reportes");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fondo=new JLabel(new ImageIcon("/Users/Andrea/Documents/GitHub/-IPC1A-ProyectoA_201404134/src/Imagenes/fondo7.png"));
		fondo.setBounds(0, 0, 250, 330);
		fondo.setVisible(true);
		this.add(fondo);
		
		reportes = new JLabel("GENERAR REPORTE");
		reportes.setFont(new Font("Candara", Font.BOLD, 18));
		reportes.setBounds(35, 15, 200, 14);
		fondo.add(reportes);
		
		JButton reporteV= new JButton("Ventas");
		reporteV.setBounds(20, 40, 180, 23);
		fondo.add(reporteV);
		reporteV.setFont(new Font("Candara", Font.BOLD, 15));
		reporteV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
				int total=0;
				try
				{
				  String filename= "reporteVentas.html";
				  FileWriter fw = new FileWriter(filename); 
				  fw.write("<html><head></head><body><table><tr><th>Codigo Empleado</th><th>Nombre Empleado</th><th>Fecha</th><th>Codigo Producto</th><th>Producto</th><th>Cantidad</th><th>Precio</th><th>Total</th></tr>");
					while(listaVenta.hasNext()){
						Venta_201404134 venta =listaVenta.next();
//						codigo empleados, nombre empleado, fecha, codigo producto, producto, cantidad, precio, total
						Producto_201404134 producto=listaProducto.buscar(venta.getCodigoProducto());
						Empleado_201404134 empleado=listaEmpleado.buscar(venta.getCodigoEmpleado());
						DateFormat formato=new SimpleDateFormat("dd.MM.yyyy");
						String registro="<td>"+empleado.getCodigo()+"</td><td>"+empleado.getNombre()+"</td><td>"+formato.format(venta.getFecha())+"</td><td>"+producto.getCodigo()+"</td><td>"+producto.getDescripcion()+"</td><td>"+venta.getCantidad()+"</td><td>"+producto.getPrecio()+"</td><td>"+venta.getCantidad()*producto.getPrecio()+"</td>";
						fw.write("<tr>"+ registro+ "</tr>");
						total+=venta.getCantidad()*producto.getPrecio();
						System.out.println(registro);		
					}
					System.out.println("Total ="+ total);
					fw.write("<tr><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>Total</td><td>"+total+"</td></tr></table>");
					fw.write("</body></html>");
				  fw.close();
				}
				catch(IOException ioe)
				{
				  System.err.println("IOException: " + ioe.getMessage());
				}
		
			}
		});
		
		JButton reporteE= new JButton("Ventas por Empleado");
		reporteE.setBounds(20, 78, 180, 23);
		fondo.add(reporteE);
		reporteE.setFont(new Font("Candara", Font.BOLD, 15));
		
		JButton reporteF= new JButton("Ventas por fecha");
		reporteF.setBounds(20, 120, 180, 23);
		fondo.add(reporteF);
		reporteF.setFont(new Font("Candara", Font.BOLD, 15));
		
		JButton reporteC= new JButton("Compras por Cliente");
		reporteC.setBounds(20, 160, 180, 23);
		fondo.add(reporteC);
		reporteC.setFont(new Font("Candara", Font.BOLD, 15));
		
		JButton reporteOv= new JButton("Ordenado de Ventas");
		reporteOv.setBounds(20, 200, 180, 23);
		fondo.add(reporteOv);
		reporteOv.setFont(new Font("Candara", Font.BOLD, 15));
		
		JButton reporteOc= new JButton("Ordenado de Compras");
		reporteOc.setBounds(20, 240, 180, 23);
		fondo.add(reporteOc);
		reporteOc.setFont(new Font("Candara", Font.BOLD, 15));
		
		
	}
}
