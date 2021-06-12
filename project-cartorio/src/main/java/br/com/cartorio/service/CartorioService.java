package br.com.cartorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.cartorio.model.Cartorio;
import br.com.cartorio.repository.CartorioRepository;

@Service
public class CartorioService {

	@Autowired
	private CartorioRepository cartorioRepository;

	public List<Cartorio> consultarCartorios() {
		return this.cartorioRepository.findAll();
	}
}
