package Telas;

import java.util.Scanner;
import Voos.Voo;
import Voos.VooRepository;

public class TelaInicio {
	public void abrirTela() {
		Scanner scan = new Scanner(System.in);
		Voo voo = new Voo();
		VooRepository vooRep = new VooRepository();
		String parametro;
		
		System.out.printf("\t\tBem Vindo!\n");
		System.out.printf("Digite Origem:\n");
		parametro = scan.nextLine();
		voo.setOrigem(parametro);
		
		System.out.println("Digite o destino:");
		voo.setDestino(scan.nextLine());
		
		System.out.println("Digite a data do voo: dd/MM/yyyy");
		voo.setData(scan.nextLine());
		
		System.out.println("Digite a quantidade de adultos:");
		Integer adultos = scan.nextInt();
		System.out.println("Quantidade de crianças:");
		Integer criancas = scan.nextInt();
		System.out.println("Digite a idade das criancas");
		Integer idade = scan.nextInt();
		//System.out.println(vooRep.pesquisarVoo(voo).getHorario());
		
		// Colocar data de volta
		
	
		scan.close();
	}
	
	
}
