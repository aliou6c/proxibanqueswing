package org.proxibanqueswing.domaine;

import java.util.Date;
import java.util.List;

public class Compte {
	private int numeroCompte;
	private Double solde;
	private Date dateOuverture;
	private List<LogTransactions>logTransactions;
	private Carte carte;
	private Client client;
	
	public Compte() {
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
	public Compte(int numeroCompte, Double solde, Date dateOuverture, List<LogTransactions>logTransactions, Carte carte,Client client) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
		this.logTransactions = logTransactions;
		this.carte = carte;
		this.client = client;
	}

	public int getNumeroCompte() {
		return numeroCompte;
	}

	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public List<LogTransactions> getLogTransactions() {
		return logTransactions;
	}

	public void setLogTransactions(List<LogTransactions> logTransactions) {
		this.logTransactions = logTransactions;
	}

	public Carte getCarte() {
		return carte;
	}

	public void setCarte(Carte carte) {
		this.carte = carte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture
				+ ", logTransactions=" + logTransactions + ", carte=" + carte + ", client=" + client + "]";
	}
	
	
	
	

	
	

}
