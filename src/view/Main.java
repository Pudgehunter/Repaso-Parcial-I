package view;


import controller.ControlAll;
import processing.core.PApplet;

public class Main extends PApplet {
	
	ControlAll control;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("view.Main");
	}

	public void settings() {
		size(600,600);
	}
	
	public void setup() {
		control = new ControlAll(this);
	}
	
	public void draw() {
		background(255);
		
		
		for (int i = 0; i < control.listPerros().size(); i++) {
			control.listPerros().get(i).drawLetras(50+(i*20), this);
		}
		
	}
	

	public void keyPressed() {
		control.sortPerros(key);
		control.guardarMetodos();
	}
	
}
