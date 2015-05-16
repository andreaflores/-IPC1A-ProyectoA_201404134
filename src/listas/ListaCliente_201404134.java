package listas;

import elementos.Cliente_201404134;

public class ListaCliente_201404134 {
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
	
	public ListaCliente_201404134(){
		primero=null;
		
			
	}
	
	public void agregar(Cliente_201404134 cliente){
		if(primero==null){
			primero=new Nodo(cliente);
			
		}
		
		else{
			agregar(cliente, primero);
		}
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
		lista.agregar(cliente);
		lista.agregar(cliente2);
		lista.agregar(cliente3);
		lista.recorrer();
		System.out.println(lista.buscar(5).toString());
	}
}

