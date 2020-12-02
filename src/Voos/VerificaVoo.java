package Voos;

public abstract class VerificaVoo {
	public void verificaAtributos(Voo objVoo) {
		
	}
	
	private void verificaOrigem(String origem) {
		verificaNulidade(origem);
	}
	
	private void verificaDestino(String destino) {
		verificaNulidade(destino);
	}
	
	private void verificaData(String data) {
		verificaNulidade(data);
	}
	
	private boolean verificaNulidade(String atributo) {
		
		return false;
	}
}
