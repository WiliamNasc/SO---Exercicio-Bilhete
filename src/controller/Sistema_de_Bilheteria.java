package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

import javax.swing.JOptionPane;

public class Sistema_de_Bilheteria extends Thread{
	
	private int i;
	private Semaphore semafaro;
	//private Semaphore maxIngressos;
	Ingressos infoShow = new Ingressos();
	
	public Sistema_de_Bilheteria (int i,Semaphore semafaro){
		
		this.i = i;
		this.semafaro = semafaro;
	
	}
	
//--------------------------------------------------------------------------------------
	
	
	@Override
	public void run() {
		
		/*
		try{
			
			semafaro.acquire();
			entra();
			
		}catch(InterruptedException e){
			
			e.printStackTrace();
			
		}finally{
			
			semafaro.release();
			
		}
		*/
		
		Login_User();
	}
	
//--------------------------------------------------------------------------------------
	
	public void vendas_Bilhete(){
		
		double tempoEspera = (double) ((Math.random() * 3000));
		
		
		if (infoShow.getCapacidadeShow() > 0 && tempoEspera <= 2.5){
		
			infoShow.setCapacidadeShow(infoShow.getCapacidadeShow() - 
					avaliar_Compra(infoShow.getRIngressos()));
			System.out.println("Ingressos Disponiveis = " + 
			infoShow.getCapacidadeShow());
		}
		
		else{
			
			System.err.println("Tempo de Sessão esgotado :{");
		    		
		}
	}
	
//--------------------------------------------------------------------------------------
	
	public boolean Login_User(){
		
		int tempoEspera = (int) ((Math.random() * 3001));
		
		if (tempoEspera >= 3000){
			
			System.err.println("LOGIN ERROR: TIME OUT :(");
			
			return false;
		}
		else{
			
			vendas_Bilhete();
			
			return true;
		}
			
		
	}
	
//--------------------------------------------------------------------------------
	
	public int avaliar_Compra(Random r){
		
		int qtde = r.nextInt(4);
		
		while(qtde == 0){
			
			qtde = r.nextInt(4);
		}
		
		System.out.println("Quantidade de ingressos comprados = " + qtde);
		
		return qtde;
	}
	
//------------------------------------------------------------------------------

	public void entra(){
		
		System.out.println("Carro " + i + " entrou");
		fica();
		sai();
	}
	
	public void fica(){
		
		int tempo = (int) (Math.random() + 1) * 5000;
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void sai(){
		
		System.out.println("O carro "+ i + " saiu");
	}
}
