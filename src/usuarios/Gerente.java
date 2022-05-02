package usuarios;

public class Gerente extends Funcionario {

	public Gerente(String cpf, String senha, String nome, int agencia, int saldo) {
		super(cpf, senha, nome, agencia, saldo);
	}
	// Final para puxar o cargo do funcionário Gerente no enum CargoFuncionario.

}