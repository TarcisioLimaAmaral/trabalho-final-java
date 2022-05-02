package usuarios;

public abstract class User {

	protected String cpf;
	protected String senha;
	protected String nome;
	protected int agencia;
	protected int saldo;

	public User(String cpf, String senha, String nome, int agencia, int saldo) {

		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;
		this.agencia = agencia;
		this.saldo = saldo;

	}

	public void entrar(String senhaDigitada) {
		System.out.println("Olá," + nome + "!" + "\nVocê entrou com sucesso!");

	}

	public String getCpf() {
		return cpf;
	}

	public String getSenha() {
		return senha;
	}

	public String getNome() {
		return nome;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getSaldo() {
		return saldo;
	}
	

}