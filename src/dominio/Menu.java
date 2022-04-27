package dominio;

import contas.*;

import java.util.Scanner;

public class Menu {
	
	int tipo, login, opcao;
	double saldo, valor;
	
	Scanner ler = new Scanner(System.in);
	
	public void menu1() {
		System.out.println("Insira seu cpf");
		login = ler.nextInt();
		
	}

		
	public double menu2() {
		do {
		System.out.println("Selecione uma opcao abaixo: \n1-Depositar \n2-Sacar \n3-Saldo \n4-Sair");
		opcao = ler.nextInt();
		switch(opcao) {
		
		case 1:
			System.out.println("Quanto deseja depositar?");
			valor = ler.nextDouble();
			return saldo + valor;
		case 2:
			System.out.println("Quanto deseja sacar?");
			valor = ler.nextDouble();
			return saldo - valor;
		case 3:
			System.out.println(saldo);
			return saldo;
		case 4: 
			System.exit(0);
		default:
			return 0;
		}}while(opcao == 0);
	}
	
	public void tipoDeConta(){
		
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
