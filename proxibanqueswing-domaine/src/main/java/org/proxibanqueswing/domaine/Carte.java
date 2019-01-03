package org.proxibanqueswing.domaine;

public class Carte {
	private int numeroCarte;
	private Compte compte;
	
	public Carte() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param numeroCarte
	 * @param compte
	 */
	public Carte(int numeroCarte, Compte compte) {
		super();
		this.numeroCarte = numeroCarte;
		this.compte = compte;
	}

	public int getNumeroCarte() {
		return numeroCarte;
	}

	public void setNumeroCarte(int numeroCarte) {
		this.numeroCarte = numeroCarte;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		return "Carte [numeroCarte=" + numeroCarte + ", compte=" + compte + "]";
	}
	
	

}
