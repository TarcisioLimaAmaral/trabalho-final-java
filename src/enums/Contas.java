package enums;

public enum Contas {
	LUCAS("111.111.111-11", 1000.00, "Lucas"), LUIZ("222.222.222-22", 2000.00, "Luiz"),
	DIEGO("333.333.333-33", 3000.00, "Diego"), TARCISIO("444.444.444-44", 4000.00, "Tarcisio");

	private String cpf;
	private double saldo;
	private String nome;
	public String login = cpf;

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

	public String getCpf() {
		return cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

}
