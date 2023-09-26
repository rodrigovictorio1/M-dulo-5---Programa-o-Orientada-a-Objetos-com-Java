package apps;

public abstract class ServicoMensagemInstantanea {

	public abstract void enviarMensagem();

	public abstract void receberMensagem();

	// somente os filhos conhecem este m�todo
	protected void validarConectadoInternet() {
		System.out.println("Validando se est� conectado a internet");
	}

}
