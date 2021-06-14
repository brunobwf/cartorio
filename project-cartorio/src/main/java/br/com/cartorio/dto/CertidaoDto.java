package br.com.cartorio.dto;

import java.io.Serializable;

import br.com.cartorio.model.Certidao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertidaoDto implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private Long idCartorio;
	
	public CertidaoDto(Certidao certidao) {
		this.id = certidao.getId();
		this.nome = certidao.getNome();
		this.idCartorio = certidao.getCartorio().getId(); 
	} 
	
}
