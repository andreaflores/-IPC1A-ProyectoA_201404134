package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Fechas_201404134 extends JDialog{
	
	private JPanel contentPane;
	private JLabel fechaInicio;
	private JLabel fechaFin;
	private JTextField inicio;
	private JTextField fin;
	private Date desde;
	private Date hasta;
	
	public Fechas_201404134(Frame parent) {
		super(parent,true);
		desde=null;
		hasta=null;
		
		this.setBounds(100, 100, 230, 330);
		this.setTitle("Fechas");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		fechaInicio = new JLabel("Fecha Inicial");
		fechaInicio.setFont(new Font("Candara", Font.BOLD, 14));
		fechaInicio.setBounds(20, 40, 110, 14);
		this.getContentPane().add(fechaInicio);
		
		inicio = new JTextField();
		inicio.setBackground(new Color(255, 255, 255));
		inicio.setFont(new Font("Candara", Font.PLAIN, 12));
		inicio.setEditable(true);
		inicio.setBounds(10, 68, 200, 20);
		this.getContentPane().add(inicio);
		inicio.setColumns(10);
		
		fechaFin = new JLabel("Fecha Final");
		fechaFin.setFont(new Font("Candara", Font.BOLD, 14));
		fechaFin.setBounds(20, 125, 110, 14);
		this.getContentPane().add(fechaFin);
		
		fin = new JTextField();
		fin.setBackground(new Color(255, 255, 255));
		fin.setFont(new Font("Candara", Font.PLAIN, 12));
		fin.setEditable(true);
		fin.setBounds(10, 140, 200, 20);
		this.getContentPane().add(fin);
		fin.setColumns(10);
		
		JButton generar = new JButton("Generar Reporte");
		generar.setBounds(30, 200, 160, 23);
		this.getContentPane().add(generar);
		generar.setFont(new Font("Candara", Font.BOLD, 15));
		generar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DateFormat formato=new SimpleDateFormat("dd.MM.yyyy");
				try {
					desde=formato.parse(inicio.getText());
					hasta=formato.parse(fin.getText());
					setVisible(false);
					
				}
				catch(Exception e){
					desde=null;
					hasta=null;
									
				}
			}
		
	});
	}
	public Date getDesde() {
		return desde;
	}
	public Date getHasta() {
		return hasta;
	}
	public void limpiarCampos(){
		inicio.setText("");
		fin.setText("");
		desde=null;
		hasta=null;
	}
}
