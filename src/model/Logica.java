package model;

import java.util.Collections;
import java.util.LinkedList;

import processing.core.PApplet;

public class Logica {
	
	private PApplet app;
	private LinkedList<Perros> perros;
	private PerrosEdad edadPerros;
	private PerrosNombre nombrePerros;
	private PerrosRaza razaPerros;
	String[] txtUno, txtDos, txtUnoSplit, txtDoSplit;
	private String raza, nombre;
	private int id, edad;
	
	public Logica(PApplet app) {
		this.app = app;
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
					edad = Integer.parseInt(txtUnoSplit[2]);
					raza = txtDoSplit[1];
					perros.add(new Perros(id, raza, nombre, edad, app));
				}
			}

		}
		
	}

	public void sortList(char c) {
		switch (c) { 
		case 'a':
				Collections.sort(perros);
				System.out.println("Si funciono p");
				//app.saveStrings("ID.txt",guardarTextosID);
			break;
		case 's':
				Collections.sort(perros,edadPerros);
				System.out.println("Si funciono e");
				//app.saveStrings("Raza.txt",guardarTextosRaza);
			break;
		case 'd':
				Collections.sort(perros,razaPerros);
				System.out.println("Si funciono r");
				//app.saveStrings("Nombre.txt",guardarTextosNombre);
			break;
		case 'f':
			Collections.sort(perros,nombrePerros);
			System.out.println("Si funciono n");
			//app.saveStrings("Edad.txt",guardarTextosEdad);
		break;
		default:
			break;
		}
	}
	
	public void guardarMetodos() {
		
		String[] guardarTxt;
		guardarTxt = new String [perros.size()];
		
		for (int i = 0; i < perros.size(); i++) {
			
			String guardarPerrosEdad =  "perros.get(i).getEdadPerros()";
			String guardarPerrosNombre = perros.get(i).getNombrePerros();
			String guardarPerrosRaza = perros.get(i).getRazaPerros();
			String guardarPerrosID = "perros.get(i).getIdPerros()";
			
			guardarTxt[i] = guardarPerrosID
					+ guardarPerrosNombre
					+ guardarPerrosRaza
					+ guardarPerrosEdad;
		}
		app.saveStrings("../data/exports/ID.txt", guardarTxt);
	}
	

	public LinkedList<Perros> getPerros() {
		return perros;
	}

	public void setPerros(LinkedList<Perros> perros) {
		this.perros = perros;
	}

	
	
	

	
}
