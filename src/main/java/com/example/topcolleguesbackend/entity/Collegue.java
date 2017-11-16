package com.example.topcolleguesbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collegue {

	/** id : int */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	/** nom : String */
	private String nom;
	/** urlImg : String */
	private String urlImg;
	/** score : int */
	private int score;

	/**
	 * Constructeur hibernate
	 */
	public Collegue() {
		super();
	}

	/**Constructeur
	 * @param nom
	 * @param urlImg
	 * @param score
	 */
	public Collegue(String nom, String urlImg, int score) {
		this.nom = nom;
		this.urlImg = urlImg;
		this.score = score;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the urlImg
	 */
	public String getUrlImg() {
		return urlImg;
	}

	/**
	 * @param urlImg
	 *            the urlImg to set
	 */
	public void setUrlImg(String urlImg) {
		this.urlImg = urlImg;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score
	 *            the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

}
