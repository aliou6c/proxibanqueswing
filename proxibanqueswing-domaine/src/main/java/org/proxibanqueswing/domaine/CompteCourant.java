package org.proxibanqueswing.domaine;

import java.util.Date;
import java.util.List;

public class CompteCourant extends Compte {
	private Double decouverte;

	
		
		
	/**
	 * 
	 */
	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroCompte
	 * @param solde
	 * @param dateOuverture
	 * @param logTransactions
	 * @param carte
	 * @param client
	 */
	public CompteCourant(int numeroCompte, Double solde, Date dateOuverture, List<LogTransactions> logTransactions,
			Carte carte, Client client, Double decouverte) {
		super(numeroCompte, solde, dateOuverture, logTransactions, carte, client);
		this.decouverte = decouverte;
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
