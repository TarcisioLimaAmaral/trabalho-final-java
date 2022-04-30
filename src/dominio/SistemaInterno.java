package dominio;

import java.util.Scanner;

import contas.*;

import enums.*;

public class SistemaInterno {

	public static void main(String[] args) {

		int tipo = 0;

		Menu m = new Menu();
		Scanner ler = new Scanner(System.in);

		m.menu1();

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

		System.out.println("");

		if (tipo == 1) {
			do {
				m.menuPoupanca();
				m.DesejaContinuar();
			} while (true);

		} else if (tipo == 2) {
			do {
				m.menuCorrente();
				m.DesejaContinuar();
			} while (true);

		}
	}
}