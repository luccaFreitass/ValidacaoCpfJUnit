package br.com.fiap.model;

public class LogCPF {
	
	public String notifica(boolean validacao) {
		
		String msg = "";
		
		if(validacao == true) {
			msg = "Seu CPF é válido para acesso ao sistema";
		}else {
			msg = "Seu CPF é inválido para acesso ao sistema";
		}
		
		return msg;
	}

}
