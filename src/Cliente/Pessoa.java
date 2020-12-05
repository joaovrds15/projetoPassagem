package Cliente;
public abstract class Pessoa {
		private String nome ;
		private int idade;
		private int identificacao;
		protected static int numAdulto;
		protected static int numCrianca;
		protected static int numQuantidade;
		protected static int numAdultoTeste=0;
		protected static int numCriancaTeste=0;
		public Pessoa(String nome, int idade, int identificacao) {
		this.idade=idade;
		this.identificacao=identificacao;
		this.nome=nome;
		}
		//Métodos Static
		public static void setNumAdulto(int num) {
			numAdulto=num;
		}
		
		public static void setNumCrianca(int num) {
			numCrianca=num;
		}
		
		public static int getNumAdulto() {
			return numAdulto;
		}
		
		public static int getNumCrianca() {
			return numCrianca;
		}
		
		public static int getNumCriancaTeste() {
			return numCriancaTeste;
		}
		
		public static int getNumAdultoTeste() {
			return numAdultoTeste;
		}
		//Métodos Get
		public String getNome() {
			return nome;
		}
		
		public int getIdade() {
			return idade;
		}
		public int getIdentificacao() {
			return identificacao;
		}
		//Para teste
		public void Informacao(){
			if(getIdade()<16){
			System.out.println("Não é um Adulto");
		}else {
			System.out.println(getIdade());
		}
			}
	}

