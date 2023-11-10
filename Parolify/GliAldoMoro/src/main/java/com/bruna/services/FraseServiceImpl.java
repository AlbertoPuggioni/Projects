package com.bruna.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.entities.Frase;
import com.bruna.entities.Testo;
import com.bruna.repo.FraseDAO;
import com.bruna.repo.TestoDAO;

@Service
public class FraseServiceImpl implements FraseService {
	
	@Autowired
	FraseDAO fdao;
	
	@Autowired
	TestoDAO tdao;
	
	
	@Override
	public void addFrase(Testo t) {
		String testo = t.getTxt();		
	}

	public List<Frase> getFrasiByTestoId(int id){
		List<Frase> frasi = tdao.getById(id).getFrase();
		return frasi;
	}
}
	

