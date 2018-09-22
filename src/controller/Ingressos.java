package controller;

import java.util.Random;

public class Ingressos {
	
// a ideia e passar os valores no main e manipulalos aqui
	
	private static int capacidadeShow = 100;
	private static int totalPessoas = 300;
	private int ingressosVendidos = 0;
	private int numPermissoes = 1;
	
// GET && SET de total de Ingressos
	
	public int getCapacidadeShow(){return this.capacidadeShow;}
	
	public void setCapacidadeShow
	(int capacidadeShow ){this.capacidadeShow = capacidadeShow;}
	
//---------------------------------------------------------------------------
	
// GET && SET de total de Pessoas
	
	public int getTotalPessoas(){return this.totalPessoas;}
	
	public void setTotalPessoas(int totalPessoas)
	{this.totalPessoas = totalPessoas;}
	
//---------------------------------------------------------------------------

// GET && SET de ingressos vendidos
	
	public int getIngressosVendidos(){return this.ingressosVendidos;}
	
	public void setIngressosVendidos(int ingressosVendidos)
	{this.ingressosVendidos = ingressosVendidos;}
	
//----------------------------------------------------------------------------


// GET && SET  de numero de permissoes do semaphore
	
	public int getNumPermissoes(){return this.numPermissoes;}
	
	public void setNumPermissoes(int numPermissoes)
	{this.numPermissoes = numPermissoes; }
	
//----------------------------------------------------------------------------
}
