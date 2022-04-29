package Usuarios;

import enums.CargoFuncionario;

public class Diretor extends Funcionario {

	public Diretor(String cpf, String senha, String nome) {
		super(cpf, senha, nome);
	}

	// Final para puxar o cargo do funcionário Diretor no enum CargoFuncionario.

	private static final CargoFuncionario cargoDiretor = enums.CargoFuncionario.Diretor;

	public static CargoFuncionario getCargodiretor() {
		return cargoDiretor;

	}
}
