/**
 * 
 */
package e11;

/**
 * 
 */
public class Point {
	public char nom;
	public double abs;
	 public Point(char nom, double abs) {
	        this.nom = nom;
	        this.abs = abs;
	 }
	public void afficher(){
	 System.out.println("nom="+nom+"abs="+abs)	;
	}
	public void translate(double x) {
		abs=abs+x;
	}
}
