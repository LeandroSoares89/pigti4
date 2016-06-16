package br.com.nilzaContabilidade.model;


import java.io.Serializable;
import java.util.Date;


public class ItemBaixado  extends Item implements Serializable{
	
	private static final long serialVersionUID = 1L;


	protected Item item;


	private double valorResidual;
	  private double valorVenda;
	  private Date dataVenda;
	  private int turno;
	  private double da;
	  private int taxaResidual;	
      private double taxaAnual;
      private long periodo;
      private double valorContabil;
      private double perdaGanho;
      
      

	//Getters e Setters
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getTaxaResidual() {
		return taxaResidual;
	}
	public void setTaxaResidual(int taxaResidual) {
		this.taxaResidual = taxaResidual;
	}
	public double getTaxaAnual() {
	
		return taxaAnual;
	}
	public void setTaxaAnual(double taxaAnual) {
		this.taxaAnual = taxaAnual;
	}
	public long getPeriodo() {
		
		return periodo;
	}
	public void setPeriodo(long periodo) {
		this.periodo = periodo;
	}
	public double getValorResidual() {
		this.valorResidual = (this.taxaResidual / 100) * 1000;
		
		return valorResidual;
	}
	public void setValorResidual(double valorResidual) {
		this.valorResidual = valorResidual;
	}
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public double getDa() {
		double conta1;
		double conta2;
		double conta3;
		conta1 = 10 - this.valorResidual;
		conta2 = conta1 * getTaxaAnual();
		conta3 = conta2 / 12.0;
		da = +conta3 * getPeriodo();
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	
	public double getValorContabil() {
		this.valorContabil = 1000 - da;
		return valorContabil;
	}
	public void setValorContabil(double valorContabil) {
		this.valorContabil = valorContabil;
	}
	public double getPerdaGanho() {
		perdaGanho = getValorVenda() - getValorContabil();
		return perdaGanho;
	}
	public void setPerdaGanho(double perdaGanho) {
		this.perdaGanho = perdaGanho;
	}
	
	

}
