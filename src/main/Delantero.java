package main;

public class Delantero implements Jugador, Cloneable {

	@Override
	public void pasarBalon() {
		System.out.println("Delantero pasa el balon");
	}

	@Override
	public void tirarAPuerta() {
		System.out.println("Delantero tira a puerta");
	}
	
	@Override
	public Object clone() {
		try {
			System.out.println("clonando Delantero");
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

}
