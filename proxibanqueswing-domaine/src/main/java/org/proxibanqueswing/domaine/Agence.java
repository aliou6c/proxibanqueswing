package org.proxibanqueswing.domaine;

import java.util.Date;

public class Agence {
	private int numeroAgence;
	private Date dateCreation;
	
	public Agence() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroAgence
	 * @param dateCreation
	 */
	public Agence(int numeroAgence, Date dateCreation) {
		super();
		this.numeroAgence = numeroAgence;
		this.dateCreation = dateCreation;
	}

	public int getNumeroAgence() {
		return numeroAgence;
	}

	public void setNumeroAgence(int numeroAgence) {
		this.numeroAgence = numeroAgence;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	

}
