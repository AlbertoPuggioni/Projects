package com.bruna.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruna.entities.Frase;
import com.bruna.entities.Parola;
import com.bruna.entities.Testo;
import com.bruna.repo.FraseDAO;
import com.bruna.repo.ParolaDAO;
import com.bruna.repo.TestoDAO;

@Service
public class TestoServiceImpl implements TestoService {
	@Autowired
	private TestoDAO tdao;
	@Autowired
	private FraseDAO fdao;
	@Autowired
	private ParolaDAO pdao;
	
	public Testo getTestoById(int id) {
		return tdao.findById(id).get();
	}
	
	@Override
	public void addTesto(Testo t) {
		

		String t3 = t.getTxt();
		String[] paroles = t3.split("\\s+");
		Map<String, Integer> conteggioParole = new HashMap<>();
		String parolaPiuLungaPerFrase;
		for (String parolas : paroles) {
			if(parolas.length() <= 3) {
				
			}
			
			else {
		conteggioParole.put(parolas, conteggioParole.getOrDefault(parolas, 0) + 1);
		
		
		
		Map.Entry<String, Integer> parolaPiuUsata = Collections.max(conteggioParole.entrySet(), Map.Entry.comparingByValue());
		t.setParolaPiuUsata(parolaPiuUsata.getKey());
			}
		}
		
		String parolaPiuUsataPerFrase = null;
		String testo = t.getTxt();
		String testo2 = t.getTxt();
		t.setNumerCaratteri(testo.length());
		String parolaPiuLunga = "";
	  	String frasePiuLunga = "";
		String[] sentences = testo.split("(\\.\\s)");
		String[] parole = testo2.split("(\\s)");
		for (String frase : sentences) {
			if(frase.length() > frasePiuLunga.length()) {
				frasePiuLunga = frase;
			}
		}
		for (String par : parole) {
			if(par.length() > parolaPiuLunga.length()) {
				parolaPiuLunga = par;
			}
		}
		t.setParolaPiuLunga(parolaPiuLunga);
		t.setFrasePiuLunga(frasePiuLunga);
		tdao.save(t);
		testo.trim();
		t.setNumeroFrasi(sentences.length);
		t.setNumeroParole(parole.length);
		System.out.println(sentences[0]);
		  for (String frase : sentences) {
			  	parolaPiuUsataPerFrase = "";
			  	parolaPiuLungaPerFrase = "";
			  	Frase f = new Frase();
			  	
	            f.setContenuto(frase);
	            f.setTesto(t);
	            
	    		String frases[] = frase.split("\\s");
	    		Map<String, Integer> conteggioParoleFrase = new HashMap<>();
	    		for(String paro : frases) {
	    			if(paro.length() > parolaPiuLungaPerFrase.length()) {
	    				parolaPiuLungaPerFrase = paro;
	    			}
	    				if(paro.length() <= 3) {
	    					
	    				}
	    				
	    				else {
	    				conteggioParoleFrase.put(paro, conteggioParoleFrase.getOrDefault(paro, 0) + 1);
	    				
	    				
	    				
	    				Map.Entry<String, Integer> parolee = Collections.max(conteggioParoleFrase.entrySet(), Map.Entry.comparingByValue());
	    				parolaPiuUsataPerFrase = parolee.getKey();
	    				f.setParolaPiuUsataPerFrase(parolaPiuUsataPerFrase);
	    				
	    				}
	    		}
	    		
	    		
	            f.setParolaPiuLungaPerFrase(parolaPiuLungaPerFrase);
	            fdao.save(f);
		  }
		  
		  for (String parola : parole) {
	            Parola p = new Parola();
	            p.setContenuto(parola);
	            p.setTesto(t);
	            pdao.save(p);
	        }
	}

	@Override
	public List<Testo> getTesti() {
		return tdao.findAll();
	}
 

	@Override
	public String parolaPL(int id) {

		return null;
	}

	
	

}
