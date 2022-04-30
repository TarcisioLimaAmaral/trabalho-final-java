package enums;

public enum AgenciaBanco {

	AAA011(1), BB012(2), CC013(3), DD014(4), EE015(5);

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
		return AAA011;

	}
}