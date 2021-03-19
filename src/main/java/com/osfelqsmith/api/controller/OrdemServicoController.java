package com.osfelqsmith.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.osfelqsmith.domain.model.OrdemServico;
import com.osfelqsmith.domain.service.OrdemServicoService;

@RestController
@RequestMapping("/ordem-servico")
public class OrdemServicoController {
	
	@Autowired
	private OrdemServicoService ordemServicoService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public OrdemServico adicionar (@RequestBody OrdemServico ordemServico) {
		return ordemServicoService.criar(ordemServico);
	}
	
}
