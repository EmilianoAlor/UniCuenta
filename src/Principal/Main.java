package Principal;

public class Main {

	public static void main(String[] args) {

		// main
		Cuenta miCuenta = new Cuenta();
		System.out.println(miCuenta.getSaldo()); // 0
		
		miCuenta.Depositar(1000);
		
		System.out.println(miCuenta.getSaldo()); // 1000
		
		miCuenta.Extraer(550);
		
		System.out.println(miCuenta.getSaldo()); // 450
	}

}
