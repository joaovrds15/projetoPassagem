package Cliente;
public class Adulto extends Pessoa{
	public Adulto(String nome, int idade,int identificacao) {
		super(nome,idade,identificacao);
		//para testar se o n�mero de crian�as � igual ao pedido
		numAdultoTeste++;
		}
}
