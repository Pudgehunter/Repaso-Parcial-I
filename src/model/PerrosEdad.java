package model;

import java.util.Comparator;

public class PerrosEdad implements Comparator<Perros> {

	public int compare(Perros o1, Perros o2) {
		return o1.getEdadPerros() - o2.getEdadPerros();
	}
}
