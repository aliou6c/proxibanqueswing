package org.proxibanqueswing.domaine;

import java.util.List;

public class Gerant extends Personnel {
	private Agence agence;
	private List<Conseiller>listConseiller;
	
	public Gerant() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param agence
	 * @param listConseiller
	 */
	public Gerant(Agence agence, List<Conseiller> listConseiller) {
		super();
		this.agence = agence;
		this.listConseiller = listConseiller;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public List<Conseiller> getListConseiller() {
		return listConseiller;
	}

	public void setListConseiller(List<Conseiller> listConseiller) {
		this.listConseiller = listConseiller;
	}

	@Override
	public String toString() {
		return "Gerant [agence=" + agence + ", listConseiller=" + listConseiller + "]";
	}
	
	
	
	
	
	
	

}
