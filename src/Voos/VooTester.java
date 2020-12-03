package Voos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VooTester {
	//Metodo verifica se os 3 atributos principais para a presquisa de um voo são válidos
	public boolean verificaAtributos(Voo objVoo) {
		if (!validaOrigem(objVoo.getOrigem())){
			return false;
		}else if(!validaDestino(objVoo.getDestino())){
			return false;
		}else if(!validaData(objVoo.getData())){
			return false;
		}else {
			return true;
		}
	}
	
	//metodo que verifica se a origem é válida
  	public boolean validaOrigem(String origem) {
		if(verificaNulidade(origem)) {
			return true;
		}else if(validaCidade(origem)) {
			return true;
		} else {
			return false;
		}
	}
	
  	//metodo que verifica se o destino é válido
	public boolean validaDestino(String destino) {
		if(verificaNulidade(destino)) {
			return true;
		}else if(validaCidade(destino)) {
			return true;
		} else {
			return false;
		}
	}
	
	//metodo que verifica se a data é válida
	public boolean validaData(String data) {
		if(verificaNulidade(data)) {
			return false;
		}else {
			SimpleDateFormat formData = new SimpleDateFormat("dd/MM/yyyy");
			formData.setLenient(false);
			
			//O try-catch irá veridicar se a data está no formato certo e se é uma data válida;
			try {
				Date dataObj = formData.parse(data);
				return true;
			} catch (ParseException ex) {
				System.out.println("Data inválida");
				return false;
			}
		}
	}
	
	//verifica se a cidade de origem ou destino está cadastrada no sistema
	private boolean validaCidade(String cidade){
		if(!((cidade == "São Paulo") || (cidade == "Rio de Janeiro") || (cidade == "Brasília") || (cidade == "Goiânia"))) {
			System.out.printf("\nErro ao buscar Origem/Destino: Cidade não existe no sistema.\n");
			return false;
		}else {
			return true;
		}
	}
	
	//verifica se o atributo está preenchido
	private boolean verificaNulidade(String atributo) {
		return ((atributo==null) || (atributo==""));
	}
}
