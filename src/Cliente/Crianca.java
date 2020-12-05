package Cliente;
public class Crianca extends Pessoa {
	private boolean precoIntegral;
	public Crianca(String nome, int idade,int identificacao) {
		super(nome,idade,identificacao);
		//checa a idade para saber se a crian�a paga pre�o integral
		if (getIdade()>6) {
			precoIntegral=true;
		}
		else {
			precoIntegral=false;
		}
		//para testar se o n�mero de crian�as � igual ao pedido
		numCriancaTeste++;
		
	}
	public boolean getPrecoIntegral() {
		return precoIntegral;
	}
	//Para teste
	public void Informacao(){
		if(getIdade()<16){
		System.out.println("N�o � um Adulto");
	}else {
		System.out.println(getIdade());
	}
		if(precoIntegral==false) {
			System.out.println("Pre�o reduzido");
		}
	}
}
