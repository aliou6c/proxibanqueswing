package org.proxibanqueswing.domaine;

import java.util.Date;

public class CompteCourant extends Compte {
	private Double decouverte;

	/**
	 * @param numeroCompte
	 * @param solde
	 * @param dateOuverture
	 */
	public CompteCourant(int numeroCompte, Double solde, Date dateOuverture, Double decouverte) {
		super(numeroCompte, solde, dateOuverture);
		this.decouverte= decouverte;
		
		
	}

	public Double getDecouverte() {
		return decouverte;
	}

	public void setDecouverte(Double decouverte) {
		this.decouverte = decouverte;
	}

	@Override
	public String toString() {
		return super.toString() + "decouverte=" + decouverte + "]";
	}
	
	
	
	

}
