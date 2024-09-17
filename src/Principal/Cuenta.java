package Principal;

public class Cuenta {

	private double saldo = 0;

	public double getSaldo() {
		return saldo;
	}

	public void Depositar(double deposito) {
		if (deposito < 0)
			System.out.println("El deposito es invalido");
		else
			saldo = saldo + deposito;
	}

	public void Extraer(double extraccion) {
		
		if(extraccion<0)
		{
			System.out.println("El valor a extraer no puede ser negativo.");
			return;
		}
		
		if(saldo>= extraccion)
			saldo = saldo -extraccion;
		else
			System.out.println("Saldo Insuficiente.");
	}

//	public void setSaldo(int saldo) {
//		
//		
//		
//		this.saldo = saldo;
//	}

}
