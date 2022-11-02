package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regions")
public class Region {

	@Id
	private Integer id;
	
	@Column(name="NOM", length = 30, nullable =false)
	private String nom;
	
	/**
	 * Constructeur sans argument
	 */
	public Region() {
	
	}

	/**
	 * Getter pour l'attribut id 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Region [id = " + id + ", nom = " + nom + "]";
	}

	/**
	 * Setter pour l'attribut id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter pour l'attribut nom 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
