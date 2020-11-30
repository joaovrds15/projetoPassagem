package Pagamento;

import java.util.Scanner;

public class ContaCorrente extends Conta{
	private double limite;
	public ContaCorrente(double limite,double saldo) {
		super(saldo);
		this.limite = limite;
		
	}
	
	public double getLimite() {
		return limite;
	}

	@Override
	public boolean realizaCompra(double valor) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 1 para pagar no débito e 2 para pagar no crédito");
		int opcao = sc.nextInt();
		if(opcao == 1) {
			return super.realizaCompra(valor);
		}
		else {
			if(limite>= valor) {
				limite -= valor;
				System.out.println("Compra aprovada");
				return true;
			}
			else {
				System.out.println("Compra negada");
				return false;
			}
		}
	}
	
}
