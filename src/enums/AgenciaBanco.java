package enums;

public enum AgenciaBanco {

	BEZ5499(1), NER2237(2), HWC7285(3), IAC3661(4),LUO0481(5);

	private final int idAgencia;

	public int getIdAgencia() {
		return this.idAgencia;
	}

	AgenciaBanco(int idAgenciaBancos) {
		this.idAgencia = idAgenciaBancos;
	}

	public static AgenciaBanco AgenciaPorId(int idAgenciaBancos) {
		
		for (AgenciaBanco agencia : AgenciaBanco.values()) {
			
			if (idAgenciaBancos == agencia.idAgencia) {
				return agencia;
			}
		}
		return BEZ5499;
		
		
	}
}