package exercicioIphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		// TODO Auto-generated method stub
		System.out.println("Exibindo nova aba " + url);
	}

	@Override
	public void adicionarNovaAba() {
		// TODO Auto-generated method stub
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		// TODO Auto-generated method stub
		System.out.println("Atualizando página");
	}

	@Override
	public void tocar() {
		// TODO Auto-generated method stub
		System.out.println("Tocando musica");
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub
		System.out.println("Musica pausada");
	}

	@Override
	public void selecionarMusica(String musica) {
		// TODO Auto-generated method stub
		System.out.println("Musica selecionada"+musica);
	}

	@Override
	public void ligar(String numero) {
		// TODO Auto-generated method stub
		if(numero.length() < 11) {
			System.out.println("Digite um número válido");
		}else {
			System.out.println("Iniciano chamada para o número: "+numero);
		}
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada telefônica");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		// TODO Auto-generated method stub
		System.out.println("Iniciando correio de voz");
	}
	
}
