package com.example.topcolleguesbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Collegue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String urlImg;
	private int score;

	public Collegue() {
		super();
	}

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
