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
	 * @param compte
	 * @param conseiller
	 */
	public Virement(int numeroTransaction, Date dateTransaction, Double montantTransaction, Compte compte,
			Conseiller conseiller,int numeroCompteDebiteur,  int numeroCompteCrediteur) {
		super(numeroTransaction, dateTransaction, montantTransaction, compte, conseiller);
		this.numeroCompteCrediteur = numeroCompteCrediteur;
		this.numeroCompteDebiteur = numeroCompteDebiteur;
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
