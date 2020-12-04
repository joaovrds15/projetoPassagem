package venda;

import Voos.*;
import Pagamento.*;
import java.text.ParseException;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteVenda {
	public static void main(String[] args) throws ParseException {
		
		Scanner input = new Scanner(System.in);
		ArrayList<Pessoa> passageirosteste = new ArrayList<Pessoa>();
		
		Cartao cartao = new Cartao("5478963245987569","2029","01","479",new Conta(2000),"Visa");
		
		Pessoa p1 = new Adulto("Claussio", "737383", 20);
		Pessoa p2 = new Crianca("Soares", "836742", 5);
		Pessoa p3 = new Crianca("Dimas", "8773", 1);
		
		passageirosteste.add(p1);
		passageirosteste.add(p2);
		passageirosteste.add(p3);

		Voo voo1 = new Voo("Goiania", "Rio de Janeiro", 399, "02/12/2020", "18:21");
		Voo voo2 = new Voo("Rio de Janeiro", "Goiania", 500, "04/01/2021", "21:45");
		
		Venda teste = new Venda();
		
		teste.setIda(voo1);
		teste.setVolta(voo2);
		
		teste.setPassageiros(passageirosteste);
		
		teste.precoTotal(voo1, voo2);
		
		teste.setPagamento(cartao);
		
		teste.finalizarCompra();
	}
}
