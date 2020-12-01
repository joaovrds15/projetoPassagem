package Pagamento;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
public static void main(String[] args) throws ParseException{
		Cartao cartao = new Cartao("5478963245987569","2029","01","479",new Conta(2000),"Visa");
		cartao.getConta().realizaCompra(1000, cartao);
		
	}
}