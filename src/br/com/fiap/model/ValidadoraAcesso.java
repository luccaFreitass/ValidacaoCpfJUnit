package br.com.fiap.model;

public class ValidadoraAcesso {

	String[] cpfAutorizados = { "47600537869", "40579912809", "11144477735" };

	public boolean validarCpf(String cpf) {

		boolean validacao = false;

		for (int i = 0; i < cpfAutorizados.length; i++) {
			
			if (cpf == cpfAutorizados[i]) {
				validacao = true;
			
			} else if (cpf != cpfAutorizados[i])
				validacao = false;
		}
		return validacao;

	}

}
