package Principal;

public class Cuenta {

	protected double saldo = 0;

	public String consultarSaldo() {
		return "Cuenta: Saldo: " + saldo;
	}

	public void depositar(double deposito) {
		if (deposito < 0)
			System.out.println("Valor de deposito Negativo");
		else
			saldo = saldo + deposito;
	}

	public void Extraer(double extraccion) throws RuntimeException {

		if (extraccion < 0)
			throw new RuntimeException("Valor de Saldo Negativo");

		if (saldo >= extraccion)
			saldo = saldo - extraccion;
		else
			throw new RuntimeException("El saldo es insuficiente.");
	}

	public void transferir(double saldoATransferir, Cuenta cuentaDestino) {

		try {
			this.Extraer(saldoATransferir);
			cuentaDestino.depositar(saldoATransferir);
			
		} catch (RuntimeException e) {
			System.out.println(e);
		}
	}

//	public void setSaldo(int saldo) {
//		
//		
//		
//		this.saldo = saldo;
//	}

}
