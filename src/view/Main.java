package view;

import java.util.Random;
import java.util.concurrent.Semaphore;

import controller.Sistema_de_Bilheteria;

public class Main {

	public static void main(String[] args) {
        
		int pessoas = 300;
		int max_Pessoas = 100;
		int ingressos = 4;
		Semaphore semafaro = new Semaphore(max_Pessoas);
		Random r = new Random();
		Sistema_de_Bilheteria bilheteS = 
				new Sistema_de_Bilheteria(pessoas,semafaro,ingressos);
		
		
		
		
		

	}

}
