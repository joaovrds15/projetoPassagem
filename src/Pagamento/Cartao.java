package Pagamento;
import java.util.Calendar;
public class Cartao {
	private int numero;
	private Calendar validade;
	private int codigoDeSeguranca;
	private Conta conta;
	private String bandeira;
	
	public Cartao(int numero, Calendar validade, int codigoDeSeguranca, Conta conta, String bandeira) {
		this.numero = numero;
		this.validade = validade;
		this.codigoDeSeguranca = codigoDeSeguranca;
		this.conta = conta;
		this.bandeira = bandeira;
	}

	public int getNumero() {
		return numero;
	}

	public Calendar getValidade() {
		return validade;
	}

	public int getCodigoDeSeguranca() {
		return codigoDeSeguranca;
	}

	public Conta getConta() {
		return conta;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	
	public boolean solicitaCompra(double valor){ 		//Método responsável por requisitar cobrança de passagem para classe conta
		if(conta.getSaldo() <= valor) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	
	public String mostraDadosDoCartao() {
		return "";							//Esperar ter todos os atributos da classe conta para mostrar dados do cartao
	}
	
	public boolean cartaoValidoOuNao(Cartao cartao){
		 String numeroCartao = Integer.toString(numero);
		 	if(numeroCartao.length() <= 17) {
			 NumeroCartaoException numeroException = new NumeroCartaoException();  // Não existe cartão com mais de 17 digitos
			 throw numeroException;
			 return false;
		 }
		 return true
	}
	
}
