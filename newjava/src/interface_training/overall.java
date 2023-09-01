package interface_training;

public class overall {

	public static void main(String[] args) {
		
		general gh= new general();
		gh.doctors();
		gh.equiptment();
		gh.nurse();
		gh.operation();
		
      private_hospital ph = new private_hospital();
      ph.doctors();
      ph.equiptment();
      ph.nurse();
      ph.operation();
      
      System.out.println("Overall = poor");
		
	}
	
}
