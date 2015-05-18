package listas;

import java.util.Iterator;

import elementos.Empleado_201404134;
import elementos.Venta_201404134;

public class ListaEmpleado_201404134 implements Iterator{
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
	private Nodo actual;
	private int numeroElementos;
	
	public ListaEmpleado_201404134(){
		primero=null;
		actual=null;
		numeroElementos=0;
		
			
	}
	
	public void agregar(Empleado_201404134 empleado){
		if(primero==null){
			primero=new Nodo(empleado);
			actual=primero;
			
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
		numeroElementos ++;
	}
	
	public Empleado_201404134 buscar(int codigo){
		return buscar(codigo, primero);
		
	}
	
	public int getNumeroElementos() {
		return numeroElementos;
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
		lista.eliminar(3);
		System.out.println("----------------------------------------");
		lista.agregar(empleado2);
		lista.agregar(empleado4);
		
		lista.recorrer();
		
//		System.out.println(lista.buscar(4).toString());
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
			return actual!=null;
		
		}

	@Override
	public Empleado_201404134 next() {
		// TODO Auto-generated method stub
		Empleado_201404134 empleado=actual.getInfo();
		actual=actual.getSiguiente();
		return empleado;
	}
	
	public void reset(){
		actual=primero;
		
		
	}
	public boolean eliminar(int codigo){
		if(primero==null){
			return false;
		}else{
			if(primero.getInfo().getCodigo()==codigo){
				primero=primero.getSiguiente();
				this.numeroElementos--;
				return true;
			}else{
				return eliminar(codigo, primero);
			}
		}
				
	}
	public boolean eliminar(int codigo,Nodo actual){
		if(actual.getSiguiente()==null){
			return false;
		}else{
			if(actual.getSiguiente().getInfo().getCodigo()==codigo){
				actual.setSiguiente(actual.getSiguiente().getSiguiente());
				this.numeroElementos--;
				return true;
			}else{
				return eliminar(codigo, actual.getSiguiente());
			}
		}
	}
}
