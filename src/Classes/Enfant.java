package Classes;

import java.util.List;

public class Enfant {
	private String nom;
	private int x;
	private int y;
	public Enfant(String nom, int x, int y) {
		super();
		this.nom = nom;
		this.x = x;
		this.y = y;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public Abri trouver(List<Abri> abris) {
		Abri proche=null;
		int distanceMin = Integer.MAX_VALUE;
		for(Abri abri:abris) {
			int distance = (int)(Math.pow(abri.getX()-x, 2)+Math.pow(abri.getY()-y, 2));
			if(distance<distanceMin) {
				distanceMin=distance;
				proche=abri;
			}
		}
		return proche;
	}
}
