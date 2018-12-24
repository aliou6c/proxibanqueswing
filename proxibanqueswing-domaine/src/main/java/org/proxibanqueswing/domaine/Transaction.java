package org.proxibanqueswing.domaine;

import java.util.Date;

public class Transaction {
	private int numeroTransaction;
	private Date dateTransaction;
	private Double montantTransaction;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroTransaction
	 * @param dateTransaction
	 * @param montantTransaction
	 */
	public Transaction(int numeroTransaction, Date dateTransaction, Double montantTransaction) {
		super();
		this.numeroTransaction = numeroTransaction;
		this.dateTransaction = dateTransaction;
		this.montantTransaction = montantTransaction;
	}

	public int getNumeroTransaction() {
		return numeroTransaction;
	}

	public void setNumeroTransaction(int numeroTransaction) {
		this.numeroTransaction = numeroTransaction;
	}

	public Date getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(Date dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public Double getMontantTransaction() {
		return montantTransaction;
	}

	public void setMontantTransaction(Double montantTransaction) {
		this.montantTransaction = montantTransaction;
	}

	@Override
	public String toString() {
		return "Transaction [numeroTransaction=" + numeroTransaction + ", dateTransaction=" + dateTransaction
				+ ", montantTransaction=" + montantTransaction + "]";
	}
	
	
	
	

}
