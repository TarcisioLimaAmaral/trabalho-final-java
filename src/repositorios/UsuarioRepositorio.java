package repositorios;

import java.io.BufferedReader;

import menus.MenuContas;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import usuarios.Cliente;
import usuarios.User;

public class UsuarioRepositorio {
	private static HashMap<String, User> mapaUsuarios= new HashMap<String, User>();
	
	static {
		Cliente c1 = new Cliente("111.111.111-11","123cpf","Lucas", 0001);
		mapaUsuarios.put(c1.getCpf(),c1);		
	}
	
	String s = File.separator;
	
	File usuarios = new File("usuarios.txt");
	
	File arquivosTexto = new File("src" + s + "arquivosTexto");
	File arquivosP = new File(arquivosTexto.getPath() + s + "usuarios.txt");
	
	public static void relatorio() {
		try {
			File relatorio = new File ("relatorio.txt");
			relatorio.createNewFile();
			
			FileWriter relatorioW = new FileWriter(relatorio, true);
			BufferedWriter relatorioBffArquivo = new BufferedWriter(relatorioW);
			
			relatorioBffArquivo.write("Quantidade de Depositos: " + MenuContas.dep);
			relatorioBffArquivo.newLine();
			relatorioBffArquivo.write("Quantidade de Saques: " + MenuContas.saq);
			relatorioBffArquivo.newLine();
			relatorioBffArquivo.write("Quantidade de Transferencias: " + MenuContas.trans);
			relatorioBffArquivo.newLine();
			relatorioBffArquivo.write("---------------------------------");
			relatorioBffArquivo.newLine();
			
			relatorioBffArquivo.flush();
			
			relatorioBffArquivo.close();
		} catch (IOException e) {
			System.out.println("Erro em imprimir relatorio");
		}
	}
	
	public static void mostraDadosConta(String contaString) {
		String[] contaVetor = contaString.split("/");
		
//		System.out.println("Cargo: " + contaVetor[0]);
//		System.out.println("Tipo de conta: " + contaVetor[1]);
		System.out.println("CPF: " + contaVetor[2]);
//		System.out.println("Senha: " + contaVetor[3]);
		System.out.println("Nome: " + contaVetor[4]);
//		System.out.println("Agencia: " + contaVetor[5]);
		System.out.println("Saldo Atual: " + contaVetor[6]);
		
	}
	
	public void lerUser() { 
		File arquivo = new File("usuarios.txt");
		
		try {
			FileReader leitorArquivos = new FileReader(arquivo);
			BufferedReader leitorBffArquivos = new BufferedReader(leitorArquivos);
					
			do {
				String linhaLidaAlt = leitorBffArquivos.readLine();
				if (linhaLidaAlt == null) {
					break;
				}
//				mostraDadosConta(linhaLidaAlt);
				mapaUsuarios.put(linhaLidaAlt, null);
			} while(true);
			
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado");
		} catch (IOException e) {
			System.out.println("A leitura de arquivos não é possível");
		}

	}
	
	public static User exibirUser(String cpf) {
			return mapaUsuarios.get(cpf);
	}
	
	public static String login(String contaString) {
		String[] contaVetor = contaString.split("/");
		return contaVetor[4];
	}
	
}
