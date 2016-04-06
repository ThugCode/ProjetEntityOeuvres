package dao;

import meserreurs.MonException;
import java.util.*;

import javax.persistence.EntityTransaction;

import metier.*;

public class Service extends EntityService {

	// ajout 'un adhérent
	

	public void insertAdherent(Adherent unAdherent) throws MonException {

		try {
						
			EntityTransaction transac = startTransaction();
			if (!entitymanager.contains(unAdherent)) {
			transac.begin();
			 entitymanager.persist(unAdherent);
			 entitymanager.flush();
			 transac.commit();
			}
			entitymanager.close();
		} catch (Exception e) {
			new MonException("Erreur d'insertion", e.getMessage());
		}
	}

	// gestion des adherents
	// Consultation d'un adhérent par son numéro
	// Fabrique et renvoie un objet adhérent contenant le résultat de la requête
	// BDD
	public Adherent consulterAdherent(int numero) throws MonException {
		Adherent unAd = null;
		try {
			
			EntityTransaction transac = startTransaction();
			transac.begin();
			unAd = entitymanager.find(Adherent.class, numero);
			entitymanager.close();
			emf.close();
			
		} catch (Exception e) {
			new MonException("Erreur de lecture", e.getMessage());
		}
		return unAd;
	}

	// Consultation des adhérents
	// Fabrique et renvoie une liste d'objets adhérent contenant le résultat de
	// la requête BDD
	public List<Adherent> consulterListeAdherents() throws MonException {
		List<Adherent> mesAdherents= null;
		try {
			
			EntityTransaction transac = startTransaction();
			transac.begin();
			mesAdherents = (List<Adherent>)  entitymanager.createQuery("SELECT a FROM Adherent a ORDER BY a.nomAdherent").getResultList();
			entitymanager.close();
		}  catch (RuntimeException e){
			new MonException("Erreur de lecture ", e.getMessage());
		}
		return mesAdherents;
	}
}
