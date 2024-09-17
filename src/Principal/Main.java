package Principal;

public class Main {

	public static void main(String[] args) {

		// main
		Cuenta cuentaOrigen = new Cuenta();
		cuentaOrigen.depositar(10000);
		System.out.println(cuentaOrigen.consultarSaldo()); // 10000
		Cuenta cuentaDestino = new Cuenta();
		System.out.println(cuentaDestino.consultarSaldo()); // 0
		cuentaOrigen.transferir(5000, cuentaDestino);
		System.out.println(cuentaOrigen.consultarSaldo()); // 9450
		System.out.println(cuentaDestino.consultarSaldo()); // 550

		CuentaDeAhorro cuentaAhorro = new CuentaDeAhorro();

		cuentaAhorro.depositar(1500);

		System.out.println(cuentaAhorro.consultarSaldo()); // 550

		cuentaAhorro.reservar(1600);

		System.out.println(cuentaAhorro.consultarSaldo()); // 550
		
		CuentaCorriente cCorriente = new CuentaCorriente(500);
		
		System.out.println(cCorriente.consultarSaldo());
		
		cCorriente.depositar(1000);
		
		System.out.println(cCorriente.consultarSaldo());
		
		System.out.println(cuentaOrigen.consultarSaldo()); // 9450
		System.out.println(cCorriente.consultarSaldo());
		
		//cuentaOrigen.transferir(5000, cuentaDestino);
		cCorriente.transferir(1500,cuentaOrigen);
		
		System.out.println(cuentaOrigen.consultarSaldo());
		System.out.println(cCorriente.consultarSaldo());
		
		System.out.println(cuentaOrigen.consultarSaldo());
		CuentaCorriente  corrienteDestino = new CuentaCorriente(600);
		cuentaOrigen.transferir(1500, corrienteDestino);
		
		System.out.println(cuentaOrigen.consultarSaldo());
		System.out.println(corrienteDestino.consultarSaldo());
		
		
		
	}

}
