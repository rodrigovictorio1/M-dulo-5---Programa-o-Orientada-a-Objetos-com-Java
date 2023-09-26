package Messenger;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorPedrinho {

	public static void main(String[] args) {

		ServicoMensagemInstantanea smi = null;

		/*
		 * N�O SE SABE QUAL APP MAS QUALQUER UM DEVER� ENVIAR E RECEBER MENSAGEM
		 */

		String appEscolhido = "msn";

		if (appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		} else if (appEscolhido.equals("fbm")) {
			smi = new FacebookMessenger();
		} else if (appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}

		smi.enviarMensagem();
		smi.receberMensagem();

	}

}
