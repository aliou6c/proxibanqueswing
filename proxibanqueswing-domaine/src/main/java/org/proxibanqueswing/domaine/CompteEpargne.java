package org.proxibanqueswing.domaine;

import java.util.Date;

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
	 */
	public CompteEpargne(int numeroCompte, Double solde, Date dateOuverture, float tauxRemuneration) {
		super(numeroCompte, solde, dateOuverture);
		this.tauxRemuneration = tauxRemuneration;
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
