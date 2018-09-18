package controller;

import java.util.Random;

public class Ingressos {
	
// a ideia e passar os valores no main e manipulalos aqui
	
	private int capacidadeShow = 100;
	private int totalPessoas = 300;
	private int minIngressos = 1;
	private int maxIngressos = 4;
	private int ingressosVendidos = 0;
	private int numPermissoes = 1;
	private Random rIngressos = new Random ();
	
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

// GET && SET de minimo de ingressos a serem vendidos
	
	public int setMinIngressos(){return this.minIngressos;}
	
	public void getMinIngressos(int minIngressos)
	{this.minIngressos = minIngressos;}

//---------------------------------------------------------------------------
	
// GET && SET de maximo de ingressos a serem vendidos
	
	public int getMaxIngressos(){return this.maxIngressos;}
	
	public void setMaxIngressos(int maxIngressos)
	{this.maxIngressos = maxIngressos;}

//---------------------------------------------------------------------------

// GET && SET de ingressos vendidos
	
	public int getIngressosVendidos(){return this.ingressosVendidos;}
	
	public void setIngressosVendidos(int ingressosVendidos)
	{this.ingressosVendidos = ingressosVendidos;}
	
//----------------------------------------------------------------------------

// GET && SET de ingressos aleatorios
	
	public Random getRIngressos(){return this.rIngressos;}
	
	public void setRIngressos(Random rIngressos)
	{this.rIngressos = rIngressos;}

//----------------------------------------------------------------------------

// GET && SET  de numero de permissoes do semaphore
	
	public int getNumPermissoes(){return this.numPermissoes;}
	
	public void setNumPermissoes(int numPermissoes)
	{this.numPermissoes = numPermissoes; }
	
//----------------------------------------------------------------------------
}
