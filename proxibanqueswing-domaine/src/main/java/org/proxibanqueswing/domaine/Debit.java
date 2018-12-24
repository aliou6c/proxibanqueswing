package org.proxibanqueswing.domaine;

import java.util.Date;

public class Debit extends Transaction {
	private int numeroCompte;

	/**
	 * @param numeroTransaction
	 * @param dateTransaction
	 * @param montantTransaction
	 */
	public Debit(int numeroTransaction, Date dateTransaction, Double montantTransaction, int numeroCompte) {
		super(numeroTransaction, dateTransaction, montantTransaction);
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
