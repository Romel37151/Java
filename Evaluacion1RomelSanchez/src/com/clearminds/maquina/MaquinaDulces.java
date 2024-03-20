package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private double saldo;
	private ArrayList<Celda> celdas;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {
		celda = new Celda(celda.getCodigo());

		celdas.add(celda);

	}

	public void mostrarConfiguracion() {
		Celda c1 = celdas.get(0);
		Celda c2 = celdas.get(1);
		Celda c3 = celdas.get(2);
		Celda c4 = celdas.get(3);
		System.out.println("Celda 1: " + c1.getCodigo());
		System.out.println("Celda 2: " + c2.getCodigo());
		System.out.println("Celda 3: " + c3.getCodigo());
		System.out.println("Celda 4: " + c4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		Celda buscarCelda ;

		for (int i = 0; i < celdas.size(); i++) {
			buscarCelda = celdas.get(i);
			if (buscarCelda.getCodigo() == codigo) {
				return buscarCelda;

			}

		}return null;

	}
	public void cargarProducto(Producto producto,String codigo, int items) {
		Celda celdaRecuperada=buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, items);
	}

	public void mostrarProductos() {
		Celda c1 = celdas.get(0);
		Celda c2 = celdas.get(1);
		Celda c3 = celdas.get(2);
		Celda c4 = celdas.get(3);
		if(c1.getProducto()!=null) {
		System.out.println("Celda:"+c1.getCodigo()+" "+c1.getStock()+" "+"producto:"+c1.getProducto().getNombre()+" "+c1.getProducto().getPrecio());
		}else {
			System.out.println("Celda:"+c1.getCodigo()+" "+c1.getStock()+" "+"Sin producto asignado");
		}
		
		if(c2.getProducto()!=null) {
			System.out.println("Celda:"+c2.getCodigo()+" "+c2.getStock()+" "+"producto:"+c2.getProducto().getNombre()+" "+c2.getProducto().getPrecio());
			}else {
				System.out.println("Celda:"+c2.getCodigo()+" "+c2.getStock()+" "+"Sin producto asignado");
			}
		
		if(c3.getProducto()!=null) {
			System.out.println("Celda:"+c3.getCodigo()+" "+c3.getStock()+" "+"producto:"+c3.getProducto().getNombre()+" "+c3.getProducto().getPrecio());
			}else {
				System.out.println("Celda:"+c3.getCodigo()+" "+c3.getStock()+" "+"Sin producto asignado");
			}
		
		if(c4.getProducto()!=null) {
			System.out.println("Celda:"+c4.getCodigo()+" "+c4.getStock()+" "+"producto:"+c4.getProducto().getNombre()+" "+c4.getProducto().getPrecio());
			}else {
				System.out.println("Celda:"+c4.getCodigo()+" "+c4.getStock()+" "+"Sin producto asignado");
			}
		System.out.println("Saldo: "+saldo);
	}
	
	public Producto buscarProductoEnCelda(String codigo) {
		Celda buscarCelda ;

		for (int i = 0; i < celdas.size(); i++) {
			buscarCelda = celdas.get(i);
			if (buscarCelda.getCodigo() == codigo) {
				return buscarCelda.getProducto();

			}

		}return null;
		
		
	}
	public double consultarPrecio(String codigo) {
		Celda buscarCelda ;

		for (int i = 0; i < celdas.size(); i++) {
			buscarCelda = celdas.get(i);
			if (buscarCelda.getCodigo() == codigo) {
				return (double) buscarCelda.getProducto().getPrecio();

			}



		}return (Integer) null;
		
	}
	public Celda buscarCeldaProducto(String codigo) {
		Celda buscarCelda;
		for(int i=0;i<celdas.size();i++) {
			buscarCelda=celdas.get(i);
			if(buscarCelda.getProducto()!=null) {
			if(codigo==buscarCelda.getProducto().getCodigo())
				return buscarCelda;
			}
		}
		return null;
	}
	public void incrementarProductos(String codigo,int items) {
		Celda celdaEncontrada=buscarCeldaProducto(codigo);
		int stok=celdaEncontrada.getStock();
		celdaEncontrada.setStock(stok+items);
		
	}
	public void vender(String codigo) {
		Celda celdaEncontrada=buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo=saldo+celdaEncontrada.getProducto().getPrecio();
		
		mostrarProductos();
	}
	public double venderConCambio(String codigo, double valorIngresado) {
		Celda celdaEncontrada=buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo=saldo+celdaEncontrada.getProducto().getPrecio();
		double vuelto=valorIngresado-celdaEncontrada.getProducto().getPrecio();
		return vuelto;
	}
	public ArrayList<Producto> buscarMenores(double limite) {
		
		ArrayList<Producto> menores=new ArrayList<Producto>();
		Celda buscar;
		Producto encontrado;
		for(int i=0;i<celdas.size();i++) {
			buscar=celdas.get(i);
			if(buscar.getProducto().getPrecio()<=limite) {
				encontrado=buscar.getProducto();
						menores.add(encontrado);
				
			}
			
			
			
		}return menores;
		
		
	}


	

}
