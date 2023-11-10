/*
 * @file: FraseDAO.java
 * @about: Interfaccia che rappresenta il DAO della classe frase
 */

package com.bruna.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bruna.entities.Frase;

public interface FraseDAO extends JpaRepository<Frase, Integer> {

}
