package Pagamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
public static void main(String[] args) throws ParseException{
		CartaoDeCredito cartao = new CartaoDeCredito("2458796354124569","2021","12","473",new ContaCorrente(100,5000),"Visa");
		cartao.getConta().realizaCompra(1500);
	}
}