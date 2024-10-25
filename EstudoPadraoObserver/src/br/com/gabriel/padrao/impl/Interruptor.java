package br.com.gabriel.padrao.impl;

import br.com.gabriel.padrao.InterruptorListerner;

public class Interruptor {
	
	private InterruptorListerner listerner; // o interruptor sabera o momento em que sera ativado
	
	public void adicionarListener(InterruptorListerner listerner) {
		this.listerner = listerner;
		
	}
	
	public void ligar() {
		listerner.aodesligar();
	}
	
	public void desligar () {
		listerner.aodesligar();
	}

}
