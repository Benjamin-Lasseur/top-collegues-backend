package com.example.topcolleguesbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.topcolleguesbackend.entity.Collegue;

/**Repository de l'entity Collegue
 * @author ETY5
 *
 */
public interface CollegueRepository extends JpaRepository<Collegue, Integer> {

}
