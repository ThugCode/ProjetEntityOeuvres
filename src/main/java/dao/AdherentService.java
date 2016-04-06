package dao;

import meserreurs.MonException;
import java.util.*;

import metier.*;

/**
 * Classe DAO pour les adhérents
 * 
 * @author GERLAND - LETOURNEUR
 */
public class AdherentService extends EntityService {

	/**
	 * Ajout d'un adhérent en base de données
	 * 
	 * @param adherent
	 * @throws MonException
	 */
	public void insertAdherent(Adherent adherent) throws MonException {
	}

	/**
	 * Modification d'un adhérent en base de données
	 * 
	 * @param adherent
	 * @throws MonException
	 */
	public void updateAdherent(Adherent adherent) throws MonException {
			}
	
	/**
	 * Consulter un adhérent par Id
	 * Fabrique et renvoie un objet adhérent contenant le résultat de la requète
	 * 
	 * @param numero integer
	 */
	public Adherent consulterAdherent(int numero) throws MonException {
		return null;
	}

	/**
	 * Consulter tous les adhérents
	 * Fabrique et renvoie les objets adhérent contenant le résultat de la requète
	 * 
	 * @throws MonException
	 */
	public List<Adherent> consulterListeAdherents() throws MonException {
		return null;
	}
	
	/**
	 * Consulter les adhérents par paquet
	 * Fabrique et renvoie les objets adhérent contenant le résultat de la requète
	 * 
	 * @throws MonException
	 */
	public List<Adherent> consulterListeAdherents(int page, int nombreParPage) throws MonException {
		return null;
	}

	/**
	 * Construire les objects Adherent en fonction de la requête passée en paramêtre
	 * 
	 * @param mysql String
	 * @throws MonException
	 */
	private List<Adherent> consulterListeAdherents(String mysql) throws MonException {
		return null;
	}

	/**
	 * Supprimer un adhérent par Id
	 * 
	 * @param numero integer
	 * @throws MonException
	 */
	public boolean deleteAdherent(int id) throws MonException {
		return false;
	}
}
