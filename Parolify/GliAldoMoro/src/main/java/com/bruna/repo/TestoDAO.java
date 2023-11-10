/*
 * @file: TestoDAO.java
 * @about: Interfaccia che rappresenta il DAO della classe testo
 */

package com.bruna.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruna.entities.Testo;

public interface TestoDAO extends JpaRepository<Testo, Integer> {
	
}
