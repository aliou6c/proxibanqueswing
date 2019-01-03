package org.proxibanqueswing.domaine;

import java.util.Date;

public class Agence {
	private int numeroAgence;
	private Date dateCreation;
	private Gerant gerant;
	
	public Agence() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroAgence
	 * @param dateCreation
	 */
	public Agence(int numeroAgence, Date dateCreation, Gerant gerant) {
		super();
		this.numeroAgence = numeroAgence;
		this.dateCreation = dateCreation;
		this.gerant = gerant;
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

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}
	
	
	
	

}
