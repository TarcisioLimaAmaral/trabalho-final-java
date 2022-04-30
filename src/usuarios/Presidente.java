package usuarios;

import enums.CargoFuncionario;

public class Presidente extends Funcionario {

	public Presidente(String cpf, String senha, String nome) {
		super(cpf, senha, nome);
	}

	// Final para puxar o cargo do funcionário Presidente no enum CargoFuncionario.

	private static final CargoFuncionario cargoPresidente = enums.CargoFuncionario.Presidente;

	public static CargoFuncionario getCargopresidente() {
		return cargoPresidente;
	}

}
