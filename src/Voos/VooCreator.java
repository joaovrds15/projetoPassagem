package Voos;

public class VooCreator {
	
	//Metodo que preenche os demais atributos do Voo a partir da origem e destino
	public Voo criarVoo(Voo obj) {
		
		if(obj.getOrigem().equals("São Paulo")) {
			if(obj.getDestino().equals("Rio de Janeiro")) {
				obj.setValorPassagem(700);
				obj.setHorario("07:00");
			}else if(obj.getDestino().equals("Brasília")) {
				obj.setValorPassagem(1120);
				obj.setHorario("10:45");
			}else if(obj.getDestino().equals("Goiânia")) {
				obj.setValorPassagem(1000);
				obj.setHorario("15:00");
			}
			
		}else if(obj.getOrigem().equals("Rio de Janeiro")) {
			if(obj.getDestino().equals("São Paulo")) {
				obj.setValorPassagem(650);
				obj.setHorario("12:30");
			}else if(obj.getDestino().equals("Brasília")) {
				obj.setValorPassagem(900);
				obj.setHorario("15:00");
			}else if(obj.getDestino().equals("Goiânia")) {
				obj.setValorPassagem(1075);
				obj.setHorario("21:00");
			}
			
		}else if(obj.getOrigem().equals("Brasília")) {
			if(obj.getDestino().equals("São Paulo")) {
				obj.setValorPassagem(900);
				obj.setHorario("13:00");
			}else if(obj.getDestino().equals("Rio de Janeiro")) {
				obj.setValorPassagem(850);
				obj.setHorario("21:00");
			}else if(obj.getDestino().equals("Goiânia")) {
				obj.setValorPassagem(350);
				obj.setHorario("14:00");
			}
			
		}else if(obj.getOrigem().equals("Goiânia")) {
			if(obj.getDestino().equals("São Paulo")) {
				obj.setValorPassagem(890);
				obj.setHorario("14:00");
			}else if(obj.getDestino().equals("Rio de Janeiro")) {
				obj.setValorPassagem(1140);
				obj.setHorario("09:45");
			}else if(obj.getDestino().equals("Brasília")) {
				obj.setValorPassagem(400);
				obj.setHorario("07:00");
			}
			
		}
		
		return obj;
	}
}
