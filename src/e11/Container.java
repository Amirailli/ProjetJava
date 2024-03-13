package e11;

public class Container <T>   {
  T conteneur;
  public T getconteneur() {
	  return conteneur;
  }
  public void setconteneur(T conteneur) {
	  this.conteneur=conteneur;
  }
@Override
public String toString() {
	return "Container [conteneur=" + conteneur + "]";
}
  
}
