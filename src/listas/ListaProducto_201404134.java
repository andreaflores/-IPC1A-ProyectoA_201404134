package listas;

import java.util.Iterator;

import elementos.Cliente_201404134;
import elementos.Producto_201404134;

public class ListaProducto_201404134 implements Iterator {

	private class Nodo{
		Producto_201404134 info;
		Nodo siguiente;
		
	public Nodo getSiguiente() {
			return siguiente;
		}

		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}

	public Producto_201404134 getInfo() {
			return info;
		}

		public void setInfo(Producto_201404134 actual) {
			this.info = actual;
		}

	public Nodo(Producto_201404134 producto){
		info=producto;
		siguiente= null;
	}
	}
	
	private Nodo primero;
	private int numeroElementos;
	private Nodo actual;
	
	public ListaProducto_201404134(){
		primero=null;
		numeroElementos=0;
		actual=null;
		
			
	}
	
	public void agregar(Producto_201404134 producto){
		if(primero==null){
			primero=new Nodo(producto);
			actual=primero;
			
		}
		
		else{
			agregar(producto, primero);
		}
		numeroElementos++;
	}

	public int getNumeroElementos() {
		return numeroElementos;
	}

	private void agregar(Producto_201404134 producto, Nodo actual){
		if (actual.getSiguiente()==null){
			actual.setSiguiente(new Nodo (producto));
			
		}
		else{
			agregar(producto, actual.getSiguiente());
			
		}
	}
	
	public Producto_201404134 buscar(int codigo){
		return buscar(codigo, primero);
		
	}
	
	private Producto_201404134 buscar(int codigo, Nodo actual){
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
		Producto_201404134 producto1 = new Producto_201404134(2,"caja",300);
		Producto_201404134 producto2 = new Producto_201404134(3,"caja1",30);
		Producto_201404134 producto3 = new Producto_201404134(4,"caj2",230);
		Producto_201404134 producto4 = new Producto_201404134("5,caja3,100");
		
		
		
		ListaProducto_201404134 lista=new ListaProducto_201404134();
		lista.agregar(producto4);
		lista.agregar(producto2);
		lista.recorrer();
		System.out.println("----------------------------------------------");
		lista.agregar(producto1);
		lista.agregar(producto3);
		lista.eliminar(5);
		lista.recorrer();
//		System.out.println(lista.buscar(5).toString());
	}
	
	public boolean eliminar(int codigo){
		if(primero==null){
			return false;
		}else{
			if(primero.getInfo().getCodigo()==codigo){
				primero=primero.getSiguiente();
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
				return true;
			}else{
				return eliminar(codigo, actual.getSiguiente());
			}
		}
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
			return actual!=null;
		
		}

	@Override
	public Producto_201404134 next() {
		// TODO Auto-generated method stub
		Producto_201404134 producto=actual.getInfo();
		actual=actual.getSiguiente();
		return producto;
	}
	
	public void reset(){
		actual=primero;
	}
}
