package cuentasBanco;

public class Main {

	public static void main(String[] args) {
		
		CuentaBanco cuentaPersonal;
		double saldoActual;

		extracted();
	}

	private static void extracted() {
		CuentaBanco cuentaPersonal;
		double saldoActual;
		operativaCuenta(); /** método creado mediante la refactorización */

	}

	public static void operativaCuenta() {
		CuentaBanco cuentaPersonal; /** sección de atributos del metodo operativaCuenta */ 
		double saldoActual; /** atributo del tipo double, sin inicializar */
		float cantidad = 0.0f; /** atributo del tipo float, inicializado */
		cuentaPersonal = new CuentaBanco("Antonio López", "1000-2365-85-1230456789", 2500, 0); /** atributo del tipo cadena, inicializado */
		saldoActual = cuentaPersonal.estado();
		System.out.println("El saldo actual es" + saldoActual);

		try {
			cuentaPersonal.retirar(2300);
		} catch (Exception e) {
			System.out.print("Fallo al retirar");
		}
		try {
			System.out.println("Ingreso en cuenta");
			cuentaPersonal.ingresar(695);
		} catch (Exception e) {
			System.out.print("Fallo al ingresar");
		}
	}

}
