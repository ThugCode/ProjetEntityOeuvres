package dao;

import meserreurs.MonException;
import java.util.*;

import metier.*;

/**
 * Classe DAO pour les propriétaires
 * 
 * @author GERLAND - LETOURNEUR
 */
public class ProprietaireService extends EntityService {
	
	/**
	 * Consulter un propriétaire par Id
	 * Fabrique et renvoie un objet Proprietaire contenant le résultat de la requète
	 * 
	 * @param numero integer
	 */
	public Proprietaire consulterProprietaire(int numero) throws MonException {
		return null;
	}

	/**
	 * Consulter tous les propriétaires
	 * Fabrique et renvoie les objets proprietaire contenant le résultat de la requète
	 * 
	 * @throws MonException
	 */
	public List<Proprietaire> consulterListeProprietaires() throws MonException {
		return null;
	}

	/**
	 * Construire les objects Proprietaire en fonction de la requête passée en paramêtre
	 * 
	 * @param mysql String
	 * @throws MonException
	 */
	private List<Proprietaire> consulterListeProprietaires(String mysql) throws MonException {
		return null;
	}
}
