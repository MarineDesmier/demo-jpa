package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "NOM", length = 150, nullable = false, unique = false)
	private String nom;

	@Column(name = "CODE_POSTAL", length = 5, nullable = false, unique = false)
	private int codePostal;

	@Temporal(value = TemporalType.DATE)
	@Column(name = "DATE_DERNIER_RECENSEMENT")
	private Date dernierRecensement;

	@Enumerated(EnumType.STRING)
	private Categorie categorie;

	/**
	 * @param nom
	 * @param codePostal
	 * @param dernierRecensement
	 * @param categorie
	 */
	public Ville(String nom, int codePostal, Date dernierRecensement, Categorie categorie) {
		super();
		this.nom = nom;
		this.codePostal = codePostal;
		this.dernierRecensement = dernierRecensement;
		this.categorie = categorie;
	}

	/**
	 * Constructeur Vide
	 */
	public Ville() {
		super();
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
	 * Getter pour l'attribut codePostal
	 * 
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter pour l'attribut codePostal
	 * 
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter pour l'attribut dernierRecensement
	 * 
	 * @return the dernierRecensement
	 */
	public Date getDernierRecensement() {
		return dernierRecensement;
	}

	/**
	 * Setter pour l'attribut dernierRecensement
	 * 
	 * @param dernierRecensement the dernierRecensement to set
	 */
	public void setDernierRecensement(Date dernierRecensement) {
		this.dernierRecensement = dernierRecensement;
	}

	/**
	 * Getter pour l'attribut categorie
	 * 
	 * @return the categorie
	 */
	public Categorie getCategorie() {
		return categorie;
	}

	/**
	 * Setter pour l'attribut categorie
	 * 
	 * @param categorie the categorie to set
	 */
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
