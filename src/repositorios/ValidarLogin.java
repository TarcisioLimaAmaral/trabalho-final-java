package repositorios;

import Exceptions.DocumentoInvalidoExc;

public class ValidarLogin {
	public String validarCpf(String login) throws DocumentoInvalidoExc {
		if (login.length() != 11) {
			throw new DocumentoInvalidoExc();
		}
		return login;
	}
}