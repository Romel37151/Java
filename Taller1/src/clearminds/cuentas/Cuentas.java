package clearminds.cuentas;

public class Cuentas {

	private String id;
	private String tipo;
	private double saldo;
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Cuentas(String id) {
		this.id=id;
		tipo ="A";
	}
	public Cuentas (String id, String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	public void imprimir() {
		System.out.println("----------");
		System.out.println("CUENTA");
		System.out.println("----------");
		System.out.println("Numero de cuenta: "+ id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD"+saldo);
		
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("***********");
		System.out.println("BIENVENIDO ");
		System.out.println("INFORMACION DE CUENTA");
		System.out.println("***********");
		System.out.println("Numero de la cuenta: "+ id);
		System.out.println("Tipo : "+tipo);
		System.out.println("Saldo: USD"+saldo);
		System.out.println("GRACIAS POR PREFERIRNOS");
		System.out.println("QUE TENGA UN BUEN DIA");
		System.out.println("*************");
	}
}
