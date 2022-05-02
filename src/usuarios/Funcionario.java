package usuarios;


public abstract class Funcionario extends User {

	public Funcionario(String cpf, String senha, String nome, int agencia, double saldo) {
		super(cpf, senha, nome, agencia, saldo);
	}
}