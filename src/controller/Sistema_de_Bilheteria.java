package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Sistema_de_Bilheteria extends Thread{
	
	private int pessoas;
	private Semaphore semafaro;
	private int maxIngressos;
	private int qtdeIngressos;
	
// a ideia é passar os valores no main e manipulalos aqui
	
	public Sistema_de_Bilheteria (int pessoas, Semaphore semaforo,
			int maxIngressos, int qtdeIngressos){
		
		this.pessoas = pessoas;
		this.semafaro = semafaro;
		this.maxIngressos = maxIngressos;
		this.qtdeIngressos = qtdeIngressos;
	}
	
//--------------------------------------------------------------------------------------
	
	
	@Override
	public void run() {
		
		
	}
	
//--------------------------------------------------------------------------------------
	
	public void vendas_Bilhete(){
	
		Random compra_In = new Random();
		
		
		
	}
	
//--------------------------------------------------------------------------------------
	
	/*public boolean Login_User(){
		
		
	}*/

}
