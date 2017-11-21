package com.example.topcolleguesbackend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Vote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	private Collegue collegue;
	private boolean aimer;

	/**
	 * Constructeur hibernate
	 */
	public Vote() {
		// TODO Auto-generated constructor stub
	}

	public Vote(Collegue col, boolean avis) {
		this.collegue = col;
		this.aimer = avis;
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
	 * @return the collegue
	 */
	public Collegue getCollegue() {
		return collegue;
	}

	/**
	 * @param collegue
	 *            the collegue to set
	 */
	public void setCollegue(Collegue collegue) {
		this.collegue = collegue;
	}

	/**
	 * @return the aimer
	 */
	public boolean isAimer() {
		return aimer;
	}

	/**
	 * @param aimer the aimer to set
	 */
	public void setAimer(boolean aimer) {
		this.aimer = aimer;
	}

	/**
	 * @return the avis
	 */



}
