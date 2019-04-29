package main;

public class CentroCampista implements Jugador, Cloneable {

	@Override
	public void pasarBalon() {
		System.out.println("Centro campista pasa el balon");
	}

	@Override
	public void tirarAPuerta() {
		System.out.println("Centro campista tira a puerta");
	}

	@Override
	public Object clone() {
		try {
			System.out.println("Clonando centroCampista");
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
