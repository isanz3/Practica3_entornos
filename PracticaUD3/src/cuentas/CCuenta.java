package cuentas;

/**
 * @author Irene
 */

public class CCuenta {

	/**
	 * Atributos
	 * */
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInterés;


	/**getters and setters */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**constructores*/
	public CCuenta()
	{
	}

	public CCuenta(String nom, String cue, double sal, double tipo)
	{
		setNombre(nom);
		setCuenta(cue);
		setSaldo(sal);
	}

	/**otros métodos*/

	/**
	 * 
	 * @return el saldo que hay en ese momento en la cuenta
	 */
	public double estado()
	{
		return getSaldo();
	}

	/**
	 * metodo para modificar el saldo una vez se ha establecido la cantidada a ingresar
	 * @param cantidad
	 * @throws Exception
	 */
	public void ingresar(double cantidad) throws Exception
	{
		if (cantidad<0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		setSaldo ( getSaldo() + cantidad);
	}
	
	/**
	 * metodo para modificar el saldo una vez se ha establecido la cantidada a retirar
	 * @param cantidad
	 * @throws Exception
	 */
	public void retirar(double cantidad) throws Exception
	{
		if (cantidad <= 0)
			throw new Exception ("No se puede retirar una cantidad negativa");
		if (estado()< cantidad)
			throw new Exception ("No se hay suficiente saldo");
		setSaldo ( getSaldo() - cantidad);
	}
}
