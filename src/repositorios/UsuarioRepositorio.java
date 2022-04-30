package repositorios;

import java.util.HashMap;

import usuarios.Cliente;
import usuarios.User;

public class UsuarioRepositorio {
	private static HashMap<String, User> mapaUsuarios= new HashMap<String, User>();
	
	static {
		Cliente c1 = new Cliente("111.111.111-11","123cpf","Lucas");
		mapaUsuarios.put(c1.getCpf(),c1);		
	}
	
	public static User exibirUser(String cpf) {
			return mapaUsuarios.get(cpf);
	}
}
