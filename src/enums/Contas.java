package enums;

public enum Contas {
	Lucas("111.111.111-11", 1000.00, "Lucas"), Luiz("222.222.222-22", 2000.00, "Luiz"),
	Diego("333.333.333-33", 3000.00, "Diego"), Tarcísio("444.444.444-44", 4000.00, "Tarcisio"),
	Deusedir("555.555.555-55", 5000.00, "Deusedir");

	private String cpf;
	private double saldo;
	private String nome;

	Contas(String cpf, double saldo, String nome) {
		this.cpf = cpf;
		this.saldo = saldo;
		this.nome = nome;
	}

	public static Contas getContaPorCpf(String cpfInserido) {
		for (Contas contaAtual : Contas.values()) {
			if (contaAtual.getCpf().equals(cpfInserido)) {
				return contaAtual;
			}
		}
		return null;
	}

	protected double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String PuxarCpf(Contas vetor) {
		return this.nome;
	}
}
