package controller;

import java.util.concurrent.Semaphore;

public class Sistema_de_Bilheteria extends Thread{
	
	private int pessoas;
	private Semaphore semafaro;
	private int ingressos;
	
	public Sistema_de_Bilheteria (int pessoas, Semaphore semaforo, int ingressos){
		
		this.pessoas = pessoas;
		this.semafaro = semafaro;
		this.ingressos = ingressos;
	}
	
//--------------------------------------------------------------------------------------
	
	
	@Override
	public void run() {
		
		
	}
	
//--------------------------------------------------------------------------------------
	
	public void vendas_Bilhete(){
	
		
		
	}

}
