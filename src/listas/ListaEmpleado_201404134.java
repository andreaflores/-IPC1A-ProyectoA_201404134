package listas;

import elementos.Empleado_201404134;

public class ListaEmpleado_201404134 {
	private class Nodo{
		Empleado_201404134 info;
		Nodo siguiente;
		
	public Nodo getSiguiente() {
			return siguiente;
		}

		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}

	public Empleado_201404134 getInfo() {
			return info;
		}

		public void setInfo(Empleado_201404134 actual) {
			this.info = actual;
		}

	public Nodo(Empleado_201404134 empleado){
		info=empleado;
		siguiente= null;
	}
	}
	
	private Nodo primero;
	
	public ListaEmpleado_201404134(){
		primero=null;
		
			
	}
	
	public void agregar(Empleado_201404134 empleado){
		if(primero==null){
			primero=new Nodo(empleado);
			
		}
		
		else{
			agregar(empleado, primero);
		}
	}

	private void agregar(Empleado_201404134 empleado, Nodo actual){
		if (actual.getSiguiente()==null){
			actual.setSiguiente(new Nodo (empleado));
			
		}
		else{
			agregar(empleado, actual.getSiguiente());
			
		}
	}
	
	public Empleado_201404134 buscar(int codigo){
		return buscar(codigo, primero);
		
	}
	
	private Empleado_201404134 buscar(int codigo, Nodo actual){
		if (actual!=null){
			if(actual.getInfo().getCodigo()==codigo){
				return actual.getInfo();
			}
			else{
				return buscar(codigo,actual.getSiguiente());
				
			}
		}
		return null;
	}
	
	public void recorrer(){
		recorrer(primero);
	}
	private void recorrer(Nodo actual){
		if(actual!=null){
			System.out.println(actual.getInfo().toString());
			recorrer(actual.getSiguiente());
		}
		
	}
	
	public static void main (String[] arg){
		Empleado_201404134 empleado1 = new Empleado_201404134(1,"Mario", "Paz", 35, "vendedor");
		Empleado_201404134 empleado2 = new Empleado_201404134(2, "Luis", "García",24, "supervisor");
		Empleado_201404134 empleado3 = new Empleado_201404134(3, "David", "Morales",41, "vendedor");
		Empleado_201404134 empleado4 = new Empleado_201404134("4,Alejandra,Quezada,43,gerente");
		
	ListaEmpleado_201404134 lista=new ListaEmpleado_201404134();
		lista.agregar(empleado1);
		lista.agregar(empleado3);
		lista.recorrer();
		lista.agregar(empleado2);
		lista.agregar(empleado4);
		lista.recorrer();
		System.out.println(lista.buscar(4).toString());
	}
}
