package fr.diginamic.tp2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "PRENOM")
	private String prenom;
	
	// un client peut avoir plusieurs emprunts de livre
	@ManyToMany
	@JoinTable(name = "compo",
		joinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"),
		inverseJoinColumns = @JoinColumn(name="ID_EMP", referencedColumnName = "ID"))
	private List<Emprunt> listEmprunt = new ArrayList<Emprunt>();

	// un client peut avoir plusieurs emprunt
	@OneToMany(mappedBy = "client")
	private List<Emprunt> emprunts = new ArrayList<Emprunt>();
	
	/**
	 * Constructeur sans valeur
	 */
	public Client() {
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

	/**
	 * Getter pour l'attribut prenom 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter pour l'attribut prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client [id = " + id + ", nom = " + nom + ", prenom = " + prenom + "]";
	}
	
	
}
