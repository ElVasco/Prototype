package main;

import java.util.HashMap;
import java.util.Map;

public class GestorProtoripos {

	private Map<String, Jugador> prototipos = new HashMap<String, Jugador>();
	
	public GestorProtoripos() {
		prototipos.put("delantero", new Delantero());
		prototipos.put("centrocampista", new CentroCampista());
		
	}
	
	public Jugador obtenerJugador(String tipo) {
		if(prototipos.containsKey(tipo)) {
			return (Jugador)prototipos.get(tipo).clone();
		}else {
			System.out.println("tipo incorrecto");
			return null;
		}
	}
}
