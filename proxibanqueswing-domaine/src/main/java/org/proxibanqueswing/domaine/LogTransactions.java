package org.proxibanqueswing.domaine;

import java.util.Date;

public class LogTransactions {
	private int numeroLog;
	private Date dateLog;
	private Compte compte;
	private Transaction transaction;

	public LogTransactions() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroLog
	 * @param dateLog
	 * @param compte
	 * @param transaction
	 */
	public LogTransactions(int numeroLog, Date dateLog, Compte compte, Transaction transaction) {
		super();
		this.numeroLog = numeroLog;
		this.dateLog = dateLog;
		this.compte = compte;
		this.transaction = transaction;
	}

	public int getNumeroLog() {
		return numeroLog;
	}

	public void setNumeroLog(int numeroLog) {
		this.numeroLog = numeroLog;
	}

	public Date getDateLog() {
		return dateLog;
	}

	public void setDateLog(Date dateLog) {
		this.dateLog = dateLog;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "LogTransactions [numeroLog=" + numeroLog + ", dateLog=" + dateLog + ", compte=" + compte
				+ ", transaction=" + transaction + "]";
	}
	
	



}
