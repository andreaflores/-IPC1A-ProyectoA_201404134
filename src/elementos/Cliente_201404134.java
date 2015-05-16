package elementos;
import java.util.Date;


public class Cliente_201404134 {
	private int codigo;
	private String nombre;
	private String apellido;
	private String nit;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNit() {
		return nit;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	
	public Cliente_201404134(int codigo,String nombre, String apellido, String nit){
		this.codigo=codigo;
		this.nombre=nombre;
		this.apellido=apellido;
		this.nit=nit;
				
	}
	
	public Cliente_201404134(String clientePlano){
		String [] atributos=clientePlano.split(",");
		this.codigo=Integer.parseInt(atributos[0]);
		this.nombre=atributos[1];
		this.apellido=atributos[2];
		this.nit=atributos[3];
		
	}
		public String toString(){
			return codigo+","+nombre+","+apellido+","+nit;
				
		}
}
