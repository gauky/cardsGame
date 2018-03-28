package com.cpe.springboot.user.model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	/**
	 * Classe user défini par son id, son nom, son prénom, son mot de passe et sa liste de cartes
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String name;
	private String surname;
	private String password;
	private ArrayList<String> listcards ;

	public User() {
		this.name = "";
		this.surname = "";
		this.password = "";
	}
	
	public User( String name,String surname,String password) {
		this.surname = surname;
		this.name = name;
		this.password = password;
		}
/**
 * getteurs et setteurs pour les différents éléments
 * @return
 */
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;	
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;	
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
