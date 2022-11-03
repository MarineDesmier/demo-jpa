package fr.diginamic;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionVilleJpa {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		//récupère la connexion de la bdd
		EntityManager em = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		// Calendar pour ma date
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 6, 10);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2015, 3, 17);
		
		Ville v1 = new Ville();
		v1.setNom("Mâcon");
		v1.setCodePostal(71000);
		v1.setDernierRecensement(cal.getTime());
		v1.setCategorie(Categorie.MOYENNE);
		
		Ville v2 = new Ville();
		v2.setNom("Lyon");
		v2.setCodePostal(69000);
		v2.setDernierRecensement(cal2.getTime());
		v2.setCategorie(Categorie.GRANDE);
		
		em.persist(v1);
		em.persist(v2);
		transaction.commit();
	}

}
