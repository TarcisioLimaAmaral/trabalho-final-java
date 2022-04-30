package Exceptions;

public class ContaInexistenteExc extends Exception {

	@Override
	public String getMessage() {
		return "A conta associada ao CPF é Inexistente! Digite novamente.";
	}

}
