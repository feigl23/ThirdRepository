
public class Fakt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tomb [] = new int [11];
		for(int i =1; i < 11; i++){
	  	 tomb[i] = fakt(i);
	      System.out.println(tomb[i]);
		}
		

	}
   public static int fakt(int szam)
   {
	   int fakt =1;
	   for(int i =1; i < szam; i++)
	   {
		   fakt*=i;
		   
	   }
    return (fakt);
   }
	



}
