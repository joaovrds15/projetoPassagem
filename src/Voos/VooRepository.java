package Voos;

import java.util.Map;
import java.util.HashMap;

public class VooRepository {
	//Mapa do HashCode de origem, destino e data, e seu respectivo Voo
	private Map<Integer,Voo> voos;

	
	//Contrutor do repositório de Voos
	public VooRepository() {
		this.voos = new HashMap<Integer,Voo>();
	}
	
	//Método que busca o Voo desejado no mapa
	public Voo pesquisarVoo(Voo objVoo) {
		Voo buscaVoo = this.voos.get(objVoo.hashCode());
		VooTester verif = new VooTester();
		
		if(!verif.verificaAtributos(objVoo)) {
			System.out.printf("\nErro ao pesquisar Voo: Dados do Voo inválidos\n");
		}else {
			try {
				buscaVoo.getValorPassagem();
			} catch (Exception e) {
				/**Caso não encontre o Voo no mapa, 
				 * visto que todos seus dados já foram verificados,
				 * adciona o mesmo como um novo Voo
				 */
				adicionarVoo(objVoo);
			}
		}
		return this.voos.get(objVoo.hashCode());
	}
	
	
	//Método que adiciona o novo Voo ao mapa
	public void adicionarVoo(Voo objVoo) {
		VooCreator create = new VooCreator();
		
		try {
			this.voos.put(create.criarVoo(objVoo).hashCode(), create.criarVoo(objVoo));
		} catch (Exception e) {
			System.out.printf("\nErro ao cadastrar novo Voo.\n");
		}
	}

	//Métodos sobrecarregados para venda de passagens
	public void vendePassagem(Voo objVoo, int numPoltrona) {
		//vende uma única passagem, recebendo como parâmetro o número do assento
		this.voos.get(objVoo.hashCode()).vendeAssentos(numPoltrona);
	}
	public void vendePassagem(Voo objVoo, int qtd, int numPoltrona[]) {
		/**vende mais de uma passagem, recebendo como parâmetro o número de poltronas que serão vendidas 
		 *e o número das mesmas no avião, através do vetor numPoltronas
		 */
		this.voos.get(objVoo.hashCode()).vendeAssentos(qtd, numPoltrona);
	}
	
}
