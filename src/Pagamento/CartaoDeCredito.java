package Pagamento;

import java.text.ParseException;

public class CartaoDeCredito extends Cartao {
	public CartaoDeCredito(String numero, String anoVencimento, String mesVencimento, String codigoDeSeguranca,
			ContaCorrente contaCorrente, String bandeiraDigitadaUsuario) throws ParseException {
		
		super(numero, anoVencimento, mesVencimento, codigoDeSeguranca,contaCorrente, bandeiraDigitadaUsuario);
		
	}
	
}
