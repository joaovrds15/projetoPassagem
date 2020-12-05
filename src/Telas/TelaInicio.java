package Telas;

import java.util.Scanner;
import Voos.Voo;

public class TelaInicio {
	public void abrirTela() {
		Scanner scan = new Scanner(System.in);
		Voo voo = new Voo();
		String parametro;
		
		System.out.printf("\t\tBem Vindo!\n");
		System.out.printf("Digite Origem:\n");
		parametro = scan.next();
		
		System.out.printf("%s", parametro);
	
		scan.close();
	}
	
	
}
