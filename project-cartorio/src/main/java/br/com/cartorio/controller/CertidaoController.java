package br.com.cartorio.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cartorio.dto.CertidaoDto;
import br.com.cartorio.model.Certidao;
import br.com.cartorio.service.CertidaoService;

@RestController
@RequestMapping("/")
public class CertidaoController {

	@Autowired
	private CertidaoService certidaoService;

	@GetMapping
	public ResponseEntity<List<CertidaoDto>> buscarCertidoes() {
		List<Certidao> listaCertidoes = certidaoService.consultarCertidoes();
		List<CertidaoDto> listaCertidoesDto = listaCertidoes.stream().map(object -> new CertidaoDto(object))
				.collect(Collectors.toList());

		return ResponseEntity.ok(listaCertidoesDto);
	}

}
