package org.proxibanqueswing.domaine;

import java.util.Date;

public class Personnel {
	private int idPersonnel;
	private String nomPersonnel;
	private String prenomPersonnel;
	private String adressePersonnel;
	private String telPersonnel;
	private Date dateEmbauche;
	
	public Personnel() {
		
	}

	/**
	 * @param idPersonnel
	 * @param nomPersonnel
	 * @param prenomPersonnel
	 * @param adressePersonnel
	 * @param telPersonnel
	 * @param dateEmbauche
	 */
	public Personnel(int idPersonnel, String nomPersonnel, String prenomPersonnel, String adressePersonnel,
			String telPersonnel,Date dateEmbauche) {
		super();
		this.idPersonnel = idPersonnel;
		this.nomPersonnel = nomPersonnel;
		this.prenomPersonnel = prenomPersonnel;
		this.adressePersonnel = adressePersonnel;
		this.telPersonnel = telPersonnel;
		this.dateEmbauche = dateEmbauche;
	}

	public int getIdPersonnel() {
		return idPersonnel;
	}

	public void setIdPersonnel(int idPersonnel) {
		this.idPersonnel = idPersonnel;
	}

	public String getNomPersonnel() {
		return nomPersonnel;
	}

	public void setNomPersonnel(String nomPersonnel) {
		this.nomPersonnel = nomPersonnel;
	}

	public String getPrenomPersonnel() {
		return prenomPersonnel;
	}

	public void setPrenomPersonnel(String prenomPersonnel) {
		this.prenomPersonnel = prenomPersonnel;
	}

	public String getAdressePersonnel() {
		return adressePersonnel;
	}

	public void setAdressePersonnel(String adressePersonnel) {
		this.adressePersonnel = adressePersonnel;
	}

	public String getTelPersonnel() {
		return telPersonnel;
	}

	public void setTelPersonnel(String telPersonnel) {
		this.telPersonnel = telPersonnel;
	}

	
	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	@Override
	public String toString() {
		return "Personnel [idPersonnel=" + idPersonnel + ", nomPersonnel=" + nomPersonnel + ", prenomPersonnel="
				+ prenomPersonnel + ", adressePersonnel=" + adressePersonnel + ", telPersonnel=" + telPersonnel
				+ ", dateEmbauche=" + dateEmbauche + "]";
	}

	
	
	

}
