package br.com.fiap.JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.fiap.model.LogCPF;

class TesteLogCPF {
	
	LogCPF mensagem = new LogCPF();

	@Test
	void testNotificarCPfValido() {
		
		assertEquals("Seu CPF é válido para acesso ao sistema", mensagem.notifica(true));
	}
	@Test
	void testNotificarCPfInvalido() {
		
		assertEquals("Seu CPF é inválido para acesso ao sistema", mensagem.notifica(false));
	}

}
