package corrida;

public class Carro extends Veiculo {
	public void ligar() {
		confereCambio();
		confereCombustivel();
		System.out.println("CARRO LIGADO");
	}
	private void confereCombustivel() {
		System.out.println("conferindo combust�vel");
	}
	private void confereCambio() {
		System.out.println("conferindo c�mbio em P");
	}
}
