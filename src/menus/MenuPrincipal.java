package menus;

import java.util.Scanner;

import repositorios.UsuarioRepositorio;

public class MenuPrincipal {
	protected static int tipo, opcao, continuar, tempo;
	protected double saldo, saldoT, valor, Imposto, ImpostoSaque = 0.10, ImpostoDeposito = 0.10,
			ImpostoTransferencia = 0.20;
	protected String login, cpfT;

	Scanner ler = new Scanner(System.in);
	
	UsuarioRepositorio ur = new UsuarioRepositorio();

	public void menu1() {
		System.out.println("Insira seu cpf");
		login = ler.nextLine();
		
		System.out.println("Bem-vindo " + ur.exibirUser(login).getNome());

	}
	
	
	public void DesejaContinuar() {
		do {
			System.out.println("Deseja realizar outra operacao? \n1- SIM \n2- SAIR");
			continuar = ler.nextInt();

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
	
	public void tipoConta() {
		do {
			System.out.println("Selecione a sua conta \n1 - Poupanca \n2 - Corrente");
			tipo = ler.nextInt();

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
