package org.proxibanqueswing.domaine;

import java.util.Date;
import java.util.List;

public class CompteEpargne extends Compte {
	private float tauxRemuneration;

	/**
	 * 
	 */
	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroCompte
	 * @param solde
	 * @param dateOuverture
	 * @param listTransactions
	 * @param carte
	 * @param client
	 */
	public CompteEpargne(int numeroCompte, Double solde, Date dateOuverture, List<Transaction> listTransactions,
			Carte carte, Client client, float tauxRemuneration) {
		super(numeroCompte, solde, dateOuverture, listTransactions, carte, client);
		this.tauxRemuneration =  tauxRemuneration;
	}

	public float getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(float tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return super.toString() + "tauxRemuneration=" + tauxRemuneration + "]";
	}
	
	

	

	
	
	

	

}
