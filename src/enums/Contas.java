package enums;

public enum Contas {
		LUCAS("111.111.111-11", 1236.41, "Lucas"),
		LUIZ("222.222.222-22" ,12414.40, "Luiz"),
		DIEGO("333.333.333-33", 6757.09, "Diego"),
		TARCISIO("444.444.444-44", 867897.45, "Tarcisio"),
		DEUSEDIR("555.555.555-55", 1231313.32, "Deusedir");
		
		private String cpf;
		private double saldo;
		private String nome;
		
		Contas(String cpf, double saldo, String nome) {
			this.cpf = cpf;
			this.saldo = saldo;
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		protected void setCpf(String cpf) {
			this.cpf = cpf;
		}

		protected double getSaldo() {
			return saldo;
		}

		protected void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		protected String getNome() {
			return nome;
		}

		protected void setNome(String nome) {
			this.nome = nome;
		}
}

