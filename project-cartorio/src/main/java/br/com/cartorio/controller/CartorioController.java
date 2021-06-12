package br.com.cartorio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cartorio.model.Cartorio;
import br.com.cartorio.service.CartorioService;

@RestController
@RequestMapping("/cartorio")
public class CartorioController {

	@Autowired
	private CartorioService cartorioService;
	
	@GetMapping
	public ResponseEntity<List<Cartorio>> buscarCartorios(){
	List<Cartorio> listCartorios = cartorioService.consultarCartorios();
		return ResponseEntity.ok(listCartorios);
	}		
}
