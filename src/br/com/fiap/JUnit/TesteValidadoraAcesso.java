package br.com.fiap.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.fiap.model.ValidadoraAcesso;

class TesteValidadoraAcesso {

	ValidadoraAcesso acesso = new ValidadoraAcesso();
	
	@Test
	void testCpfValido() {
		assertEquals(true, acesso.validarCpf("11144477735"));
	}
	
	@Test
	void testCpfInvalido() {
		assertEquals(false, acesso.validarCpf("47600537889"));
	}

}
