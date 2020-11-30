package Pagamento;

public class Conta {
	private double saldo;
	//private Pessoa pessoa;
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public boolean realizaCompra(double valor) {  // Método responsável por cobrar valor da passagem
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Compra aprovada");
			return true;
		}
		else {
			System.out.println("Compre negada. Saldo indisponível");
			return false;
		}
	}

	
}
