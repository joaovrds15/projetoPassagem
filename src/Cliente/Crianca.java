package Cliente;
public class Crianca extends Pessoa {
	private boolean precoIntegral;
	public Crianca(String nome, int idade,int identificacao) {
		super(nome,idade,identificacao);
		//checa a idade para saber se a criança paga preço integral
		if (getIdade()>6) {
			precoIntegral=true;
		}
		else {
			precoIntegral=false;
		}
		//para testar se o número de crianças é igual ao pedido
		numCriancaTeste++;
		
	}
	public boolean getPrecoIntegral() {
		return precoIntegral;
	}
	//Para teste
	public void Informacao(){
		if(getIdade()<16){
		System.out.println("Não é um Adulto");
	}else {
		System.out.println(getIdade());
	}
		if(precoIntegral==false) {
			System.out.println("Preço reduzido");
		}
	}
}
