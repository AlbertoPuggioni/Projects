/*
 * @file: ParolaDAO.java
 * @about: Interfaccia che rappresenta il DAO della classe parola
 */

package com.bruna.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bruna.entities.Parola;

public interface ParolaDAO extends JpaRepository<Parola, Integer> {

}
