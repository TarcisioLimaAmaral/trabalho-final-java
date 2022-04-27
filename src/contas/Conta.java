package contas;

import java.util.Scanner;

public abstract class Conta {
	/*
	● Conta, que deverá ser uma classe abstrata, deve conter os atributos de CPF do titular,
	para relacionar a conta com o usuário logado no sistema, e o saldo. Adicionalmente, a
	conta deve ter um atributo identificador da agência.
	● Conta Corrente e Conta Poupança, que herdarão os atributos e métodos de Conta,
	devem conter um atributo “tipo” para identificação do tipo de conta.
	*/
	
	public String cpf;
	public int idAgencia;
	public double saldo;

	public Conta(String cpf, int idAgencia, double saldo) {
		this.cpf = cpf;
		this.idAgencia = idAgencia;
		this.saldo = saldo;

	}
}
