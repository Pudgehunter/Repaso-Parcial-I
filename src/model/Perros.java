package model;

import processing.core.PApplet;

public class Perros implements Comparable<Perros> {
	
	private String edadPerros, razaPerros, nombrePerros;
	private PApplet app;
	private int idPerros, posY, posX;
	
	public Perros(String edadPerros,String razaPerros,String nombrePerros, int idPerros, int posY,PApplet app) {
		this.edadPerros = edadPerros;
		this.razaPerros = razaPerros;
		this.nombrePerros = nombrePerros;
		this.idPerros = idPerros;
		this.app = app;
		this.posY = posY;
	}
	
	public void drawLetras(int posX, PApplet app) {
		app.fill(0);
//		app.rect(posX,posY+30,50,50);
		app.text(edadPerros, posX, posY);
		app.text(razaPerros, posX+50, posY);
		app.text(nombrePerros, posX+200, posY);
		app.text(idPerros, posX+350, posY);
	}
	

	public String getEdadPerros() {
		return edadPerros;
	}

	public void setEdadPerros(String edadPerros) {
		this.edadPerros = edadPerros;
	}

	public String getRazaPerros() {
		return razaPerros;
	}

	public void setRazaPerros(String razaPerros) {
		this.razaPerros = razaPerros;
	}

	public String getNombrePerros() {
		return nombrePerros;
	}

	public void setNombrePerros(String nombrePerros) {
		this.nombrePerros = nombrePerros;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getIdPerros() {
		return idPerros;
	}

	public void setIdPerros(int idPerros) {
		this.idPerros = idPerros;
	}

	@Override
	public int compareTo(Perros o) {
		// TODO Auto-generated method stub
		return  this.idPerros - o.getIdPerros();
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}


}
