package Principal;

public class CuentaCorriente extends Cuenta{

	private double saldoExtra=0;
	//private double saldoExtraOriginal=0;
	
	public CuentaCorriente(double saldoExtra)
	{
		this.saldoExtra = saldoExtra;
		//this.saldoExtraOriginal = saldoExtra;
	}
	
	@Override
	public void Extraer(double saldo) {
		
		if(saldo<0)
			throw new RuntimeException("Saldo Negativo. invalido.");
		
		if(((super.saldo + this.saldoExtra) - saldo)< 0) {
			throw new RuntimeException("Saldo insuficiente.");
		}
		
		if(super.saldo > saldo)
			this.saldo -= saldo;
		else
		{
			double diferencia = saldo - this.saldo;
			this.saldo -= (saldo-diferencia);
			this.saldoExtra -= diferencia;
		}
		
	}
	
	
	@Override
	public String consultarSaldo() {
		return "Cuenta Corriente: " + super.consultarSaldo() + " Extra:" + this.saldoExtra;
	}
}
