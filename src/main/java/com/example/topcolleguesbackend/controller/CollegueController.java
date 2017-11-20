package com.example.topcolleguesbackend.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.topcolleguesbackend.entity.Collegue;
import com.example.topcolleguesbackend.repository.CollegueRepository;

@RestController
@RequestMapping("/collegues")
@CrossOrigin(origins ="*")
public class CollegueController {

	/** colRep : CollegueRepository */
	@Autowired
	CollegueRepository colRep;

	/**
	 * Méthode get de listage des collegues
	 * 
	 * @return
	 */
	@GetMapping("")
	public List<Collegue> listerCollegue() {
		return this.colRep.findAll();
	}

	@GetMapping("/{id}/detail")
	public Collegue getBanqueCollaborateur(@PathVariable Integer id) {
		return this.colRep.findOne(id);
	}

	/**
	 * Méthode post d'ajout de collegue
	 * 
	 * @param col
	 * @return
	 */
	@PostMapping("")
	public Collegue ajouter(@RequestBody Collegue col) {
		Optional<Collegue> optCol = this.colRep.findAll().stream().filter(collegue -> collegue.getNom() == col.getNom())
				.findAny();
		if (!optCol.isPresent()) {
			this.colRep.save(col);
		}
		return this.colRep.findOne(col.getId());

	}

	/**
	 * Méthode put de modification du score
	 * 
	 * @param col
	 * @param id
	 * @return
	 */
	@PutMapping("/{id}/score")
	public Collegue update(@RequestBody Map<String, String> avis, @PathVariable int id) {
		Collegue oldCol = this.colRep.findOne(id);
		switch (avis.get("avis")) {
		case "aimer":
			oldCol.setScore(oldCol.getScore() + 10);
			break;
		case "detester":
			oldCol.setScore(oldCol.getScore() - 5);
			break;
		default:
		}
		this.colRep.save(oldCol);
		return this.colRep.findOne(id);
	}

}
