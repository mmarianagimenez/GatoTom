
public class Main {

	public static void main(String[] args) {
		Gato tom = new Gato(5,0);
	    
		Raton raton1 = new Raton(1.5, 7);
	    System.out.println(tom.energia);
		tom.comerRaton(raton1);
		System.out.println(tom.energia);
	    
	    }

}
