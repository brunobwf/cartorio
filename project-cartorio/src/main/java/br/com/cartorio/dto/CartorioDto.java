package br.com.cartorio.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.cartorio.model.Cartorio;
import br.com.cartorio.model.Certidao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartorioDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nome;
	private String endereco;
	private List<CertidaoDto> certidoes;

	public CartorioDto(Cartorio cartorio) {
		this.id = cartorio.getId();
		this.nome = cartorio.getNome();
		this.endereco = cartorio.getEndereco();
		this.certidoes = converterParaListaDto(cartorio.getCertidoes());
	}

	public List<CertidaoDto> converterParaListaDto(List<Certidao> listaCertidoes) {
		List<CertidaoDto> listaCertidoesDto = new ArrayList<CertidaoDto>();
		for (Certidao certidao : listaCertidoes) {
			CertidaoDto certidaoDto = new CertidaoDto(certidao);
			listaCertidoesDto.add(certidaoDto);
		}
		return listaCertidoesDto;
	}

}
