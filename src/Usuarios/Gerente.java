package Usuarios;

import enums.AgenciaBanco;
import enums.CargoFuncionario;

public class Gerente extends Funcionario {

	private final AgenciaBanco agencia;

	// Puxa a agencia através do gerente no enum AgenciaBanco.

	public AgenciaBanco getAgenciaBanco() {
		return this.agencia;
	}

	public Gerente(String cpf, String senha, String nome, AgenciaBanco agenciaX) {
		super(cpf, senha, nome);
		this.agencia = agenciaX;

	}

	// Final para puxar o cargo do funcionário Gerente no enum CargoFuncionario.

	private static final CargoFuncionario cargoGerente = enums.CargoFuncionario.Gerente;

	public static CargoFuncionario getCargoGerente() {
		return cargoGerente;


	}
}
