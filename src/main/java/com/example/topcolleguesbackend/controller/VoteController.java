package com.example.topcolleguesbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.topcolleguesbackend.entity.Vote;
import com.example.topcolleguesbackend.repository.VoteRepository;

@RestController
@RequestMapping("/votes")
@CrossOrigin(origins = "*")
public class VoteController {

	@Autowired
	private VoteRepository voteRep;

	@GetMapping("")
	public List<Vote> getLastThree(@RequestParam("since") Optional<Integer> id) {
		if (id.isPresent()) {
			return this.voteRep.findSinceId(id.get());
		}
		List<Vote> listVotes = this.voteRep.findAll();
		if (listVotes.size() > 3) {
			listVotes = listVotes.subList(listVotes.size() - 3, listVotes.size());
		}
		return listVotes;
	}

}
