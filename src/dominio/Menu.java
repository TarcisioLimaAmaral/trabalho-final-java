package dominio;

import contas.*;

import java.util.Scanner;

public class Menu {
	
	int tipo;
	
	public void tipoDeConta(){
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Selecione a sua conta \n1 - Poupanca \n2 - Corrente");
		tipo = ler.nextInt();
		
		do{
			if(tipo == 1) {
			System.out.println("Conta Poupanca Selecionada");
			break;
		}else if(tipo == 2){
			System.out.println("Conta Corrente Selecionada");
			break;
		}else{
			System.out.println("Selecione 1 ou 2");
			
		}
		}while(true);
	}
}
