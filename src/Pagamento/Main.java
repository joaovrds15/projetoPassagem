package Pagamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
public static void main(String[] args) throws ParseException{
		CartaoDeCredito cartao = new CartaoDeCredito("5478963245987569","2019","01","479",new ContaCorrente(2000, 5000),"Visa");
		cartao.getConta().realizaCompra(2000);
	}
}