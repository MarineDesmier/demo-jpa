package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		// insertion de la table régions
		Region region = new Region();
		region.setId(3);
		region.setNom("Occitanie");
		em.persist(region);
		
		transaction.commit();
	}

}
