package fr.diginamic;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "habitants")
public class Habitant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_HAB")
	private int id;

	@Column(name = "NOM", length = 150, nullable = false, unique = false)
	private String nom;

	@Column(name = "PRENOM", length = 150, nullable = false, unique = false)
	private String prenom;

	@ManyToMany(mappedBy = "habitants")
	private List<Ville> villes;

	public Habitant() {

	}

	/**
	 * Getter pour l'attribut id
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour l'attribut nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter pour l'attribut prenom
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter pour l'attribut prenom
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter pour l'attribut villes
	 * 
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

}
