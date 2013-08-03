package br.com.fiap.loja;

import static org.junit.Assert.*;

import org.junit.Test;

public class MoedaEstangeiraTest {

	@Test
	public void testConverterDolarValorPositivo() {
		MoedaEstangeira converter = new MoedaEstangeira();
		int valorReal = converter.converterDolar(5);
		assertEquals("Calcular o valor de 5 reais para dolar",10,valorReal);
	}
	
	@Test
	public void testConverterDolarValorZerado() {
		MoedaEstangeira converter = new MoedaEstangeira();
		int valorReal = converter.converterDolar(0);
		assertEquals("Calcular o valor zerado",0,valorReal);
	}
	
	@Test
	public void testConverterDolarValorNegativo() {
		MoedaEstangeira converter = new MoedaEstangeira();
		int valorReal = converter.converterDolar(-1);
		assertEquals("Calcular o valor zerado",0,valorReal);
	}

}
