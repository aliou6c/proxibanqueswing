package org.proxibanqueswing.domaine;

import java.util.Date;
import java.util.List;

public class LogTransactions {
	private int numeroLog;
	private Date dateLog;
	
	private List<Transaction> listTransaction;

	public LogTransactions() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroLog
	 * @param dateLog
	 * @param compte
	 * @param transaction
	 */
	public LogTransactions(int numeroLog, Date dateLog) {
		super();
		this.numeroLog = numeroLog;
		this.dateLog = dateLog;		
		List<Transaction> listTransaction = null;
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
	
	public List<Transaction> getListTransaction() {
		return listTransaction;
	}

	public void setListTransaction(List<Transaction> listTransaction) {
		this.listTransaction = listTransaction;
	}

	@Override
	public String toString() {
		return "LogTransactions [numeroLog=" + numeroLog + ", dateLog=" + dateLog + ", listTransaction="
				+ listTransaction + "]";
	}

	
	
	



}
