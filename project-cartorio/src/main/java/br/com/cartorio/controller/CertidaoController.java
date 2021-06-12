package br.com.cartorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cartorio.model.Certidao;
import br.com.cartorio.service.CertidaoService;

@RestController
@RequestMapping("/certidao")
public class CertidaoController {	
	
	@Autowired
	private CertidaoService certidaoService;
	
	@GetMapping
	public ResponseEntity<List<Certidao>> buscarCertidoes(){
		List<Certidao> listaCertidoes = certidaoService.consultarCertidoes();
		return ResponseEntity.ok(listaCertidoes);
	}
}
