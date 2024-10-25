package br.com.gabriel.padrao.impl;

import br.com.gabriel.padrao.InterruptorListerner;

public class Luz implements InterruptorListerner {
	
	private boolean acesa = false;

	@Override
	public void aoligar() {
		// TODO Auto-generated method stub
		acesa = true;
		System.out.println("Luz ligada");
		
	}

	@Override
	public void aodesligar() {
		// TODO Auto-generated method stub
		acesa = false;
		System.out.println("Luz desligada");
	}
	

}
