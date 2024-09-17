package Principal;

public class Main {

	public static void main(String[] args) {

		// main
		Cuenta miCuenta = new Cuenta();
		System.out.println(miCuenta.saldo); // 0
		miCuenta.saldo += 1000;
		System.out.println(miCuenta.saldo); // 1000
		miCuenta.saldo -= 550;
		System.out.println(miCuenta.saldo); // 450
	}

}
