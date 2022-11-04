package fr.diginamic.tp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LivreJpa {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("recensement");
		//récupère la connexion de la bdd
		EntityManager em = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		Livre book = em.find(Livre.class, 3);  
		System.out.println(book);
		
		// afficher les tout emprunts en fonction d'un id
		Emprunt emp1 = em.find(Emprunt.class, 2);
		System.out.println(emp1);
	
		// affiche tout les emprunts d'un client
		Client cli = em.find(Client.class, 1);
		System.out.println(cli);
		
		
		for(Emprunt emp3 : book.getEmprunts()) {
			System.out.println(emp3);
		}
		
		Emprunt emp2 = em.find(Emprunt.class, 1);
		System.out.println(emp2);
		
		transaction.commit();
	}

}
