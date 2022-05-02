package usuarios;

public class Cliente extends User {

	public Cliente(String cpf, String senha, String nome, int agencia, int saldo) {
		super(cpf, senha, nome, agencia,saldo);
		
		// Construtor para instanciar o usuário Cliente --> senha e cpf.
	}

}
