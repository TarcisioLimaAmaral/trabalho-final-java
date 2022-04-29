package dominio;

import java.util.Scanner;

import contas.*;

import enums.*;

public class SistemaInterno {

	public static void main(String[] args) {

		int continuar;

		Menu m = new Menu();
		Scanner ler = new Scanner(System.in);
		
//		m.menu1();
//
//		m.tipoDeConta();
		
		System.out.println("");
		
		do{
		m.menuCorrente();	
	
		m.DesejaContinuar();
		}while(true);
			
	}
}
