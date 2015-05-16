package elementos;

public class Producto_201404134 {
	
	private String descripcion;
	private int precio;
	private int codigo;
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
public Producto_201404134(int codigo, String descripcion, int precio){
	this.codigo=codigo;
	this.descripcion=descripcion;
	this.precio=precio;

	
}

public Producto_201404134(String productoPlano){
	String [] atributos=productoPlano.split(",");
	this.codigo=Integer.parseInt(atributos[0]);
	this.descripcion=atributos[1];
	this.precio=Integer.parseInt(atributos[2]);
}



public String toString(){
		return codigo+","+ descripcion+","+precio;
		
	}

}
