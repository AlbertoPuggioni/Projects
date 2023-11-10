package com.bruna.services;

import java.util.List;
import com.bruna.entities.Testo;

public interface TestoService {
	void addTesto(Testo t);
	List<Testo> getTesti();
	String parolaPL(int id);
	Testo getTestoById(int id);
}
