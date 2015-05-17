package listas;
import java.util.Iterator;

import elementos.Venta_201404134;

public class ListaVenta_201404134 implements Iterator {
	private class Nodo{
		Venta_201404134 info;
		Nodo siguiente;
		
	public Nodo getSiguiente() {
			return siguiente;
		}

		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}

	public Venta_201404134 getInfo() {
			return info;
		}

		public void setInfo(Venta_201404134 actual) {
			this.info = actual;
		}

	public Nodo(Venta_201404134 venta){
		info=venta;
		siguiente= null;
	}
	}
	
	private Nodo primero;
	private Nodo actual;
	
	public ListaVenta_201404134(){
		primero=null;
		actual=null;
		
			
	}
	
	public void agregar(Venta_201404134 venta){
		if(primero==null){
			primero=new Nodo(venta);
			actual=primero;
			
		}
		
		else{
			agregar(venta, primero);
		}
	}

	private void agregar(Venta_201404134 venta, Nodo actual){
		if (actual.getSiguiente()==null){
			actual.setSiguiente(new Nodo (venta));
			
		}
		else{
			agregar(venta, actual.getSiguiente());
			
		}
	}
	
	public Venta_201404134 buscar(int codigoProducto){
		return buscar(codigoProducto, primero);
		
	}
	
	private Venta_201404134 buscar(int codigoProducto, Nodo actual){
		if (actual!=null){
			if(actual.getInfo().getCodigoProducto()==codigoProducto){
				return actual.getInfo();
			}
			else{
				return buscar(codigoProducto,actual.getSiguiente());
				
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
		Venta_201404134 venta1 = new Venta_201404134(7,null, 2,1,9);
		Venta_201404134 venta2 = new Venta_201404134(1, null,1,1,1);
		Venta_201404134 venta3 = new Venta_201404134(4,null,4,5,7);
		Venta_201404134 venta4 = new Venta_201404134(1,null,5,9,9);
		Venta_201404134 venta=new Venta_201404134("2,2.1.2000,4,5,6");
		
		ListaVenta_201404134 lista=new ListaVenta_201404134();
//		lista.agregar(venta1);
//		lista.agregar(venta2);
//		lista.recorrer();
//		lista.agregar(venta4);
//		lista.agregar(venta3);
		lista.agregar(venta);
		lista.recorrer();
		System.out.println(lista.buscar(2).toString());
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
			return actual!=null;
		
		}

	@Override
	public Venta_201404134 next() {
		// TODO Auto-generated method stub
		Venta_201404134 venta=actual.getInfo();
		actual=actual.getSiguiente();
		return venta;
	}
}