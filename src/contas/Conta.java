package contas;

import java.util.Scanner;

public abstract class Conta {

	public String cpf;
	public int idAgencia;
	public double saldo = 0.0;

	public Conta(String cpf, int idAgencia, double saldo) {
		this.cpf = cpf;
		this.idAgencia = idAgencia;
		this.saldo = saldo;

	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdAgencia() {
		return idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}