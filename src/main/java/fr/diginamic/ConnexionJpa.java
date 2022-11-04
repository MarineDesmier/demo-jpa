package fr.diginamic;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		//récupère la connexion de la bdd
		EntityManager em = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		// insertion de la table régions
		Region region = new Region();
		region.setNom("Occitanie");
		em.persist(region);
		
		Region region1 = new Region();
		region1.setNom("Saône et Loire");
		em.persist(region1);
		
		Region region2 = new Region();
		region2.setNom("Rhône");
		em.persist(region2);
		
		// Calendar pour ma date
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 6, 10);
		
		Ville v1 = new Ville();
		v1.setNom("Mâcon");
		v1.setCodePostal(71000);
		v1.setDernierRecensement(cal.getTime());
		v1.setCategorie(Categorie.MOYENNE);
		v1.setRegion(region1);
		
		em.persist(v1);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2015, 3, 17);
		
		Ville v2 = new Ville();
		v2.setNom("Lyon");
		v2.setCodePostal(69000);
		v2.setDernierRecensement(cal2.getTime());
		v2.setCategorie(Categorie.GRANDE);
		v2.setRegion(region2);
				
		em.persist(v2);
		
		Adresse adresse = new Adresse();
		adresse.setRue("91 rue Rambuteau");
		adresse.setCodePostal(71000);
		adresse.setVille("Mâcon");
		
		Habitant marineDesmier = new Habitant();
		marineDesmier.setNom("DESMIER");
		marineDesmier.setPrenom("Marine");
		marineDesmier.setAdresse(adresse);
		em.persist(marineDesmier);
		
		v1.getHabitants().add(marineDesmier);
		
		transaction.commit();
		

	}

}
