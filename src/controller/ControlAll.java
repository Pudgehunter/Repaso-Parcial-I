package controller;

import java.util.LinkedList;
import model.Logica;
import model.Perros;
import processing.core.PApplet;

public class ControlAll {
	
	//private PApplet app;
	private Logica logica;
	
	public ControlAll(PApplet app) {
		//this.app = app;
		this.logica = new Logica(app);
	}
	
	public void sortPerros(char c) {
		logica.sortList(c);
	}
	
	public void guardarMetodos() {
		logica.guardarMetodos();
	}
	
	public LinkedList<Perros> listPerros() {
		return logica.getPerros();
	} 

}