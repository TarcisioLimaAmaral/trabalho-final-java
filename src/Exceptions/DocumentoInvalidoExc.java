package Exceptions;

public class DocumentoInvalidoExc extends Exception{
	
	@Override
	public String getMessage() {
		return "O Documento é Inválido! Digite novamente.";
	}

}
