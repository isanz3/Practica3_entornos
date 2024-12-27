package cuentas;
/**
 * @author Irene
 */
public class Main {

	/** El resultado de la ejecución es:
		El saldo actual es 2500.0
		Ingreso en cuenta.
	*/
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		operativa_cuenta();
	}
	/**
	 * Método que recoge todo lo relacionado con cuenta1
	 */
	public static void operativa_cuenta(){
		float cantidad;
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
		saldoActual = cuenta1.estado();
		System.out.println("El saldo actual es "+ saldoActual );

		try {
			cuenta1.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar.");
		}
		try {
			System.out.println("Ingreso en cuenta.");
			cuenta1.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar.");
		}
	}

}
