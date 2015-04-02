package test;

import static org.junit.Assert.*;

import org.junit.Test;

import control.Controle;

public class Testes {


	
	@Test
	public void PossibilidadeChuvaIndicaBotas () {
		Controle controle = new Controle();
		controle.setPossibilidadeChuva(51);
		assertTrue(controle.indicaSapato(controle.getPossibilidadeChuva()).equals("botas"));
		
	}
	
	@Test
	public void FrioIndicaCasaco () {
		Controle controle = new Controle();
		controle.setTemperatura(10);
		assertTrue(controle.indicaCasaco(controle.getTemperatura()).equals("casaco"));
	}

}
