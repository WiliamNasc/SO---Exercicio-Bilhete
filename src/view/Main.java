package view;

import java.util.Random;
import java.util.concurrent.Semaphore;

import controller.Ingressos;
import controller.Sistema_de_Bilheteria;

public class Main {

	public static void main(String[] args) {

	Ingressos in = new Ingressos();
	int teste =0;
	Semaphore capacidadeShow = null;
	Semaphore maxIngresso = null;
	
	for(int i = 0; i < 300; i++){
		
	Sistema_de_Bilheteria sisB =
			new Sistema_de_Bilheteria(capacidadeShow, maxIngresso);
	
	sisB.vendas_Bilhete(i);
	teste +=1;
	System.out.println(teste);
	
	}
	
	}

}
