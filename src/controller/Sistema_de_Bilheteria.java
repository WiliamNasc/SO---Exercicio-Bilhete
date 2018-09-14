package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

import javax.swing.JOptionPane;

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
	
		int total = 0;
		
		total += qtdeIngressos - maxIngressos;
		
		if (total == 0)
			
			JOptionPane.showMessageDialog(null, "Acabou os ingressos");
		
		else
			
			System.out.println("Disponivel");
		    qtdeIngressos += total;
		
		
	}
	
//--------------------------------------------------------------------------------------
	
	public boolean Login_User(){
		
		int tempoEspera = (int) ((Math.random() * 3001));
		
		if (tempoEspera == 3000){
			
			JOptionPane.showMessageDialog(null, "não liberado");
			
			return false;
			
		}else{
			
			//JOptionPane.showMessageDialog(null,"liberado");
			
			vendas_Bilhete();
			
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
