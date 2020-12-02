package Voos;

import java.util.Map;
import java.util.HashMap;

public class VooRepository {
	//Mapa do HashCode de origem, destino e data e seu respectivo Voo
	private Map<Integer,Voo> voos;
	
	//Contrutor do repositório de Voos
	public VooRepository() {
		this.voos = new HashMap<Integer,Voo>();
	}
	
	public void cadastrarVoo(Voo objVoo) {
		
	}
}
