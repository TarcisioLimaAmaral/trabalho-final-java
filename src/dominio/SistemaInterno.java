package dominio;

import java.util.Scanner;

import contas.*;

import menus.*;
import repositorios.UsuarioRepositorio;

public class SistemaInterno {

	public static void main(String[] args) {

		int tipo = 0;

		MenuPrincipal m = new MenuPrincipal();
		MenuContas mc = new MenuContas();
		MenuGerente mg = new MenuGerente();
		MenuDiretor md = new MenuDiretor();
		MenuPresidente mp = new MenuPresidente();
		
		UsuarioRepositorio ur = new UsuarioRepositorio();
		
		Scanner ler = new Scanner(System.in);

		ur.lerUser();
		
		m.menu1();
		
		System.out.println("");
		
		m.tipoConta();
		
		if (m.getTipo() == 1) {
			do {
				mc.menuPoupanca();
				m.DesejaContinuar();
			} while (true);

		} else if (m.getTipo() == 2) {
			do {
				mc.menuCorrente();
				m.DesejaContinuar();
			} while (true);

		}
	}
}
