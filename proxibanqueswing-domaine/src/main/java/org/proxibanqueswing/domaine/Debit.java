package org.proxibanqueswing.domaine;

import java.util.Date;

public class Debit extends Transaction {
	private int numeroCompte;

	public Debit() {
		
	}
	
	
	/**
	 * @param numeroTransaction
	 * @param dateTransaction
	 * @param montantTransaction
	 * @param logTransactions
	 * @param conseiller
	 */
	public Debit(int numeroTransaction, Date dateTransaction, Double montantTransaction,
			LogTransactions logTransactions, Conseiller conseiller, int numeroCompte) {
		super(numeroTransaction, dateTransaction, montantTransaction, logTransactions, conseiller);
		this.numeroCompte = numeroCompte;
	}


	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	@Override
	public String toString() {
		return super.toString() + "numeroCompte=" + numeroCompte + "]";
	}
	
	
	
	

}
