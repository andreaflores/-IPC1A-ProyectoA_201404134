package listas;

import elementos.Producto_201404134;

public class ListaProducto_201404134 {

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
	
	public ListaProducto_201404134(){
		primero=null;
		
			
	}
	
	public void agregar(Producto_201404134 producto){
		if(primero==null){
			primero=new Nodo(producto);
			
		}
		
		else{
			agregar(producto, primero);
		}
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
		lista.agregar(producto1);
		lista.agregar(producto3);
		lista.recorrer();
		System.out.println(lista.buscar(5).toString());
	}
}
