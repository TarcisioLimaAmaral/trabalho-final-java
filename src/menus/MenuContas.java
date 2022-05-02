package menus;

import java.util.InputMismatchException;
import java.util.Scanner;

import repositorios.UsuarioRepositorio;

public class MenuContas {

	protected int tipo, opcao, continuar, tempo;
	public static int dep = 0, saq = 0, trans = 0;
	protected double saldo, saldoT, valor, Imposto, ImpostoSaque = 0.10, ImpostoDeposito = 0.10,
			ImpostoTransferencia = 0.20;
	protected String login, cpfT;

	Scanner ler = new Scanner(System.in);

	public void menuCorrente() {
		do {
			System.out.println(
					"Selecione uma opcao abaixo: \n1-Depositar \n2-Sacar \n3-Saldo \n4-Transferir \n5-Exibir Impostos");
			try {
				opcao = ler.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Apenas números são permitidos!");
			} finally {
				ler.nextInt();
			}
			switch (opcao) {

			case 1:
				System.out.println("Quanto deseja depositar?");
				try {
					valor = ler.nextDouble();
				} catch (InputMismatchException ex) {
					System.out.println("Apenas números são permitidos!");
				} finally {
					ler.nextDouble();
				}
				Imposto = Imposto + ImpostoDeposito;
				saldo = saldo - ImpostoDeposito;
				Math.ceil(saldo = saldo + valor);
				dep = dep + 1;
				System.out.println("Saldo atual: " + saldo);
				break;
			case 2:
				System.out.println("Quanto deseja sacar?");
				try {
					valor = ler.nextDouble();
				} catch (InputMismatchException ex) {
					System.out.println("Apenas números são permitidos!");
				} finally {
					ler.nextDouble();
				}
				if (valor > saldo) {
					System.out.println("Saldo Insuficiente\n" + saldo);
					break;
				}
				Imposto = Imposto + ImpostoSaque;
				Math.ceil(saldo = saldo - ImpostoSaque);
				saldo = saldo - valor;
				saq = saq + 1;
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
					try {
						valor = ler.nextDouble();
					} catch (InputMismatchException ex) {
						System.out.println("Apenas números são permitidos!");
					} finally {
						ler.nextDouble();
					}
					if (valor > saldo) {
						System.out.println("Saldo Insuficiente\n" + saldo);
						break;
					} else {
						System.out.println(cpfT + "\nDeseja confirmar transferencia? \n1-SIM \n2-NAO");
						try {
							continuar = ler.nextInt();
						} catch (InputMismatchException ex) {
							System.out.println("Apenas números são permitidos!");
						} finally {
							ler.nextInt();
						}
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
				trans = trans + 1;
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
			try {
				opcao = ler.nextInt();
			} catch (InputMismatchException ex) {
				System.out.println("Apenas números são permitidos!");
			} finally {
				ler.nextInt();
			}
			switch (opcao) {

			case 1:
				System.out.println("Quanto deseja depositar?");
				try {
					valor = ler.nextDouble();
				} catch (InputMismatchException ex) {
					System.out.println("Apenas números são permitidos!");
				} finally {
					ler.nextDouble();
				}
				Math.ceil(saldo = saldo + valor);
				System.out.println("Saldo atual: " + saldo);
				dep = dep + 1;
				break;
			case 2:
				System.out.println("Quanto deseja sacar?");
				try {
					valor = ler.nextDouble();
				} catch (InputMismatchException ex) {
					System.out.println("Apenas números são permitidos!");
				} finally {
					ler.nextDouble();
				}
				if (valor > saldo) {
					System.out.println("Saldo Insuficiente\n" + saldo);
					break;
				}
				saldo = saldo - valor;
				System.out.println("Saldo atual: " + saldo);
				saq = saq + 1;
				break;
			case 3:
				System.out.println(saldo);
				break;
			case 4:
				do {
					System.out.println("Insira o cpf de quem deseja transferir");
					cpfT = ler.next();
					cpfT = UsuarioRepositorio.exibirUser(cpfT).getCpf();
//				saldoT = UsuarioRepositorio.exibirUser(cpfT).getSaldo();
					System.out.println("Insira o valor");
					try {
						valor = ler.nextDouble();
					} catch (InputMismatchException ex) {
						System.out.println("Apenas números são permitidos!");
					} finally {
						ler.nextDouble();
					}
					if (valor > saldo) {
						System.out.println("Saldo Insuficiente\n" + saldo);
						break;
					} else {
						System.out.println(cpfT + "\nDeseja confirmar transferencia? \n1-SIM \n2-NAO");
						try {
							continuar = ler.nextInt();
						} catch (InputMismatchException ex) {
							System.out.println("Apenas números são permitidos!");
						} finally {
							ler.nextInt();
						}
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
					saldoT = saldoT + valor;
					System.out.println("Transferencia realizada \n" + saldo);
					break;
				} while (continuar == 2);
				trans = trans + 1;
				break;
			case 5:
				System.out.println("Insira o tempo em meses");
				try {
					tempo = ler.nextInt();
				} catch (InputMismatchException ex) {
					System.out.println("Apenas números são permitidos!");
				} finally {
					ler.nextInt();
				}
				saldo = valor;
				for (int i = 0; i < tempo; i++) {
					valor = valor + (valor * 0.01);
				}
				System.out.println(Math.ceil(valor));
				break;
			default:
				System.out.println("Selecione uma opcao valida");
				opcao = 0;
			}
		} while (opcao == 0);
	}
}