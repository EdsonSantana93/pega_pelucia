package br.com.pegapelucia.peluciabrmachine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pegapelucia.peluciabrmachine.dao.JogadaInclusaoDao;
import br.com.pegapelucia.peluciabrmachine.entities.Jogada;
import br.com.pegapelucia.peluciabrmachine.service.JogadaService;

@RestController
@RequestMapping("/api/jogada")
public class JogadaController {

	@Autowired
	private JogadaService service;

	@PostMapping()
	public ResponseEntity<Jogada> salvar(@RequestBody JogadaInclusaoDao jogada) {
		if (jogada == null) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(service.salvar(jogada));
		}
	}

}
