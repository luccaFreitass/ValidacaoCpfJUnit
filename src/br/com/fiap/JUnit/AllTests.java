package br.com.fiap.JUnit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ TesteCodigoPessoaFisica.class, TesteLogCPF.class, TesteValidadoraAcesso.class })
public class AllTests {

}
