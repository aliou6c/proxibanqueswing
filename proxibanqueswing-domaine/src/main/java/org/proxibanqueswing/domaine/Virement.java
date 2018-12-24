package org.proxibanqueswing.domaine;

import java.util.Date;

public class Virement extends Transaction {
	private int numeroCompteDebiteur;
	private int numeroCompteCrediteur;
	/**
	 * @param numeroTransaction
	 * @param dateTransaction
	 * @param montantTransaction
	 */
	public Virement(int numeroTransaction, Date dateTransaction, Double montantTransaction, int numeroCompteDebiteur, int numeroCompteCrediteur) {
		super(numeroTransaction, dateTransaction, montantTransaction);
		this.numeroCompteDebiteur = numeroCompteDebiteur;
		this.numeroCompteCrediteur = numeroCompteCrediteur;
	}
	public int getNumeroCompteDebiteur() {
		return numeroCompteDebiteur;
	}
	public void setNumeroCompteDebiteur(int numeroCompteDebiteur) {
		this.numeroCompteDebiteur = numeroCompteDebiteur;
	}
	public int getNumeroCompteCrediteur() {
		return numeroCompteCrediteur;
	}
	public void setNumeroCompteCrediteur(int numeroCompteCrediteur) {
		this.numeroCompteCrediteur = numeroCompteCrediteur;
	}
	@Override
	public String toString() {
		return super.toString() + "numeroCompteDebiteur=" + numeroCompteDebiteur + ", numeroCompteCrediteur="
				+ numeroCompteCrediteur + "]";
	}
	
	
	
	
	
}
