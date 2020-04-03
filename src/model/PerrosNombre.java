package model;

import java.util.Comparator;

public class PerrosNombre implements Comparator <Perros>{

	public int compare(Perros o1, Perros o2) {
		return o1.getNombrePerros().compareTo(o2.getNombrePerros());
		}
	
}
