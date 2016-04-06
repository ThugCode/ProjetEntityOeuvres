package dao;

import meserreurs.MonException;
import java.util.*;

import metier.*;

/**
 * Classe DAO pour les oeuvres pret
 * 
 * @author GERLAND - LETOURNEUR
 */
public class OeuvrePretService extends EntityService{

	/**
	 * Ajout d'une oeuvre en base de données
	 * 
	 * @param oeuvrePret
	 * @throws MonException
	 */
	public void insertOeuvrePret(Oeuvrepret oeuvrePret)throws MonException {
	}
	
	/**
	 * Modification d'une oeuvre en base de données
	 * 
	 * @param adherent
	 * @throws MonException
	 */
	public void updateOeuvrePret(Oeuvrepret oeuvrePret) throws MonException {
	}
	
	/**
	 * Consulter une oeuvre par Id
	 * Fabrique et renvoie un objet oeuvrepret contenant le résultat de la requète
	 * 
	 * @param numero integer
	 */
	public Oeuvrepret consulterOeuvrePret(int numero) throws MonException {
		return null;
	}
	
	/**
	 * Consulter toutes les oeuvres
	 * Fabrique et renvoie les objets oeuvrepret contenant le résultat de la requète
	 * 
	 * @throws MonException
	 */
	public List<Oeuvrepret> consulterListeOeuvresPret() throws MonException {
		return null;
	}
	
	/**
	 * Consulter les oeuvres par paquet
	 * Fabrique et renvoie les objets oeuvrepret contenant le résultat de la requète
	 * 
	 * @throws MonException
	 */
	public List<Oeuvrepret> consulterListeOeuvresPret(int page, int nombreParPage) throws MonException {
		return null;
	}
	
	/**
	 * Construire les objects OeuvrePret en fonction de la requête passée en paramêtre
	 * 
	 * @param mysql String
	 * @throws MonException
	 */
	private List<Oeuvrepret> consulterListeOeuvresPret(String mysql) throws MonException {
		return null;
	}
	
	/**
	 * Supprimer une oeuvre par Id
	 * 
	 * @param numero integer
	 * @throws MonException
	 */
	public boolean deleteOeuvrePret(int id) throws MonException {
		return false;
	}
}
