package dominio;

import contas.*;

import enums.*;

import java.util.Scanner;

public class Menu {

	protected int tipo, opcao, continuar, tempo;
	protected double saldo, saldoT, valor, Imposto, ImpostoSaque = 0.10, ImpostoDeposito = 0.10,
			ImpostoTransferencia = 0.20;
	protected String login1, cpfT;
	public Contas login;

	Scanner ler = new Scanner(System.in);

	public void menu1() {
		System.out.println("Insira seu cpf");
		login1 = ler.nextLine();

		System.out.println("Bem-vindo " + Contas.values());
	}

	public void menuCorrente() {
		do {
			System.out.println(
					"Selecione uma opcao abaixo: \n1-Depositar \n2-Sacar \n3-Saldo \n4-Transferir \n5-Exibir Impostos");
			opcao = ler.nextInt();
			switch (opcao) {

			case 1:
				System.out.println("Quanto deseja depositar?");
				valor = ler.nextDouble();
				Imposto = Imposto + ImpostoDeposito;
				saldo = saldo - ImpostoDeposito;
				Math.ceil(saldo = saldo + valor);
				System.out.println("Saldo atual: " + saldo);
				break;
			case 2:
				System.out.println("Quanto deseja sacar?");
				valor = ler.nextDouble();
				if (valor > saldo) {
					System.out.println("Saldo Insuficiente\n" + saldo);
					break;
				}
				Imposto = Imposto + ImpostoSaque;
				Math.ceil(saldo = saldo - ImpostoSaque);
				saldo = saldo - valor;
				System.out.println("Saldo atual: " + saldo);
				break;
			case 3:
				System.out.println(saldo);
				break;
			case 4:
				do {
					System.out.println("Insira o cpf de quem deseja transferir");
					cpfT = ler.next();
					System.out.println("Insira o valor");
					valor = ler.nextDouble();
					if (valor > saldo) {
						System.out.println("Saldo Insuficiente\n" + saldo);
						break;
					} else {
						System.out.println(cpfT + "\nDeseja confirmar transferencia? \n1-SIM \n2-NAO");
						continuar = ler.nextInt();
						switch (continuar) {
						case 1:

							break;
						case 2:

							break;
						default:
							System.out.println("Selecione uma opcao valida");
							continuar = 2;
						}
					}
					Imposto = Imposto + ImpostoTransferencia;
					Math.ceil(saldo = saldo - ImpostoTransferencia);
					saldo = saldo - valor;
					System.out.println("Transferencia realizada \n" + saldo);
					break;
				} while (continuar == 2);
				break;
			case 5:
				System.out.println(Math.ceil(Imposto));
				System.out.println("Saque - 10 centavos \nDeposito - 10 centavos \nTransferencia - 20 centavos");
				break;
			default:
				System.out.println("Selecione uma opcao valida");
				opcao = 0;
			}
		} while (opcao == 0);
	}

	public void menuPoupanca() {
		do {
			System.out.println(
					"Selecione uma opcao abaixo: \n1-Depositar \n2-Sacar \n3-Saldo \n4-Transferir \n5-Simular Rendimento");
			opcao = ler.nextInt();
			switch (opcao) {

			case 1:
				System.out.println("Quanto deseja depositar?");
				valor = ler.nextDouble();
				Math.ceil(saldo = saldo + valor);
				System.out.println("Saldo atual: " + saldo);
				break;
			case 2:
				System.out.println("Quanto deseja sacar?");
				valor = ler.nextDouble();
				if (valor > saldo) {
					System.out.println("Saldo Insuficiente\n" + saldo);
					break;
				}
				saldo = saldo - valor;
				System.out.println("Saldo atual: " + saldo);
				break;
			case 3:
				System.out.println(saldo);
				break;
			case 4:
				do {
					System.out.println("Insira o cpf de quem deseja transferir");
					cpfT = ler.next();
					System.out.println("Insira o valor");
					valor = ler.nextDouble();
					if (valor > saldo) {
						System.out.println("Saldo Insuficiente\n" + saldo);
						break;
					} else {
						System.out.println(cpfT + "\nDeseja confirmar transferencia? \n1-SIM \n2-NAO");
						continuar = ler.nextInt();
						switch (continuar) {
						case 1:

							break;
						case 2:

							break;
						default:
							System.out.println("Selecione uma opcao valida");
							continuar = 2;
						}
					}
					saldo = saldo - valor;
					System.out.println("Transferencia realizada \n" + saldo);
					break;
				} while (continuar == 2);
				break;
			case 5:
				System.out.println("Insira o tempo em meses");
				tempo = ler.nextInt();
				saldo = valor;
				for (int i = 0; i < tempo; i++) {
					valor = valor + (valor*0.01);
				}
				System.out.println(Math.ceil(valor));
				break;
			default:
				System.out.println("Selecione uma opcao valida");
				opcao = 0;
			}
		} while (opcao == 0);
	}

	public void DesejaContinuar() {
		do {
			System.out.println("Deseja realizar outra operacao? \n1- SIM \n2- SAIR");
			continuar = ler.nextInt();

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