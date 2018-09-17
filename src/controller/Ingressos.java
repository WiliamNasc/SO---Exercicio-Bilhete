package controller;

public class Ingressos {
	
// a ideia e passar os valores no main e manipulalos aqui
	
	private int capacidadeShow = 100;
	private int totalPessoas = 300;
	private int minIngressos = 1;
	private int maxIngressos = 4;
	
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
	
	public int setMaxIngressos(){return this.maxIngressos;}
	
	public void getMaxIngressos(int maxIngressos)
	{this.maxIngressos = maxIngressos;}

//---------------------------------------------------------------------------


}
