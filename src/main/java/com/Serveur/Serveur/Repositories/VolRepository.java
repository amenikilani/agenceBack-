package com.Serveur.Serveur.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.Serveur.Serveur.Entities.Ville;
import com.Serveur.Serveur.Entities.Vol;


@RepositoryRestResource
public interface VolRepository extends JpaRepository<Vol, Long> {
	  Optional<Vol> findById(Long id);
	  void deleteById(Long id);
}
