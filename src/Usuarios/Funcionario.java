package Usuarios;

import enums.CargoFuncionario;

public abstract class Funcionario extends User {

	// Construtor para instanciar o usuário Funcionário --> senha, nome e cpf.

	public Funcionario(String cpf, String senha, String nome) {
		super(cpf, senha, nome);
	}

	// Enum para denominar o cargo do Funcionário, por isso está em Protected e
	// static.

	protected static CargoFuncionario CargoFuncionario;

	public static CargoFuncionario getCargo() {
		return Funcionario.CargoFuncionario;

	}
}
