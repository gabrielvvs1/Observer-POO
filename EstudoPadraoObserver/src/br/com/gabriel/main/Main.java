package br.com.gabriel.main;

import br.com.gabriel.padrao.impl.Interruptor;
import br.com.gabriel.padrao.impl.Luz;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interruptor objInterruptor = new Interruptor();
		Luz objLuz =new Luz();
		
		objInterruptor.adicionarListener(objLuz);
		objInterruptor.ligar();
	}

}
