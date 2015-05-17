package elementos;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Venta_201404134 {
	private int codigoProducto;
	private Date fecha;
	private int cantidad;
	private int codigoEmpleado;
	private int codigoCliente;
	
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
	public Venta_201404134(int codigoProducto,String fecha, int cantidad, int codigoEmpleado, int codigoCliente){
		this.codigoProducto=codigoProducto;
		DateFormat formato=new SimpleDateFormat("dd.MM.yyyy");
		try {
			this.fecha= formato.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en fecha");
		}
		this.cantidad=cantidad;
		this.codigoEmpleado=codigoEmpleado;
		this.codigoCliente=codigoCliente;
		
		
	}
	
	public Venta_201404134(String ventaPlano){
		ventaPlano=ventaPlano.replace(" ", "");
		String [] atributos=ventaPlano.split(",");
		this.codigoProducto=Integer.parseInt(atributos[0]);
		DateFormat formato=new SimpleDateFormat("dd.MM.yyyy");
		try {
			this.fecha= formato.parse(atributos[1]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en fecha");
		}
		this.cantidad=Integer.parseInt(atributos[2]);
		this.codigoEmpleado=Integer.parseInt(atributos[3]);
		this.codigoCliente=Integer.parseInt(atributos[4]);
	}
	
		public String toString(){
			DateFormat formato=new SimpleDateFormat("dd.MM.yyyy");
			return codigoProducto+","+formato.format(fecha)+","+cantidad+","+codigoEmpleado+","+codigoCliente;
			
			
		}
	
}
