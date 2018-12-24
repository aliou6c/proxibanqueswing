package org.proxibanqueswing.domaine;

public class Client {
	private int idClient;
	private String nomClient;
	private String prenomClient;
	private String emailClient;
	private String adresseClient;
	private int codePostalClient;
	private String ville;
	private String telClient;
	private String professionClient;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idClient
	 * @param nomClient
	 * @param prenomClient
	 * @param emailClient
	 * @param adresseClient
	 * @param codePostalClient
	 * @param ville
	 * @param telClient
	 * @param professionClient
	 */
	public Client(int idClient, String nomClient, String prenomClient, String emailClient, String adresseClient,
			int codePostalClient, String ville, String telClient, String professionClient) {
		super();
		this.idClient = idClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.adresseClient = adresseClient;
		this.codePostalClient = codePostalClient;
		this.ville = ville;
		this.telClient = telClient;
		this.professionClient = professionClient;
	}

	public int getIdClient() {
		return idClient;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public int getCodePostalClient() {
		return codePostalClient;
	}

	public void setCodePostalClient(int codePostalClient) {
		this.codePostalClient = codePostalClient;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelClient() {
		return telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	public String getProfessionClient() {
		return professionClient;
	}

	public void setProfessionClient(String professionClient) {
		this.professionClient = professionClient;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", emailClient=" + emailClient + ", adresseClient=" + adresseClient + ", codePostalClient="
				+ codePostalClient + ", ville=" + ville + ", telClient=" + telClient + ", professionClient="
				+ professionClient + "]";
	}
	
	

}
