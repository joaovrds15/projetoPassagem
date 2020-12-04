package venda;

import java.util.Random;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import Voos.*;
import Pagamento.*;
import java.util.Date;

public class Venda {

	private Voo ida;
	private Voo volta;
	private ArrayList<Pessoa> passageiros;
	private double precoTotal;
	private Cartao pagamento;
	private int codigoCompra;
	private Date dataCompra;
	
	public Venda() { 
		// default constructor
	} 
	//construtor
	public Venda(Voo ida, Voo volta, ArrayList<Pessoa> passageiros, double precoTotal,
			Cartao pagamento) {
		this.ida = ida;
		this.volta = volta;
		this.passageiros = passageiros;
		this.precoTotal = precoTotal;
		this.pagamento = pagamento;
	}
	
	public Voo getIda() {
		return ida;
	}
	
	public void setIda(Voo ida) {
		this.ida = ida;
	}

	public Voo getVolta() {
		return volta;
	}

	public void setVolta(Voo volta) {
		this.volta = volta;
	}

	public ArrayList<Pessoa> getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(ArrayList<Pessoa> passageiros) {
		this.passageiros = passageiros;
	}

	// metodo para determinar o valor que sera pago pelo passageiro
	public void precoTotal(Voo ida, Voo volta) {

		double total = 0;
		for (int i = 0; i < passageiros.size(); i++) {

			// Passageiros com menos de dois anos nao pagam
			if (passageiros.get(i).getIdade() < 2) {
				total += 0;
			}

			// Passageiros com mais de 12 anos pagam o valor normal da passagem
			else if (passageiros.get(i).getIdade() > 12) {
				total += ida.getValorPassagem() + volta.getValorPassagem();
			}

			// Passageiros entre 2 e 12 anos pagam 75% do valor da passagem
			else {
				total += ida.getValorPassagem() * 0.75 + volta.getValorPassagem() * 0.75;
			}
		}

		this.precoTotal = total;
	}

	public double getPrecoTotal() {
		return precoTotal;
	}

	public void setPagamento(Cartao pagamento) {
		this.pagamento = pagamento;
	}

	public void setCodigoCompra() {
		int minimo = 100_000_000;
		int maximo = 999_999_999;
		this.codigoCompra = minimo + (int) (new Random().nextFloat() * (maximo - minimo));
	}

	public double getCodigoCompra() {
		return codigoCompra;
	}
	public void setDataCompra() {
		this.dataCompra = new Date();
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	
	// Mostra o preco das passagens e solicita a confirmacao do usuario
	public boolean confirmarPagamento() {
		
		System.out.printf("CONFIRMAR DADOS DO PAGAMENTO \n\n" + "  - VALOR TOTAL DAS PASSAGENS: R$ %.2f" + 
				"\n  - NUMERO DO CARTAO: %s",
				precoTotal, pagamento.getNumero());

		System.out.println("\n\nPARA CONFIRMAR A COMPRA DIGITE O CODIGO DE SEGURANCA DO CARTAO");

		Scanner input = new Scanner(System.in);
		if (input.next().equals(pagamento.getCodigoDeSeguranca())) {
			return true;
		} else	return false;
	}

	public void imprimirPassagens() {

		for (Pessoa cliente : passageiros) {

			System.out.printf(
					"--------------------------------------------------------" + "\n\t\tVOO (IDA)\n\n"
							+ "NOME: %S\t\tCPF/RG: %S \nDATA: %S \t\tHORARIO: %S \nORIGEM: %S\t\tDESTINO: %S\n\n",
					cliente.getNome(), cliente.getId(), ida.getData(), ida.getHorario(), ida.getOrigem(),
					ida.getDestino() + "\n--------------------------------------------------------");

			System.out.printf(
					"--------------------------------------------------------" + "\n\t\tVOO (VOLTA)\n\n"
							+ "NOME: %S\t\tCPF/RG:%S \nDATA: %S\t\tHORARIO: %S \nORIGEM: %S\t\tDESTINO: %S\n\n",
					cliente.getNome(), cliente.getId(), volta.getData(), volta.getHorario(), volta.getOrigem(),
					volta.getDestino() + "\n--------------------------------------------------------\n");

		}
	}
	
	// mostra o codigo/voucher e a data da compra
	public void infoPagamento() {
		System.out.printf("\nCODIGO DA COMPRA: %d \nDATA: ", codigoCompra);
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.print(formatter.format(dataCompra));
	}
	
	// Caso a compra seja confirmada pelo usuario e aprovada pelo banco, 
	// os metodos infoPagamento e imprimirPassagens sao chamados
	
	public void finalizarCompra() {
		if (confirmarPagamento() == true) {
			if (pagamento.getConta().realizaCompra(precoTotal, pagamento) == true) { //package Pagamento
				
				this.setCodigoCompra(); // gerar codigo da compra
				this.setDataCompra(); // gera data e horario da compra
				
				infoPagamento();
				
				System.out.println();
				System.out.println();
				
				imprimirPassagens();
				
				// metodo para atualizar numero de assentos dos voos??
			}
		}
	}
}