
public class Gato {

	Double energia;
	Double comidos;
  
    public void comerRaton(Raton raton){
    	this.energia = this.energia + 12 + raton.peso;
    }
    
    public void correrRaton(Raton raton){
    	this.energia = this.energia - (0.5 * raton.metros);
    }
	public Gato(double unaEnergia, double comer){
		this.energia = unaEnergia;
		this.comidos = comer;
	}

}