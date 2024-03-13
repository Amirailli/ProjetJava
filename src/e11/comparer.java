package e11;

public class comparer {
  public <T> void  comparaison (T[] t1, T [] t2){
	  
	  if (t1.length== t2.length) {
		  boolean verifie = true;
	        for (int i = 0; i < t1.length; i++) {
	            if (!t1[i].equals(t2[i])) {
	                verifie = false;
	                break;
	                // on utilise Integer car int ne utilise pas en genericité
	            }
	        }
		 if(verifie == true) {
			 System.out.println("ils ont les mêmes éléments dans le même ordre.");
		 }
		 else {
			 System.out.println("ils ont pas les mêmes éléments dans le même ordre");
		 }
		 }	
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comparer c = new comparer();
	    Integer []  t1  = {1,2,3,4,5};
		Integer  [] t2  = {1,2,3,4,5};
		c.comparaison(t1, t2);
	}

}
