package usuarios;


public abstract class Funcionario extends User {

	public Funcionario(String cpf, String senha, String nome, int agencia, int saldo) {
		super(cpf, senha, nome, agencia, saldo);
	}
}