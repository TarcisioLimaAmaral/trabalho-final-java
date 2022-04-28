package Usuarios;

import enums.AgenciaBanco;
import enums.CargoFuncionario;

public class Gerente extends Funcionario {

	private AgenciaBanco agencia;

	public Gerente(String cpf, String senha, String nome, AgenciaBanco agenciaG) {
		super(cpf, senha, nome);
		this.agencia = agenciaG;
	}

	// Final para puxar o cargo do funcionário Gerente no enum CargoFuncionario.

	private static final CargoFuncionario cargoGerente = enums.CargoFuncionario.Gerente;

	public static CargoFuncionario getCargoGerente() {
		return cargoGerente;

	}

	// Get para puxar a Agencia
	
	public AgenciaBanco getAgencia() {
		return agencia;
	}
}
