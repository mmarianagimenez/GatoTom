import java.util.ArrayList;
import java.util.List;


public class Gato {

	Double energia;
	List<Raton> ratones;
  
    public void comerRaton(Raton raton){
    	
    	if (this.ratones.contains(raton)){
    	System.out.println("ya te lo comiste");
    	}
    	else{
    		this.energia = this.energia + 12 + raton.peso;
        	this.ratones.add(raton);
    	}
    	
    }
    
    public void correrRaton(Raton raton){
    	this.energia = this.energia - (0.5 * raton.metros);
    	
    }
	public Gato(double unaEnergia){
		this.energia = unaEnergia;
		this.ratones = new ArrayList<Raton>();
	}
	public boolean meConvieneComer(Raton raton){
		return (0.5*raton.metros)<(12 + raton.peso);
	}
	
	public void explusarRatonPesado(){
		Raton x = new Raton (0.0,0.0,"x");
		List<Raton> listaRaton = new ArrayList<Raton>();
		for (Raton raton:this.ratones){
			listaRaton.add(raton);
		}
		for (Raton raton:this.ratones){
			if (raton.peso > x.peso){
				x=raton;
			}
		    this.ratones.remove(x);
		}
	}
}