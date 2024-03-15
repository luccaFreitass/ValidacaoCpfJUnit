package br.com.fiap.JUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.fiap.model.CodigoPessoaFisica;

class TesteCodigoPessoaFisica {
	
	CodigoPessoaFisica cpf = new CodigoPessoaFisica();

	@Test
	void testValidarCpfPositivo() {
		assertEquals(true, cpf.validaCPF("11144477735"));
	}
	@Test
	void testValidarCpfNegattivo() {
		assertEquals(false, cpf.validaCPF("11144477700"));
	}
	@Test
	void testremoverCaracteresEspeciais() {
		assertEquals(("11144477735"), cpf.removeCaracteresEspeciais("111.444.777-35"));
	}

}
