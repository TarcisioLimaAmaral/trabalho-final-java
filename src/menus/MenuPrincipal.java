package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exceptions.ContaInexistenteExc;
import Exceptions.DocumentoInvalidoExc;
import Exceptions.ValorInvalidoExc;
import enums.Contas;

public class MenuPrincipal {
	protected int tipo, opcao, continuar, tempo;
	protected double saldo, saldoT, valor, Imposto, ImpostoSaque = 0.10, ImpostoDeposito = 0.10,
			ImpostoTransferencia = 0.20;
	protected String login, cpfT;

	Scanner ler = new Scanner(System.in);

	public void menu1() throws ContaInexistenteExc, DocumentoInvalidoExc {
		System.out.println("Insira seu cpf");
		login = ler.nextLine();

		System.out.println("Bem-vindo " + Contas.getContaPorCpf(login).getNome());
	}

	public void DesejaContinuar() throws InputMismatchException {

		do {
			System.out.println("Deseja realizar outra operacao? \n1- SIM \n2- SAIR");
			try {
				continuar = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nApenas números são necessários!");
				continue;
			} finally {
				ler.nextInt();
				}
			if (continuar == 1) {
				break;
			} else if (continuar == 2) {
				System.exit(0);
			} else if (continuar != 2) {
				System.out.println("Selecione uma opcao valida");
				continuar = 1;
			}
		} while (continuar == 1);
	}
}
