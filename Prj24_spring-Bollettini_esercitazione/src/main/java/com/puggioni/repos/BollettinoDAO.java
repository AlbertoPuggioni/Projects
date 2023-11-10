package com.puggioni.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puggioni.entities.Bollettino;

public interface BollettinoDAO extends JpaRepository<Bollettino, String> {

}
