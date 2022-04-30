package usuarios;

public class Gerente extends Funcionario {

	public Gerente(String cpf, String senha, String nome, int agencia) {
		super(cpf, senha, nome, agencia);
	}
	// Final para puxar o cargo do funcionário Gerente no enum CargoFuncionario.

}
