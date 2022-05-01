package Usuarios;

import java.util.HashMap;

import Exceptions.ContaInexistenteExc;

public abstract class User {
	private static HashMap<String, User> mapaUsuarios = new HashMap<String, User>();

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
	public static User retornaUsuario(String cpf) throws ContaInexistenteExc {
		User UsuarioPesquisado = mapaUsuarios.get(cpf);
		if (UsuarioPesquisado == null) {
			throw new ContaInexistenteExc();
		}
		return UsuarioPesquisado;
	}
}
