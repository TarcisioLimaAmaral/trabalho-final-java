package Exceptions;

public class ValidarCpf {
	public static String validarCpf(String cpf) throws DocumentoInvalidoExc {
		if (cpf.length() != 11) {
			throw new DocumentoInvalidoExc();
		}
		return cpf;
	}
}
