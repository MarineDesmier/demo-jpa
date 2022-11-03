package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "villes")
public class Ville {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_VIL")
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

	@ManyToOne
	@JoinColumn(name = "ID_REGION")
	private Region region;

	@ManyToMany
	@JoinTable(name = "LIEN_VILLES_HABITANTS",
			joinColumns = @JoinColumn(name = "ID_VILLE", referencedColumnName = "ID_VIL"),
			inverseJoinColumns = @JoinColumn(name="ID_HABITANT", referencedColumnName = "ID_HAB"))
	private List<Habitant> habitants = new ArrayList<Habitant>();

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
	 * Getter pour l'attribut id 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
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

	/**
	 * Getter pour l'attribut region
	 * 
	 * @return the region
	 */
	public Region getRegion() {
		return region;
	}

	/**
	 * Setter pour l'attribut region
	 * 
	 * @param region the region to set
	 */
	public void setRegion(Region region) {
		this.region = region;
	}

	/**
	 * Getter pour l'attribut habitants 
	 * @return the habitants
	 */
	public List<Habitant> getHabitants() {
		return habitants;
	}

}
