package Exceptions;

public class ValorInvalidoExc extends Exception {

	@Override
	public String getMessage() {
		return "O valor Inserido é Inválido! Digite novamente.";
	}

}
