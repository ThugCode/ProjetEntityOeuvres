package dao;

import meserreurs.MonException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import metier.*;

/**
 * Classe DAO pour les réservations
 * 
 * @author GERLAND - LETOURNEUR
 */
public class ReservationService extends EntityService {
	
	/**
	 * Ajout d'une réservation en base de données
	 * 
	 * @param oeuvrePret
	 * @throws MonException
	 */
	public void insertReservation(Reservation reservation)throws MonException {
	}
	
	/**
	 * Modification d'une réservation en base de données
	 * 
	 * @param adherent
	 * @throws MonException
	 */
	public void updateReservation(Reservation reservation, int oldOeuvre, int oldAdherent) throws MonException {
	}
	
	/**
	 * Consulter une réservation par Id
	 * Fabrique et renvoie un objet reservation contenant le résultat de la requète
	 * 
	 * @param numero integer
	 */
	public Reservation consulterReservation(int idOeuvreVente, int idAdherent) throws MonException {
		return null;
	}
	
	/**
	 * Consulter toutes les reservations
	 * Fabrique et renvoie les objets reservation contenant le résultat de la requète
	 * 
	 * @throws MonException
	 */
	public List<Reservation> consulterListeReservations() throws MonException {
		return null;
	}
	
	/**
	 * Consulter les reservations par paquet
	 * Fabrique et renvoie les objets reservation contenant le résultat de la requète
	 * 
	 * @throws MonException
	 */
	public List<Reservation> consulterListeReservations(int page, int nombreParPage) throws MonException {
		return null;
	}
	
	/**
	 * Construire les objects Reservation en fonction de la requête passée en paramêtre
	 * 
	 * @param mysql String
	 * @throws MonException
	 */
	private List<Reservation> consulterListeReservations(String mysql) throws MonException {
		return null;
	}
	
	/**
	 * Supprimer une reservation par Id
	 * 
	 * @param numero integer
	 * @throws MonException
	 */
	public boolean deleteReservation(int idOeuvreVente, int idAdherent) throws MonException {
		return false;
	}

	
}
