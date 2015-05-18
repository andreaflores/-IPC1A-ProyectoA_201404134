package mainPackage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EliminarE_201404134 extends JDialog{
	private JPanel contentPane;
	private JLabel eliminarL;
	private JTextField eliminarT;
	private int codigo;
	

	public EliminarE_201404134(Frame parent) {
		super(parent, true);
				
		this.setBounds(100, 100, 310, 165);
		this.setTitle("Eliminar Empleado");
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(null);
		this.setLocationRelativeTo(null);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		eliminarL = new JLabel("Código del empleado que se quiere eliminar");
		eliminarL.setFont(new Font("Candara", Font.BOLD, 14));
		eliminarL.setBounds(10, 10, 300, 14);
		this.getContentPane().add(eliminarL);
		
		eliminarT = new JTextField();
		eliminarT.setBackground(new Color(255, 255, 255));
		eliminarT.setFont(new Font("Candara", Font.PLAIN, 12));
		eliminarT.setEditable(true);
		eliminarT.setBounds(10, 30, 200, 20);
		this.getContentPane().add(eliminarT);
		eliminarT.setColumns(10);
		
		JButton generar = new JButton("Eliminar Empleado");
		generar.setBounds(30, 60, 160, 23);
		this.getContentPane().add(generar);
		generar.setFont(new Font("Candara", Font.BOLD, 15));
		generar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					codigo=Integer.parseInt(eliminarT.getText());
					setVisible(false);
				}catch(Exception e){
					codigo=-1;
						
				}
			}
		});
	}
	public int getCodigo() {
		return codigo;
			}

public void limpiarCampos(){
	eliminarT.setText("");
	codigo=-1;
	
}
		}