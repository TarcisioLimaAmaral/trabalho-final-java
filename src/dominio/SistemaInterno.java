package dominio;

import java.io.IOException;
import java.util.Scanner;

import Exceptions.ContaInexistenteExc;
import Exceptions.DocumentoInvalidoExc;
import contas.*;

import enums.*;
import menus.*;

public class SistemaInterno  {

	public static void main(String[] args) throws IOException, ContaInexistenteExc, DocumentoInvalidoExc {

		int tipo = 0;

		MenuPrincipal m = new MenuPrincipal();
		MenuContas mc = new MenuContas();
		MenuGerente mg = new MenuGerente();
		MenuDiretor md = new MenuDiretor();
		MenuPresidente mp = new MenuPresidente();
		
		Scanner ler = new Scanner(System.in);

		m.menu1();
		
		System.out.println("");
		
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
		
		if (tipo == 1) {
			do {
				mc.menuPoupanca();
				m.DesejaContinuar();
			} while (true);

		} else if (tipo == 2) {
			do {
				mc.menuCorrente();
				m.DesejaContinuar();
			} while (true);

		}
	}
}