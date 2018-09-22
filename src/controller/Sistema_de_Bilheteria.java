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
		
		try{
			
			semafaro.acquire();
			Login_User();
			
		}catch(InterruptedException e){
			
			e.printStackTrace();
			
		}finally{
			
			semafaro.release();
			
		}
		
		
		
	}
	
//--------------------------------------------------------------------------------------
	
	public void vendas_Bilhete(){
		
		double tempoEspera = (double) ((Math.random() * 3000));
		
		
		if (tempoEspera <= 2500){
		
			avaliar_Compra();
			
		}
		
		else{
			
			System.err.println("Tempo de compra expirado :{");
		    		
		}
	}
	
//--------------------------------------------------------------------------------------
	
	public void Login_User(){
		
		double tempoEspera = (double) ((Math.random() * 3001));
		
		if (tempoEspera >= 3000){
			
			System.err.println("LOGIN ERROR: TIME OUT :(");
			
			
		}
		else{
			
			System.out.println("Cliente nº " + i);
			vendas_Bilhete();
			System.out.println(
					"================================================");
			
		}
			
		
	}
	
//--------------------------------------------------------------------------------
	
	public void avaliar_Compra(){
		
		infoShow.setIngressosVendidos((int) ((Math.random()) * 4) + 1);
		
		
		infoShow.setCapacidadeShow
		(infoShow.getCapacidadeShow() - infoShow.getIngressosVendidos());
		
		
		if (infoShow.getCapacidadeShow() > 0){
			
			System.out.println("Quantidade comprada: "
					+ infoShow.getIngressosVendidos());
					
			System.out.println("Ingressos Disponiveis: " 
			+ infoShow.getCapacidadeShow());
			
			
		
		}else {System.err.println("INGRESSOS ESGOTADOS !");}
		
	}
	
//------------------------------------------------------------------------------

}