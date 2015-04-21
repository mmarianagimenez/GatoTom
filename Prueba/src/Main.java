
public class Main {

	public static void main(String[] args) {
		Gato tom = new Gato(5);
	    Raton raton1= new Raton(1.5, 7.0, "Humberto Velez");
		Raton raton2= new Raton(1.5, 7.0, "Armando Paredes");
		Raton raton3 = new Raton(1.5, 7.0, "Mari");
		tom.comerRaton(raton1);
		tom.comerRaton(raton2);
		tom.comerRaton(raton3);
	    System.out.println(tom.ratones);	
	    
	    }
}	