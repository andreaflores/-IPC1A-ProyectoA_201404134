package elementos;

public class Empleado_201404134 {
	private int codigo;
	private String nombre;
	private String apellido;
	private int edad;
	private String cargo;
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Empleado_201404134(int codigo,String nombre, String apellido,int edad, String cargo){
		this.codigo=codigo;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.cargo=cargo;

	}
	
	public Empleado_201404134(String empleadoPlano){
		String [] atributos=empleadoPlano.split(",");
		this.codigo=Integer.parseInt(atributos[0]);
		this.nombre=atributos[1];
		this.apellido=atributos[2];
		this.edad=Integer.parseInt(atributos[3]);
		this.cargo=atributos[4];
	}
	
	
		public String toString(){
			return codigo+","+nombre+","+apellido+","+edad+","+cargo;
				
		}
}
