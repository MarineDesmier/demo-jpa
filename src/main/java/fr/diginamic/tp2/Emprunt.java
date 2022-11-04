package fr.diginamic.tp2;

import java.util.ArrayList;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "emprunt")
public class Emprunt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "DATE_DEBUT")
	@Temporal(TemporalType.DATE)
	private Date date_debut;
	
	@Column(name = "DATE_FIN")
	@Temporal(TemporalType.DATE)
	private Date date_fin;
	
	@Column(name = "DELAI")
	private int delai;
	
	// un emprunt peut avoir plusieurs clients
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	@ManyToMany(mappedBy = "emprunts")
	private List<Livre> livres = new ArrayList<Livre>();
	

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

	/**
	 * Getter pour l'attribut client 
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Setter pour l'attribut client
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Getter pour l'attribut livres 
	 * @return the livres
	 */
	public List<Livre> getLivres() {
		return livres;
	}
	
}
