package Usuarios;

import enums.CargoFuncionario;

public class Gerente extends Funcionario {

	public Gerente(String cpf, String senha, String nome) {
		super(cpf, senha, nome);
	}
	
	// Final para puxar o cargo do funcionário Gerente no enum CargoFuncionario.
	
	private static final CargoFuncionario cargoGerente = enums.CargoFuncionario.Gerente;

	public static CargoFuncionario getCargoGerente() {
		return cargoGerente;
	}
}
