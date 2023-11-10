package com.bruna.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bruna.entities.Testo;
import com.bruna.services.FraseService;
import com.bruna.services.TestoService;
import com.bruna.repo.FraseDAO;
import com.bruna.repo.ParolaDAO;
import com.bruna.repo.TestoDAO;

@Controller
public class ControllerMVC {

	@Autowired
	private TestoService service;
	@Autowired
	private FraseService fservice;
	@Autowired
	private TestoDAO dao;
	@Autowired
	private FraseDAO fdao;
	@Autowired
	private ParolaDAO pdao;
	
	@GetMapping({"/", "home", "index"})
	public String home() {
		return "index.html";
	}
	
	@GetMapping("testi")
	public String showTesti (Model m) {
		m.addAttribute("testi", dao.findAll());
		return "testi.html";
	}
	
	@GetMapping("testi/{id}")
	public String showTestiInteri (@PathVariable(value = "id") int id, Model m) {
		m.addAttribute("testi", service.getTestoById(id));
		m.addAttribute("frasi", fservice.getFrasiByTestoId(id));
		return "testi-id";
	}
	
	@PostMapping("/testi")
	public String addTesto(Testo t) {
		service.addTesto(t);
		return "redirect:/testi";
	}
}
