package br.com.cartorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cartorio.model.Cartorio;

@Repository
public interface CartorioRepository extends JpaRepository<Cartorio,Long> {
		
}
