package listas;

import java.util.Iterator;

import elementos.Cliente_201404134;
import elementos.Empleado_201404134;

public class ListaCliente_201404134 implements Iterator{
	private class Nodo{
		Cliente_201404134 info;
		Nodo siguiente;
		
	public Nodo getSiguiente() {
			return siguiente;
		}

		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}

	public Cliente_201404134 getInfo() {
			return info;
		}

		public void setInfo(Cliente_201404134 actual) {
			this.info = actual;
		}

	public Nodo(Cliente_201404134 venta){
		info=venta;
		siguiente= null;
	}
	}
	
	private Nodo primero;
	private Nodo actual;
	private int numeroElementos;
	
	public ListaCliente_201404134(){
		primero=null;
		actual=null;
		numeroElementos=0;
		
		
			
	}
	
	public void agregar(Cliente_201404134 cliente){
		if(primero==null){
			primero=new Nodo(cliente);
			actual=primero;
			
			
		}
		
		else{
			agregar(cliente, primero);
			
		}
		numeroElementos ++;
		
	}
	

	public int getNumeroElementos() {
		return numeroElementos;
	}

	private void agregar(Cliente_201404134 cliente, Nodo actual){
		if (actual.getSiguiente()==null){
			actual.setSiguiente(new Nodo (cliente));
			
		}
		else{
			agregar(cliente, actual.getSiguiente());
			
		}
	}
	
	public Cliente_201404134 buscar(int codigo){
		return buscar(codigo, primero);
		
	}
	
	private Cliente_201404134 buscar(int codigo, Nodo actual){
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
		Cliente_201404134 cliente1 = new Cliente_201404134(1,"Andrea", "López", "124345");
		Cliente_201404134 cliente2 = new Cliente_201404134(2, "Pablo", "Torres", "7483584");
		Cliente_201404134 cliente= new Cliente_201404134("5,Juan,Lopez,2837474");
		Cliente_201404134 cliente3 = new Cliente_201404134(3, "Isabel", "Monroy", "64739292");
		Cliente_201404134 cliente4 = new Cliente_201404134(4, "Alfredo", "Turcios", "9384765");
		
		ListaCliente_201404134 lista=new ListaCliente_201404134();
		lista.agregar(cliente4);
		lista.agregar(cliente1);
		lista.recorrer();
		lista.eliminar(1);
		lista.eliminar(4);
		System.out.println("-------------------------");
		lista.agregar(cliente);
		lista.agregar(cliente2);
		lista.agregar(cliente3);
		
		lista.recorrer();
//		System.out.println(lista.buscar(5).toString());
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
			return actual!=null;
		
		}

	@Override
	public Cliente_201404134 next() {
		// TODO Auto-generated method stub
		Cliente_201404134 cliente=actual.getInfo();
		actual=actual.getSiguiente();
		return cliente;
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


