package Principal;

public class Cuenta {

	private double saldo = 0;

	public double consultarSaldo() {
		return saldo;
	}

	public void depositar(double deposito) {
		if (deposito < 0)
			System.out.println("El deposito es invalido");
		else
			saldo = saldo + deposito;
	}

	public void Extraer(double extraccion) {

		if (extraccion < 0) {
			System.out.println("El valor a extraer no puede ser negativo.");
			return;
		}

		if (saldo >= extraccion)
			saldo = saldo - extraccion;
		else
			System.out.println("Saldo Insuficiente.");
	}

	public void transferir(double saldoATransferir, Cuenta cuentaDestino) {
		if (saldoATransferir > 0) {
			if(this.saldo>= saldoATransferir)
			{
				this.Extraer(saldoATransferir);
				cuentaDestino.depositar(saldoATransferir);
			}
			else
				System.out.println("Saldo insuficiente.");
		} else
			System.out.println("Saldo a transferir incorrecto. No puede ser negativo.");
	}

//	public void setSaldo(int saldo) {
//		
//		
//		
//		this.saldo = saldo;
//	}

}
