package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logica {
	
	//private PApplet app;
	private LinkedList<Perros> perros;
	private PerrosEdad edadPerros;
	private PerrosNombre nombrePerros;
	private PerrosRaza razaPerros;
	private String[] txtUno, txtDos, txtUnoSplit, txtDoSplit;
	private String raza, edad, nombre;
	private int id;
	
	
	public Logica(PApplet app) {
		//this.app = app;
		this.perros = new LinkedList<Perros>();
		this.edadPerros = new PerrosEdad();
		this.razaPerros = new PerrosRaza();
		this.nombrePerros = new PerrosNombre();
		
		//Agregar los textos importados de perros
		txtUno = app.loadStrings("../data/imports/datosUno.txt");
		txtDos = app.loadStrings("../data/imports/datosDos.txt");
		
		//se crean los fors para poder imprimirlo
		for (int i = 0; i < txtUno.length; i++) {
			txtUnoSplit = txtUno[i].split(",");
			for (int j = 0; j < txtDos.length; j++) {
				txtDoSplit = txtDos[j].split(",");
				if(txtDoSplit[0].equals(txtUnoSplit[0])) {
					id = Integer.parseInt(txtUnoSplit[0]);
					nombre = txtUnoSplit[1];
					//nombre = raza.toLowerCase();
					edad = txtUnoSplit[2];
					raza = txtDoSplit[1];
					//fecha = txtDos[2];
					perros.add(new Perros(edad, raza, nombre, id, 50+(50*i), app));
				}
			}
		}
	}

		
	

	public void sortList(char c) {
		switch (c) { 
		case 'p':
				Collections.sort(perros);
			break;
		case 'e':
				Collections.sort(perros,edadPerros);
			break;
		case 'r':
				Collections.sort(perros,razaPerros);
			break;
		case 'n':
			Collections.sort(perros,nombrePerros);
		break;
		default:
			break;
		}
	}

	public LinkedList<Perros> getPerros() {
		return perros;
	}

	public void setPerros(LinkedList<Perros> perros) {
		this.perros = perros;
	}

	
	
	

	
}
