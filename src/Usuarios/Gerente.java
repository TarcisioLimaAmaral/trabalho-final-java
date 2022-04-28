package Usuarios;

import enums.AgenciaBanco;
import enums.CargoFuncionario;

public class Gerente extends Funcionario {

<<<<<<< Updated upstream
	private AgenciaBanco agencia;

	public Gerente(String cpf, String senha, String nome, AgenciaBanco agenciaG) {
		super(cpf, senha, nome);
		this.agencia = agenciaG;
=======
	// Puxa a agencia através do gerente no enum AgenciaBanco.
	private final AgenciaBanco agencia;

	public AgenciaBanco getAgenciaBanco() {
		return this.agencia;
	}

	public Gerente(String cpf, String senha, String nome, AgenciaBanco agenciaX) {
		super(cpf, senha, nome);
		this.agencia = agenciaX;
>>>>>>> Stashed changes
	}

	// Final para puxar o cargo do funcionário Gerente no enum CargoFuncionario.

	private static final CargoFuncionario cargoGerente = enums.CargoFuncionario.Gerente;

	public static CargoFuncionario getCargoGerente() {
		return cargoGerente;

<<<<<<< Updated upstream
	}

	// Get para puxar a Agencia
	
	public AgenciaBanco getAgencia() {
		return agencia;
=======
>>>>>>> Stashed changes
	}
}
