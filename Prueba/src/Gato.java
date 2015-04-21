import java.util.ArrayList;
import java.util.List;


public class Gato {

	Double energia;
	List<String> ratones;
  
    public void comerRaton(Raton raton){
    	this.energia = this.energia + 12 + raton.peso;
    	this.ratones.add(raton.nombre);
    }
    
    public void mostrarNombreRatones(){

    }
    
    public void correrRaton(Raton raton){
    	this.energia = this.energia - (0.5 * raton.metros);
    	
    }
	public Gato(double unaEnergia){
		this.energia = unaEnergia;
		this.ratones = new ArrayList<String>();
	}
	public boolean meConvieneComer(Raton raton){
		return (0.5*raton.metros)<(12 + raton.peso);
	}
	}