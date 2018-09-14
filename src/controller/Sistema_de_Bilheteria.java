package controller;

import java.util.concurrent.Semaphore;

public class Sistema_de_Bilheteria extends Thread{
	
	private int pessoas;
	private Semaphore semafaro;
	
	public Sistema_de_Bilheteria (int pessoas, Semaphore semaforo){
		
		this.pessoas = pessoas;
		this.semafaro = semafaro;
	
	}
	
//--------------------------------------------------------------------------------------
	
	
	@Override
	public void run() {
		
		
	}
	
//--------------------------------------------------------------------------------------
	
	public void vendas_Bilhete(int pessoas, Semaphore semafaro){
	
		
		
	}

}
