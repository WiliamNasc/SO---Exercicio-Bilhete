package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

import javax.swing.JOptionPane;

public class Sistema_de_Bilheteria extends Thread{
	
	private Semaphore capacidaShow;
	private Semaphore maxIngressos;
	Ingressos infoShow = new Ingressos();
	
	public Sistema_de_Bilheteria (Semaphore capacidadeShow,
			Semaphore maxIngresso){
		
		this.capacidaShow = capacidadeShow;
		this.maxIngressos = maxIngresso;
	
	}
	
//--------------------------------------------------------------------------------------
	
	
	@Override
	public void run() {
		
		
	}
	
//--------------------------------------------------------------------------------------
	
	public void vendas_Bilhete(int i){
		
		infoShow.setCapacidadeShow(infoShow.getCapacidadeShow() - i);
		
		if (infoShow.getCapacidadeShow() > 0)
			
			System.out.println("Ingressos Disponiveis");
		
		else
			
			System.out.println("Ingressos acabaram !!!");
		    		
		
	}
	
//--------------------------------------------------------------------------------------
	
	public boolean Login_User(){
		
		int tempoEspera = (int) ((Math.random() * 3001));
		
		if (tempoEspera == 3000){
			
			JOptionPane.showMessageDialog(null, "n�o liberado");
			
			return false;
			
		}else{
			
			//JOptionPane.showMessageDialog(null,"liberado");
			
			//vendas_Bilhete();
			
			return true;
		}
		
	}
	
//--------------------------------------------------------------------------------------
	
	public int avaliar_Compra(Random r){
		
		int qtde = r.nextInt(4);
		
		while(qtde == 0){
			
			qtde = r.nextInt(4);
		}
		
		System.out.println(qtde);
		
		return qtde;
	}

}
