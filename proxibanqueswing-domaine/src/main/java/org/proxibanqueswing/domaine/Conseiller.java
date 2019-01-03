package org.proxibanqueswing.domaine;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Conseiller extends Personnel{
	private Gerant gerant;
	private Date dateEmbauche;
	private List<Transaction>listTransaction;
	private Client[]client = new Client[10];
	
	public Conseiller() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param gerant
	 * @param dateEmbauche
	 * @param listTransaction
	 * @param client
	 */
	public Conseiller(Gerant gerant, Date dateEmbauche,List<Transaction>listTransaction, Client[]client ) {
		super();
		this.gerant = gerant;
		this.dateEmbauche = dateEmbauche;
		this.listTransaction = listTransaction;
		this.client = client;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	
	public List<Transaction> getListTransaction() {
		return listTransaction;
	}

	public void setListTransaction(List<Transaction> listTransaction) {
		this.listTransaction = listTransaction;
	}
	
	

	public Client[] getClient() {
		return client;
	}

	public void setClient(Client[] client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Conseiller [gerant=" + gerant + ", dateEmbauche=" + dateEmbauche + ", listTransaction="
				+ listTransaction + ", client=" + Arrays.toString(client) + "]";
	}

	

	
	
	
	

}
