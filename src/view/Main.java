package view;

import java.util.Random;
import java.util.concurrent.Semaphore;

import controller.Sistema_de_Bilheteria;

public class Main {

	public static void main(String[] args) {
        
		int pessoas = 300;
		int max_Pessoas = 100;
		int qtdeIngressos = 4;
		int maxIngressos = 100;
		Semaphore semafaro = new Semaphore(max_Pessoas);
		Sistema_de_Bilheteria bilheteS = 
				new Sistema_de_Bilheteria(pessoas,semafaro,maxIngressos, qtdeIngressos);
		
		
		
		for (int i = 0; i < 300; i++){
			
			
		}
		
		
		

	}

}
