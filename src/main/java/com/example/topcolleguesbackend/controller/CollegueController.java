package com.example.topcolleguesbackend.controller;

import java.util.List;
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
@CrossOrigin(origins = "http://localhost:4200")
public class CollegueController {

	@Autowired
	CollegueRepository colRep;

	@GetMapping("")
	public List<Collegue> listerCollegue() {
		return this.colRep.findAll();
	}

	@PostMapping("")
	public Collegue ajouter(@RequestBody Collegue col) {
		Optional<Collegue> optCol = this.colRep.findAll().stream().filter(collegue -> collegue.getNom() == col.getNom())
				.findAny();
		if (!optCol.isPresent()) {
			this.colRep.save(col);
		}
		return this.colRep.findOne(col.getId());
	}

	@PutMapping("/{id}/score")
	public Collegue update(@RequestBody Collegue col, @PathVariable int id) {
		this.colRep.save(col);
		return this.colRep.findOne(id);
	}

}
