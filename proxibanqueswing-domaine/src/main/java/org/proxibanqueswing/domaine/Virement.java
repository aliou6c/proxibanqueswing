package org.proxibanqueswing.domaine;

import java.util.Date;

public class Virement extends Transaction {
	private int numeroCompteDebiteur;
	private int numeroCompteCrediteur;
	
	public Virement() {
		
	}	
	
	/**
	 * @param numeroTransaction
	 * @param dateTransaction
	 * @param montantTransaction
	 * @param logTransactions
	 * @param conseiller
	 * @param numeroCompteDebiteur
	 * @param numeroCompteCrediteur
	 */
	public Virement(int numeroTransaction, Date dateTransaction, Double montantTransaction,
			LogTransactions logTransactions, Conseiller conseiller,int numeroCompteDebiteur,int numeroCompteCrediteur ) {
		super(numeroTransaction, dateTransaction, montantTransaction, logTransactions, conseiller);
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
