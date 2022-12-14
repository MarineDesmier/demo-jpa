package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_REG")
	private Integer id;

	@Column(name = "NOM", length = 30, nullable = false)
	private String nom;

	@OneToMany(mappedBy = "region")
	private List<Ville> villes = new ArrayList<Ville>();

	/**
	 * Constructeur sans argument
	 */
	public Region() {

	}

	/**
	 * @param id
	 * @param nom
	 * @param villes
	 */
	public Region(Integer id, String nom, List<Ville> villes) {
		super();
		this.id = id;
		this.nom = nom;
		villes = new ArrayList<Ville>();
	}

	@Override
	public String toString() {
		return "Region [id = " + id + ", nom = " + nom + "]";
	}

	/**
	 * Getter pour l'attribut id
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * 
	 * @param id the id to set
	 */
	public void setId(Integer id) {
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
	 * Getter pour l'attribut villes 
	 * @return the villes
	 */
	public List<Ville> getVilles() {
		return villes;
	}

}
