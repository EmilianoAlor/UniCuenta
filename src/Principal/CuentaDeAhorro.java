package Principal;

public class CuentaDeAhorro extends Cuenta{
	
	private double reserva;

	public void reservar(double reserva) {
		
		try {
			super.Extraer(reserva);
	
			this.reserva = reserva;
		}catch (RuntimeException e) {
			System.out.println(e);
		}
	}
	
	public void reintegroTotal()
	{
		super.depositar(reserva);
		reserva = 0;
	}
	
	@Override
	public String consultarSaldo() {
		return "Cuenta de Ahorro: " + super.consultarSaldo() + " Reserva:" + this.reserva;
	}
	
}
