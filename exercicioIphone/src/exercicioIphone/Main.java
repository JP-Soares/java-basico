package exercicioIphone;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {
		Iphone iphone = null;
		Scanner scanner = new Scanner(System.in);
		Scanner scannerop = new Scanner(System.in);
		int op1 = 0;
		int op2;
		while(true) {
			System.out.println("\nDigite a opção que deseja: \n1-Acessar o Aparelho \n2-Acessar o navegador de internet \n3-Acessar o reprodutor de música: ");
			op1 = scanner.nextInt();
			//acessando o aparelho telefonico
			if(op1 == 1) {
				while(true) {
					System.out.println("\nQual opção deseja: 1-Ligar\n2-Atender\n3-Iniciar um correio de voz\n4-Voltar: ");
					op2 = scannerop.nextInt();
					if(op2 == 1) {
						System.out.println("\nDigite o número: ");
						iphone.ligar(scannerop.next());
					}else if(op2 == 2) {
						iphone.atender();
					}else if(op2 == 3) {
						iphone.iniciarCorreioVoz();
					}else if(op2 == 4) {
						op2 = 0;
						break;
					}else {
						System.out.println("\nDigite uma opção válida");
						continue;
					}
				}
				//acessando o navegador de internet
			}else if(op1 == 2) {
				while(true) {
					System.out.println("\nQual opção deseja: 1-Exibir pagina\n2-Adicionar nova aba\n3-Atualizar página\n4-Voltar: ");
					op2 = scannerop.nextInt();
					if(op2 == 1) {
						System.out.println("\nDigite a página: ");
						iphone.exibirPagina(scannerop.next());
					}else if(op2 == 2) {
						iphone.adicionarNovaAba();;
					}else if(op2 == 3) {
						iphone.atualizarPagina();
					}else if(op2 == 4) {
						break;
					}else {
						System.out.println("\nDigite uma opção válida");
						continue;
					}
				}
				//acessando o reprodutor de musica
			}else if(op1 == 3) {
				while(true) {
					System.out.println("\nQual opção deseja: 1-Tocar\n2-Pausar\n3-Selecionar Musica\n4-Voltar: ");
					op2 = scannerop.nextInt();
					if(op2 == 1) {
						iphone.tocar();
					}else if(op2 == 2) {
						iphone.pausar();
					}else if(op2 == 3) {
						System.out.println("\nDigite a musica: ");
						iphone.selecionarMusica(scannerop.next());
					}else if(op2 == 4) {
						break;
					}else {
						System.out.println("\nDigite uma opção válida");
						continue;
					}
				}
			}else {
				System.out.println("Digite uma opção válida");
				continue;
			}
		}
	}
}
