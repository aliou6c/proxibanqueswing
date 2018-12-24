package org.proxibanqueswing.domaine;

public class CarteBancaire {
	private int numerocarte;
	
	public CarteBancaire() {
		
	}

	/**
	 * @param numerocarte
	 */
	public CarteBancaire(int numerocarte) {
		super();
		this.numerocarte = numerocarte;
	}

	public int getNumerocarte() {
		return numerocarte;
	}

	public void setNumerocarte(int numerocarte) {
		this.numerocarte = numerocarte;
	}

	@Override
	public String toString() {
		return "CarteBancaire [numerocarte=" + numerocarte + "]";
	}
	
	

}
