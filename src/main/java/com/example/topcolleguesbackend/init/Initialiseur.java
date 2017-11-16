package com.example.topcolleguesbackend.init;

import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.topcolleguesbackend.entity.Collegue;
import com.example.topcolleguesbackend.repository.CollegueRepository;

@Service
public class Initialiseur {

	/** colRep : CollegueRepository */
	@Autowired
	private CollegueRepository colRep;

	/**
	 * Jeu de données de base
	 */
	public void init() {
		Stream.of(new Collegue("Flo", "https://avatars2.githubusercontent.com/u/32134408?s=460&v=4", 100),
				new Collegue("Ben",
						"https://scontent-cdt1-1.xx.fbcdn.net/v/t1.0-9/15032783_10210774365305652_7885740775892483196_n.jpg?oh=dc73dd058f80a4618debba6de416d356&oe=5A9C4661",
						1000),
				new Collegue("Jean-Hubert",
						"http://img.actionco.fr/Img/BREVE/2015/9/258695/Jean-Hubert-Bannwarth-directeur-commercial-April-Sante-Prevoyance-L.jpg",
						1),
				new Collegue("René Coty",
						"http://www.lefigaro.fr/medias/2014/09/05/PHO10dc65fe-34df-11e4-99ab-aca933a9442f-805x453.jpg",
						20))
				.forEach(col -> {
					this.colRep.save(col);
				});
	}
}
