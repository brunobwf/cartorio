package br.com.cartorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cartorio.model.Certidao;

@Repository
public interface CertidaoRepository extends JpaRepository<Certidao,Long> {

}
