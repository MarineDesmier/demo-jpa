package fr.diginamic.tp2;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emprunt")
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "DATE_DEBUT")
	private Date date_debut;
	
	@Column(name = "DATE_FIN")
	private Date date_fin;
	
	@Column(name = "DELAI")
	private int delai;
	
	// un emprunt peut avoir plusieurs clients
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	@ManyToMany(mappedBy = "listEmprunt")
	private List<Client> clients;
	

	/**
	 * Constructeur vide
	 */
	public Emprunt() {
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
	 * Getter pour l'attribut date_debut 
	 * @return the date_debut
	 */
	public Date getDate_debut() {
		return date_debut;
	}

	/**
	 * Setter pour l'attribut date_debut
	 * @param date_debut the date_debut to set
	 */
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	/**
	 * Getter pour l'attribut date_fin 
	 * @return the date_fin
	 */
	public Date getDate_fin() {
		return date_fin;
	}

	/**
	 * Setter pour l'attribut date_fin
	 * @param date_fin the date_fin to set
	 */
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	/**
	 * Getter pour l'attribut delai 
	 * @return the delai
	 */
	public int getDelai() {
		return delai;
	}

	/**
	 * Setter pour l'attribut delai
	 * @param delai the delai to set
	 */
	public void setDelai(int delai) {
		this.delai = delai;
	}

	@Override
	public String toString() {
		return "Emprunt [id = " + id + ", date_debut = " + date_debut + ", date_fin = " 
				+ date_fin + ", delai = " + delai + ", client = " + client +"]";
	}
	
}
