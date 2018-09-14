package view;

import java.util.Random;
import java.util.concurrent.Semaphore;

import controller.Sistema_de_Bilheteria;

public class Main {

	public static void main(String[] args) {
        
	
		
		int pessoas = 300;
		int max_Pessoas = 100;
		int qtdeIngressos = 0 ;
		int maxIngressos = 100;
		Semaphore semafaro = new Semaphore(max_Pessoas);
		Random qtdecomprada = new Random();
		
		
		
		
				
		
		
		for (int i = 0; i < 2; i++){
		
			Sistema_de_Bilheteria bilhetes = 
					new Sistema_de_Bilheteria(pessoas,semafaro,maxIngressos,
							qtdeIngressos);
			
			qtdeIngressos = bilhetes.avaliar_Compra(qtdecomprada);
			
		}
		
		
	
		
		
		

	}

}
