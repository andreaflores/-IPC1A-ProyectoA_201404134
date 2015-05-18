package mainPackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import listas.ListaCliente_201404134;
import listas.ListaEmpleado_201404134;
import listas.ListaProducto_201404134;
import listas.ListaVenta_201404134;
import elementos.Cliente_201404134;
import elementos.Empleado_201404134;
import elementos.Producto_201404134;
import elementos.Venta_201404134;

public class Principal_201404134 extends JFrame {

	private JPanel contentPane;
	private JTextField productos;
	private JTextField clientes;
	private JTextField empleados;
	private JTextField ventas;
	private JLabel archivoProductos;
	private JLabel archivoClientes;
	private JLabel archivoEmpleados;
	private JLabel archivoVentas;
	private ListaCliente_201404134 listaCliente;
	private ListaProducto_201404134 listaProducto;
	private ListaEmpleado_201404134 listaEmpleado;
	private ListaVenta_201404134 listaVenta;
	private JLabel fondo;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal_201404134 frame = new Principal_201404134();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Principal_201404134() {
		this.listaCliente=new ListaCliente_201404134();
		this.listaEmpleado= new ListaEmpleado_201404134();
		this.listaVenta=new ListaVenta_201404134();
		this.listaProducto=new ListaProducto_201404134();
		
		this.setBounds(100, 100, 750, 420);
		this.setTitle("Buscar Archivos");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
				
		fondo=new JLabel(new ImageIcon("/Users/Andrea/Documents/GitHub/-IPC1A-ProyectoA_201404134/src/Imagenes/fondo7.png"));
		fondo.setBounds(0, 0, 750, 370);
		fondo.setVisible(true);
		this.add(fondo);
		
		productos = new JTextField();
		productos.setBackground(new Color(255, 255, 255));
		productos.setFont(new Font("Candara", Font.PLAIN, 12));
		productos.setEditable(false);
		productos.setBounds(10, 38, 376, 20);
		fondo.add(productos);
		productos.setColumns(10);
		
		JButton buscar1 = new JButton("Buscar");
		buscar1.setBounds(396, 37, 89, 23);
		fondo.add(buscar1);
		buscar1.setFont(new Font("Candara", Font.BOLD, 15));
		buscar1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Productos", "prt");
				chooser.setFileFilter(filter);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					productos.setText(chooser.getSelectedFile().getAbsolutePath());
					File archivoProductos = null;
					  FileReader fr = null;
					  BufferedReader br = null;
					  
					  try {
					  archivoProductos = new File (chooser.getSelectedFile().getAbsolutePath());
					  fr = new FileReader (archivoProductos);
					  br = new BufferedReader(fr);
					  
					  String registro;
					  while((registro=br.readLine())!=null){
					  Producto_201404134 producto=new Producto_201404134(registro);
					  listaProducto.agregar(producto);
					  
					  ;}
					  }
					  catch(Exception e){
					  e.printStackTrace();
					  }finally{
					 
					  try{  
					  if( null != fr ){  
					  fr.close();  
					  }  
					  }catch (Exception e2){ 
					  e2.printStackTrace();
					  }
					  }
					  listaProducto.recorrer();
				}
								
			}
		});
		
		clientes = new JTextField();
		clientes.setBackground(new Color(255, 255, 255));
		clientes.setFont(new Font("Candara", Font.PLAIN, 12));
		clientes.setEditable(false);
		clientes.setBounds(10, 94, 376, 20);
		fondo.add(clientes);
		clientes.setColumns(10);
		
		JButton buscar2 = new JButton("Buscar");
		buscar2.setBounds(396, 147, 89, 23);
		fondo.add(buscar2);
		buscar2.setFont(new Font("Candara", Font.BOLD, 15));
		buscar2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Empleados", "emp");
				chooser.setFileFilter(filter);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					empleados.setText(chooser.getSelectedFile().getAbsolutePath());
					File archivoEmpleados = null;
					  FileReader fr = null;
					  BufferedReader br = null;
					  
					  try {
					  archivoEmpleados = new File (chooser.getSelectedFile().getAbsolutePath());
					  fr = new FileReader (archivoEmpleados);
					  br = new BufferedReader(fr);
					  
					  String registro;
					  while((registro=br.readLine())!=null){
					  Empleado_201404134 empleado=new Empleado_201404134(registro);
					  listaEmpleado.agregar(empleado);
					  
					  ;}
					  }
					  catch(Exception e){
					  e.printStackTrace();
					  }finally{
					 
					  try{  
					  if( null != fr ){  
					  fr.close();  
					  }  
					  }catch (Exception e2){ 
					  e2.printStackTrace();
					  }
					  }
					  listaEmpleado.recorrer();
				}
				}
								
		});
		
		empleados = new JTextField();
		empleados.setBackground(new Color(255, 255, 255));
		empleados.setFont(new Font("Candara", Font.PLAIN, 12));
		empleados.setEditable(false);
		empleados.setBounds(10, 150, 376, 20);
		fondo.add(empleados);
		empleados.setColumns(10);
		
		JButton buscar3 = new JButton("Buscar");
		buscar3.setBounds(396, 89, 89, 23);
		fondo.add(buscar3);
		buscar3.setFont(new Font("Candara", Font.BOLD, 15));
		buscar3.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Clientes", "clt");
				chooser.setFileFilter(filter);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					clientes.setText(chooser.getSelectedFile().getAbsolutePath());
					File archivoClientes = null;
					  FileReader fr = null;
					  BufferedReader br = null;
					  
					  try {
					  archivoClientes = new File (chooser.getSelectedFile().getAbsolutePath());
					  fr = new FileReader (archivoClientes);
					  br = new BufferedReader(fr);
					  
					  String registro;
					  while((registro=br.readLine())!=null){
					  Cliente_201404134 cliente=new Cliente_201404134(registro);
					  listaCliente.agregar(cliente);
					  
					  ;}
					  }
					  catch(Exception e){
					  e.printStackTrace();
					  }finally{
					 
					  try{  
					  if( null != fr ){  
					  fr.close();  
					  }  
					  }catch (Exception e2){ 
					  e2.printStackTrace();
					  }
					  }
				}
			listaCliente.recorrer();					
			}
		});
		
		ventas = new JTextField();
		ventas.setBackground(new Color(255, 255, 255));
		ventas.setFont(new Font("Candara", Font.PLAIN, 12));
		ventas.setEditable(false);
		ventas.setBounds(10, 204, 376, 20);
		fondo.add(ventas);
		ventas.setColumns(10);
		
		JButton buscar4 = new JButton("Buscar");
		buscar4.setBounds(396, 201, 89, 23);
		fondo.add(buscar4);
		buscar4.setFont(new Font("Candara", Font.BOLD, 15));
		buscar4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser chooser=new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Ventas", "fct");
				chooser.setFileFilter(filter);
				if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
					ventas.setText(chooser.getSelectedFile().getAbsolutePath());
					File archivoVentas = null;
					  FileReader fr = null;
					  BufferedReader br = null;
					  
					  try {
					  archivoVentas = new File (chooser.getSelectedFile().getAbsolutePath());
					  fr = new FileReader (archivoVentas);
					  br = new BufferedReader(fr);
					  
					  String registro;
					  while((registro=br.readLine())!=null){
					  Venta_201404134 venta=new Venta_201404134(registro);
					  listaVenta.agregar(venta);
					  
					  ;}
					  }
					  catch(Exception e){
					  e.printStackTrace();
					  }finally{
					 
					  try{  
					  if( null != fr ){  
					  fr.close();  
					  }  
					  }catch (Exception e2){ 
					  e2.printStackTrace();
					  }
					  }
					  listaVenta.recorrer();
				}
				}
							
		});
		
		archivoProductos = new JLabel("Archivo Productos");
		archivoProductos.setFont(new Font("Candara", Font.BOLD, 13));
		archivoProductos.setBounds(20, 21, 117, 14);
		fondo.add(archivoProductos);
		
		archivoClientes = new JLabel("Archivo Clientes");
		archivoClientes.setFont(new Font("Candara", Font.BOLD, 13));
		archivoClientes.setBounds(20, 79, 117, 14);
		fondo.add(archivoClientes);
		
		archivoEmpleados = new JLabel("Archivo Empleados");
		archivoEmpleados.setFont(new Font("Candara", Font.BOLD, 13));
		archivoEmpleados.setBounds(20, 135, 110, 14);
		fondo.add(archivoEmpleados);
		
		archivoVentas = new JLabel("Archivo Ventas");
		archivoVentas.setFont(new Font("Candara", Font.BOLD, 13));
		archivoVentas.setBounds(20, 190, 94, 14);
		fondo.add(archivoVentas);
		
		AgregarProductos_201404134 ventanaProducto =new AgregarProductos_201404134(this);
		JButton agregarP = new JButton("Agregar Producto");
		agregarP.setBounds(20, 250, 160, 23);
		fondo.add(agregarP);
		agregarP.setFont(new Font("Candara", Font.BOLD, 15));
		
		agregarP.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ventanaProducto.limpiarCampos();
				ventanaProducto.setVisible(true);
				if(ventanaProducto.getNuevo()!=null){
					listaProducto.agregar(ventanaProducto.getNuevo());
					try
					{
					  String filename= productos.getText();
					  FileWriter fw = new FileWriter(filename,true); 
					  fw.write("\n"+ventanaProducto.getNuevo().toString());
					  fw.close();
					}
					catch(IOException ioe)
					{
					  System.err.println("IOException: " + ioe.getMessage());
					}
				
				}
				listaProducto.recorrer();
			}});
		fondo.add(agregarP);
		
	AgregarCliente_201404134 ventanaCliente =new AgregarCliente_201404134(this);
	JButton agregarC = new JButton("Agregar Cliente");
	agregarC.setBounds(190, 250, 160, 23);
	fondo.add(agregarC);
	agregarC.setFont(new Font("Candara", Font.BOLD, 15));
	
	agregarC.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ventanaCliente.limpiarCampos();
			ventanaCliente.setVisible(true);
			if(ventanaCliente.getNuevo()!=null){
				listaCliente.agregar(ventanaCliente.getNuevo());
				try
				{
				  String filename= clientes.getText();
				  FileWriter fw = new FileWriter(filename,true);
				  fw.write("\n"+ventanaCliente.getNuevo().toString());
				  fw.close();
				}
				catch(IOException ioe)
				{
				  System.err.println("IOException: " + ioe.getMessage());
				}
			
			}
			listaCliente.recorrer();
		}});
	fondo.add(agregarC);
	
	AgregarEmpleados_201404134 ventanaEmpleado =new AgregarEmpleados_201404134(this);
	JButton agregarE= new JButton("Agregar Empleado");
	agregarE.setBounds(360, 250, 160, 23);
	fondo.add(agregarE);
	agregarE.setFont(new Font("Candara", Font.BOLD, 15));
	
	agregarE.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ventanaEmpleado.limpiarCampos();
			ventanaEmpleado.setVisible(true);
			if(ventanaEmpleado.getNuevo()!=null){
				listaEmpleado.agregar(ventanaEmpleado.getNuevo());
				try
				{
				  String filename= empleados.getText();
				  FileWriter fw = new FileWriter(filename,true); 
				  fw.write("\n"+ventanaEmpleado.getNuevo().toString());
				  fw.close();
				}
				catch(IOException ioe)
				{
				  System.err.println("IOException: " + ioe.getMessage());
				}
			
			}
			listaEmpleado.recorrer();
		}});
	fondo.add(agregarE);
	
	
	AgregarVentas_201404134 ventanaVenta =new AgregarVentas_201404134(this);
	JButton agregarV= new JButton("Agregar Venta");
	agregarV.setBounds(530, 250, 160, 23);
	fondo.add(agregarV);
	agregarV.setFont(new Font("Candara", Font.BOLD, 15));
	
	agregarV.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			ventanaVenta.limpiarCampos();
			ventanaVenta.setVisible(true);
			if(ventanaVenta.getNuevo()!=null){
				listaVenta.agregar(ventanaVenta.getNuevo());
				try
				{
				  String filename= ventas.getText();
				  FileWriter fw = new FileWriter(filename,true);
				  fw.write("\n"+ventanaVenta.getNuevo().toString());
				  fw.close();
				}
				catch(IOException ioe)
				{
				  System.err.println("IOException: " + ioe.getMessage());
				}
			
			}
			listaVenta.recorrer();
		}});
	fondo.add(agregarV);
	
	final BuscarP_201404134 buscar= new BuscarP_201404134(this,listaProducto);
	JButton buscarP= new JButton("Buscar Producto");
	buscarP.setBounds(20, 290, 160, 23);
	fondo.add(buscarP);
	buscarP.setFont(new Font("Candara", Font.BOLD, 15));
	buscarP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				buscar.setVisible(true);
		}
		});
	final BuscarC_201404134 buscarcl= new BuscarC_201404134(this, listaCliente);
	JButton buscarC= new JButton("Buscar Cliente");
	buscarC.setBounds(190, 290, 160, 23);
	fondo.add(buscarC);
	buscarC.setFont(new Font("Candara", Font.BOLD, 15));
	buscarC.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			buscarcl.setVisible(true);
		}
	});
	
	final BuscarE_201404134 buscarEm=new BuscarE_201404134(this, listaEmpleado);
	
	JButton buscarE= new JButton("Buscar Empleado");
	buscarE.setBounds(360, 290, 160, 23);
	fondo.add(buscarE);
	buscarE.setFont(new Font("Candara", Font.BOLD, 15));
	buscarE.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			buscarEm.setVisible(true);
		}
	});
	
	
	final Reportes_201404134 reportes=new Reportes_201404134(listaCliente, listaEmpleado, listaProducto, listaVenta);
	
	JButton reportesB= new JButton("Reportes");
	reportesB.setBounds(530, 100, 160, 23);
	fondo.add(reportesB);
	reportesB.setFont(new Font("Candara", Font.BOLD, 15));
	reportesB.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			reportes.setVisible(true);
		}	
	});
	
	final EliminarP_201404134 eliminarPr= new EliminarP_201404134(this);
	JButton eliminarP= new JButton("Eliminar Producto");
	eliminarP.setBounds(20, 330, 160, 23);
	fondo.add(eliminarP);
	eliminarP.setFont(new Font("Candara", Font.BOLD, 15));
	eliminarP.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			eliminarPr.limpiarCampos();
			eliminarPr.setVisible(true);
			if(eliminarPr.getCodigo()>-1){
				boolean eliminado=listaProducto.eliminar(eliminarPr.getCodigo());
				if(eliminado){
					JOptionPane.showMessageDialog(null, "Se eliminó");
					try
					{
					  String filename= productos.getText();
					  FileWriter fw = new FileWriter(filename); 
					  while (listaProducto.hasNext()){
						   fw.write(listaProducto.next().toString()+"\n");
						   
					  }
					 
					  fw.close();
					}
					catch(IOException ioe)
					{
					  System.err.println("IOException: " + ioe.getMessage());
					}
				}else{
					JOptionPane.showMessageDialog(null, "No se eliminó");
				}
			}
		}	
	});
	
	final EliminarC_201404134 eliminarCl=new EliminarC_201404134(this);
	JButton eliminarC= new JButton("Eliminar Cliente");
	eliminarC.setBounds(190, 330, 160, 23);
	fondo.add(eliminarC);
	eliminarC.setFont(new Font("Candara", Font.BOLD, 15));
	eliminarC.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			eliminarCl.limpiarCampos();
			eliminarCl.setVisible(true);
			if(eliminarCl.getCodigo()>-1){
				boolean eliminado=listaCliente.eliminar(eliminarCl.getCodigo());
				if(eliminado){
					JOptionPane.showMessageDialog(null, "Se eliminó");
					try
					{
					  String filename= clientes.getText();
					  FileWriter fw = new FileWriter(filename); 
					  while (listaCliente.hasNext()){
						   fw.write(listaCliente.next().toString()+"\n");
						   
					  }
					 
					  fw.close();
					}
					catch(IOException ioe)
					{
					  System.err.println("IOException: " + ioe.getMessage());
					}
				}else{
					JOptionPane.showMessageDialog(null, "No se eliminó");
				}
			}
		}	
	});
	
	final EliminarE_201404134 eliminarEm=new EliminarE_201404134(this);
	JButton eliminarE= new JButton("Eliminar Empleado");
	eliminarE.setBounds(360, 330, 160, 23);
	fondo.add(eliminarE);
	eliminarE.setFont(new Font("Candara", Font.BOLD, 15));
	eliminarE.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			eliminarEm.setVisible(true);
			eliminarEm.limpiarCampos();
			eliminarEm.setVisible(true);
			if(eliminarEm.getCodigo()>-1){
				boolean eliminado=listaEmpleado.eliminar(eliminarEm.getCodigo());
				if(eliminado){
					JOptionPane.showMessageDialog(null, "Se eliminó el emlpeado");
					try
					{
					  String filename= empleados.getText();
					  FileWriter fw = new FileWriter(filename); 
					  while (listaEmpleado.hasNext()){
						   fw.write(listaEmpleado.next().toString()+"\n");
						   
					  }
					 
					  fw.close();
					}
					catch(IOException ioe)
					{
					  System.err.println("IOException: " + ioe.getMessage());
					}
				}else{
					JOptionPane.showMessageDialog(null, "No se eliminó");
				}
			}
		}	
	});
	}
	
}
