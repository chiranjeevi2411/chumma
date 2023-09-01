package interface_training;

public interface hospital {

	public void operation();
	
	public void  doctors ();
	
	public void nurse ();
	
	public void equiptment ();
	
	default void security() {
		
		System.out.println("super security");
	}
	
	
}
