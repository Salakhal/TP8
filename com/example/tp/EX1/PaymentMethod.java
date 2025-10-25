package com.example.tp.EX1;

/**
 * Contrat pour tout moyen de paiement.
 */
public interface PaymentMethod {
	/**
	 * Tente de payer le montant.
	 * 
	 * @param amount Montant à débiter
	 * @return true si le paiement est accepté
	 */
	boolean pay(double amount);

	/**
	 * Tente de rembourser le montant.
	 * 
	 * @param amount Montant à rembourser
	 * @return true si le remboursement est effectué
	 */
	boolean refund(double amount);

	/**
	 * Retourne le nom de la méthode de paiement.
	 */
	String getName();
}