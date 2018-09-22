package view;

import java.util.Random;
import java.util.concurrent.Semaphore;

import controller.Ingressos;
import controller.Sistema_de_Bilheteria;

public class Main {
	
	public static Semaphore semafaro;

	public static void main(String[] args) {

	Ingressos in = new Ingressos();
	semafaro = new Semaphore(in.getNumPermissoes());
	

		
	for(int i = 1; i <= in.getTotalPessoas(); i++){
	
		
		Thread teste = new Sistema_de_Bilheteria(i ,semafaro);
		teste.start();
		
		
		
	}
	
	
	
	
	}

}
