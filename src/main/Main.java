package main;

public class Main {

	public static void main(String[] args) {
		GestorProtoripos gp = new GestorProtoripos();
		Jugador d1 = gp.obtenerJugador("delantero");
		Jugador d2 = gp.obtenerJugador("delantero");
		Jugador cp1 = gp.obtenerJugador("centrocampista");
		
		d1.pasarBalon();
		cp1.tirarAPuerta();
	}

}
