package org.proxibanqueswing.domaine;

import java.util.Date;

public class Credit extends Transaction {
	private int numeroCompte;
	
	public Credit() {
		
	}
	
	/**
	 * @param numeroTransaction
	 * @param dateTransaction
	 * @param montantTransaction
	 * @param compte
	 * @param conseiller
	 */
	public Credit(int numeroTransaction, Date dateTransaction, Double montantTransaction, Compte compte,
			Conseiller conseiller,int numeroCompte) {
		super(numeroTransaction, dateTransaction, montantTransaction, compte, conseiller);
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
		return super.toString() +  "numeroCompte=" + numeroCompte + "]";
	}
	
	
	
	

}
