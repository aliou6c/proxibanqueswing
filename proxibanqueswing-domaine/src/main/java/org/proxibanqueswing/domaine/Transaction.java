package org.proxibanqueswing.domaine;

import java.util.Date;

public class Transaction {
	private int numeroTransaction;
	private Date dateTransaction;
	private Double montantTransaction;
	private Conseiller conseiller;
	private Compte compte;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroTransaction
	 * @param dateTransaction
	 * @param montantTransaction
	 * @param conseiller
	 * @param transactions
	 */
	public Transaction(int numeroTransaction, Date dateTransaction, Double montantTransaction,Compte compte, Conseiller conseiller) {
		super();
		this.numeroTransaction = numeroTransaction;
		this.dateTransaction = dateTransaction;
		this.montantTransaction = montantTransaction;
		this.conseiller = conseiller;
		this.compte = compte;
		
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
	
	

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Transaction [numeroTransaction=" + numeroTransaction + ", dateTransaction=" + dateTransaction
				+ ", montantTransaction=" + montantTransaction + ", conseiller=" + conseiller + ", compte=" + compte
				+ "]";
	}

	

	
	
	
	

	

	
	
	
	

}
