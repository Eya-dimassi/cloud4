package com.eya.pays.repos;

import com.eya.pays.entities.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays, Long> {

          Pays findByNomPays(String nomPays);

             Long id(Long id);
}
