package br.com.pegapelucia.peluciabrmachine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pegapelucia.peluciabrmachine.dto.JogadaDTO;
import br.com.pegapelucia.peluciabrmachine.dto.JogadaInclusaoDTO;
import br.com.pegapelucia.peluciabrmachine.service.JogadaService;

@RestController
@RequestMapping("/api/jogada")
public class JogadaController {

	@Autowired
	private JogadaService service;

	@PostMapping()
	public ResponseEntity<JogadaDTO> salvar(@RequestBody JogadaInclusaoDTO jogada) {
		if (jogada == null) {
			return ResponseEntity.badRequest().build();
		} else {
			return ResponseEntity.ok(service.salvar(jogada));
		}
	}

}
