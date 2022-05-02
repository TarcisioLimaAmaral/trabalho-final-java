package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import repositorios.UsuarioRepositorio;

public class MenuPrincipal {
	protected static int tipo, opcao, continuar, tempo;
	protected double saldo, saldoT, valor, Imposto, ImpostoSaque = 0.10, ImpostoDeposito = 0.10,
			ImpostoTransferencia = 0.20;
	protected String login, cpfT, senha;

	Scanner ler = new Scanner(System.in);

	UsuarioRepositorio ur = new UsuarioRepositorio();

	public void menu1() {
		System.out.println("Insira seu cpf:");
		login = ler.nextLine();
		System.out.println("Insira sua senha:");
		senha = ler.nextLine();

		System.out.println("\nBem-vindo, " + ur.exibirUser(login).getNome());
		System.out.println("Seu saldo é de R$: " + ur.exibirUser(login).getSaldo());

	}

	public void DesejaContinuar() {
		do {
			System.out.println("Deseja realizar outra operacao? \n1- SIM \n2- SAIR");
			try {
				continuar = ler.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Apenas números são permitidos!");
			}
			if (continuar == 1) {
				break;
			} else if (continuar == 2) {
				UsuarioRepositorio.relatorio();
				System.exit(0);
			} else if (continuar != 2) {
				System.out.println("Selecione uma opcao valida");
				continuar = 1;
			}
		} while (continuar == 1);
	}

	public void tipoConta() throws InputMismatchException {
		do {
			System.out.println("Selecione a sua conta \n1 - Poupanca \n2 - Corrente");
			try {
				tipo = ler.nextInt();
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Apenas números são permitidos!");
			} 
			switch (tipo) {

			case 1:
				System.out.println("Conta Poupanca Selecionada");
				tipo = 1;
				break;
			case 2:
				System.out.println("Conta Corrente Selecionada");
				tipo = 2;
				break;
			default:
				System.out.println("Selecione 1 ou 2");
				tipo = 0;
			}
		} while (tipo == 0);
	}

	public int getTipo() {
		return tipo;
	}
}