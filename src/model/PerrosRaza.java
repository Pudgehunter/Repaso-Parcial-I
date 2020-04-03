package model;

import java.util.Comparator;

public class PerrosRaza implements Comparator<Perros> {

	public int compare(Perros o1, Perros o2) {
		return o1.getRazaPerros().compareTo(o2.getRazaPerros());
	}
	
}
