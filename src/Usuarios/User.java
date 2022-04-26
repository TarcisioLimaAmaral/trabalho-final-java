package Usuarios;

public abstract class User {

	protected String cpf;
	protected String senha;
	protected String nome;

	public User(String cpf, String senha, String nome) {

		this.cpf = cpf;
		this.senha = senha;
		this.nome = nome;

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

}
