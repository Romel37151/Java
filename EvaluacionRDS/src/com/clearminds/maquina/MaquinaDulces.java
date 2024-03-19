package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String codigo, String codigo2, String codigo3, String codigo4) {
		Celda celda1 = new Celda(codigo);
		Celda celda2 = new Celda(codigo2);
		Celda celda3 = new Celda(codigo3);
		Celda celda4 = new Celda(codigo4);
		this.celda1 = celda1;
		this.celda2 = celda2;
		this.celda3 = celda3;
		this.celda4 = celda4;

	}

	public void mostrarConfiguracion() {
		System.out.println("celda1: " + celda1.getCodigo());
		System.out.println("celda2: " + celda2.getCodigo());
		System.out.println("celda3: " + celda3.getCodigo());
		System.out.println("celda4: " + celda4.getCodigo());

	}

	public Celda buscarCelda(String codigo) {
		Celda celda = new Celda(codigo);

		if (celda.getCodigo() == celda1.getCodigo()) {
			return celda1;
		} else if (celda.getCodigo() == celda2.getCodigo()) {
			return celda2;
		} else if (celda.getCodigo() == celda3.getCodigo()) {
			return celda3;
		} else if (celda.getCodigo() == celda4.getCodigo()) {
			return celda4;
		} else {
			return null;
		}

	}

	public void cargarProducto(Producto producto, String codigo, int items) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, items);
	}

	public void mostrarProductos() {
		System.out.println("**************celda A1");
		if (celda1.getProducto() == null) {
		
			System.out.println("Stok actual :" + celda1.getStock());
			System.out.println("La celda no tiene producto !!");
			System.out.println("saldo: " + saldo);
		} else {
			System.out.println("Codigo:" + celda1.getProducto().getCodigo());
			System.out.println("Stok actual :" + celda1.getStock());
			System.out.println("Nombre :" + celda1.getProducto().getNombre());
			System.out.println("Precio :" + celda1.getProducto().getPrecio());
			System.out.println("saldo: " + saldo);
		}

		System.out.println("***********celda A2");
		if (celda2.getProducto() == null) {
			
			System.out.println("Stok actual :" + celda2.getStock());
			System.out.println("La celda no tiene producto !!");
			System.out.println("saldo: " + saldo);
		} else {

			System.out.println("Codigo:" + celda2.getProducto().getCodigo());
			System.out.println("Stok actual :" + celda2.getStock());
			System.out.println("Nombre :" + celda2.getProducto().getNombre());
			System.out.println("Precio :" + celda2.getProducto().getPrecio());
			System.out.println("saldo: " + saldo);
		}

		System.out.println("******** celdaB1");
		if (celda3.getProducto() == null) {
			
			System.out.println("Stok actual :" + celda3.getStock());
			System.out.println("La celda no tiene producto !!");
			System.out.println("saldo: " + saldo);
		} else {

			System.out.println("Codigo:" + celda3.getProducto().getCodigo());
			System.out.println("Stok actual :" + celda3.getStock());
			System.out.println("Nombre :" + celda3.getProducto().getNombre());
			System.out.println("Precio :" + celda3.getProducto().getPrecio());
			System.out.println("Codigo :" + celda3.getProducto().getCodigo());
			System.out.println("saldo: " + saldo);

		}

		System.out.println("******* celdaB2");

		if (celda4.getProducto() == null) {
		
			System.out.println("Stok actual :" + celda4.getStock());
			System.out.println("La celda no tiene producto !!");
			System.out.println("saldo: " + saldo);
		} else {

			System.out.println("Codigo:" + celda4.getProducto().getCodigo());
			System.out.println("Stok actual :" + celda4.getStock());
			System.out.println("Nombre :" + celda4.getProducto().getNombre());
			System.out.println("Precio :" + celda4.getProducto().getPrecio());
			System.out.println("saldo: " + saldo);

		}
		

	}

	public Producto buscarProductoEnCelda(String codigo) {
		Celda celda = new Celda(codigo);

		if (celda.getCodigo() == celda1.getCodigo()) {
			return celda1.getProducto();
		} else if (celda.getCodigo() == celda2.getCodigo()) {
			return celda2.getProducto();
		} else if (celda.getCodigo() == celda3.getCodigo()) {
			return celda3.getProducto();
		} else if (celda.getCodigo() == celda4.getCodigo()) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		Celda celda = new Celda(codigo);
		if (celda.getCodigo() == celda1.getCodigo()) {
			return celda1.getProducto().getPrecio();
		} else if (celda.getCodigo() == celda2.getCodigo()) {
			return celda2.getProducto().getPrecio();
		} else if (celda.getCodigo() == celda3.getCodigo()) {
			return celda3.getProducto().getPrecio();
		} else if (celda.getCodigo() == celda4.getCodigo()) {
			return celda4.getProducto().getPrecio();
		} else {
			return (Double) null;

		}

	}

	public Celda buscarCeldaProducto(String codigo) {

		if (celda1.getProducto() != null) {
			if (codigo == celda1.getProducto().getCodigo()) {
				return celda1;

			}
		}
		if (celda2.getProducto() != null) {
			if (codigo == celda2.getProducto().getCodigo()) {
				return celda2;
			}
		}
		if (celda3.getProducto() != null) {
			if (codigo == celda3.getProducto().getCodigo()) {
				return celda3;
			}
		}
		if (celda4.getProducto() != null) {
			if (codigo == celda4.getProducto().getCodigo()) {
				return celda4;
			}
		
	}
		return null;
		}

	public void incrementarProductos(String codigo, int items) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		int stockActual=celdaEncontrada.getStock();	
		celdaEncontrada.setStock(stockActual+items);

	}

	public void vender(String codigo) {
		Celda celdaEn = buscarCelda(codigo);
		celdaEn.setStock(celdaEn.getStock() - 1);

		saldo = saldo + celdaEn.getProducto().getPrecio();

		mostrarProductos();

	}

	public double venderConCambio(String codigo, double valorIngresado) {
		Celda celdaEn = buscarCelda(codigo);
		celdaEn.setStock(celdaEn.getStock() - 1);
		saldo = saldo + celdaEn.getProducto().getPrecio();
		double vuelto = valorIngresado - celdaEn.getProducto().getPrecio();
		return vuelto;

	}
}
