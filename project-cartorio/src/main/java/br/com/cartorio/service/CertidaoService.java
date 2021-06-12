package br.com.cartorio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.cartorio.model.Certidao;
import br.com.cartorio.repository.CertidaoRepository;


@Service
public class CertidaoService {

	@Autowired
	private CertidaoRepository certidaoRepository;
	
	public List<Certidao> consultarCertidoes() {
		return this.certidaoRepository.findAll();
	}
	
}
