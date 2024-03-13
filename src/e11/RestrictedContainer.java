package e11;

public class RestrictedContainer <T extends Number >{// c-est une classe generique
	 T conteneur;
	  public T getconteneur() {
		  return conteneur;
	  }
	  public void setconteneur(T conteneur) {
		  this.conteneur=conteneur;
	  }
}
