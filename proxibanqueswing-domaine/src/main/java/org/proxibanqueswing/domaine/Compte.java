package org.proxibanqueswing.domaine;

import java.util.Date;

public class Compte {
	private int numeroCompte;
	private Double solde;
	private Date dateOuverture;
	
	public Compte() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroCompte
	 * @param solde
	 * @param dateOuverture
	 */
	public Compte(int numeroCompte, Double solde, Date dateOuverture) {
		super();
		this.numeroCompte = numeroCompte;
		this.solde = solde;
		this.dateOuverture = dateOuverture;
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

	@Override
	public String toString() {
		return "Compte [numeroCompte=" + numeroCompte + ", solde=" + solde + ", dateOuverture=" + dateOuverture + "]";
	}
	
	

}
