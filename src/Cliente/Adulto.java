package Cliente;
public class Adulto extends Pessoa{
	public Adulto(String nome, int idade,int identificacao) {
		super(nome,idade,identificacao);
		//para testar se o número de crianças é igual ao pedido
		numAdultoTeste++;
		}
}
