package dominio;

import java.util.Scanner;

import contas.*;

import enums.*;

public class SistemaInterno {

	public static void main(String[] args) {

		int continuar;

		Menu m = new Menu();
		Scanner ler = new Scanner(System.in);

		do {
			m.menu2();
			do {
				System.out.println("Deseja realizar outra operacao? \n1- SIM \n2- SAIR");
				continuar = ler.nextInt();

				if (continuar == 1) {
					break;
				} else if (continuar != 2) {
					System.out.println("Selecione uma opcao valida");
					continuar = 1;
				}
			} while (continuar == 1);

		} while (continuar == 1);
	}

}
