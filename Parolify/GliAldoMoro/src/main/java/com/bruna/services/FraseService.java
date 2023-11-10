package com.bruna.services;

import java.util.List;

import com.bruna.entities.Frase;
import com.bruna.entities.Testo;

public interface FraseService {

	void addFrase(Testo t);
	List<Frase> getFrasiByTestoId(int id);
}
