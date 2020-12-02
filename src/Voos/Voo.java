package Voos;

public class Voo {
	private static final int NUM_ASSENTOS = 60;
	
	//cidade de origem do voo
	private String origem;
	
	//cidade de destino
	private String destino;
	
	//valor da passagem
	private double valorPassagem;
	
	//data do voo
	private String data;
	
	//horario do voo
	private String horario;
	
	/**Assentos disponiveis no voo;
	 * true = assento disponível
	 * false = assento não disponível
	 */
	private boolean assentos[] = new boolean[NUM_ASSENTOS];
	
	
	//metodos contrutores
	public Voo(String origem, String destino, double valorPassagem, String data, String horario) {
		this.origem = origem;
		this.destino = destino;
		this.valorPassagem = valorPassagem;
		this.data = data;
		this.horario = horario;
		geraAssentos();
	}
	public Voo(String origem, String destino, double valorPassagem, String horario) {
		this(origem,destino,valorPassagem, null, horario);
	}
	public Voo(String origem, String destino, String data) {
		this(origem,destino, 0, data, null);
	}
	
	
	//metodos get e set do atributo origem
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	
	//metodos get e set do atributo destino
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}

	//metodos get e set do atributo valorPassagem
	public double getValorPassagem() {
		return valorPassagem;
	}
	public void setValorPassagem(double valorPassagem) {
		this.valorPassagem = valorPassagem;
	}

	//metodos get e set do atributo data
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	//metodos get e set do atributo horario
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	//metodos get e set do atributo assentos
	public boolean[] getAssentos() {
		return assentos;
	}
	public void setAssentos(boolean assentos[]) {
		this.assentos = assentos;
	}
	
	//metodo que retorna a quantidade de assentos disponiveis
	public int numAssentosDisponiveis() {
		int i;
		int numAssentos=0;
		
		for(i=0;i<NUM_ASSENTOS;i++) {
			if(this.assentos[i])
				numAssentos++;
		}
		
		return numAssentos;
	}
	
	public void vendeAssentos(int numPoltrona) {
		this.assentos[numPoltrona] = false;
	}
	public void vendeAssentos(int qtd, int numPoltronas[]) {
		int i;
		for(i=0;i<qtd;i++) {
			if(numPoltronas[i]<1 || numPoltronas[i]>60) {
				System.out.printf("\nErro ao selecionar poltrona: Os números dos assentos devem estar entre 1 e 60\n");
			}else if(!this.assentos[numPoltronas[i]-1]) {
				System.out.printf("\nErro ao selecionar poltrona: O assento %d está Indisponível.\n", numPoltronas[i]);
			}else {
				this.assentos[numPoltronas[i]-1] = false;
			}
		}
	}
	
	//metodo que define todos os assentos do voo com true, ou seja disponíveis
	private void geraAssentos() {
		int i;
		for(i=0;i<NUM_ASSENTOS;i++) {
			this.assentos[i] = true;
		}
	}
	
	
	@Override
	public int hashCode() {
		return this.origem.hashCode() + this.destino.hashCode() 
		+ this.data.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o==this)
			return true;
		
		if (!(o instanceof Voo))
			return false;
		
		Voo other = (Voo) o;
		return this.origem.equals(other.destino) && this.destino.equals(other.destino)
				&& this.data.equals(other.data) && this.horario.equals(other.horario);
	}
	
	@Override
	public String toString() {
		return (this.origem+" - "+this.destino+" - "+this.valorPassagem+" - "+this.data
				+" - "+this.horario+" - "+numAssentosDisponiveis());
	}
}
