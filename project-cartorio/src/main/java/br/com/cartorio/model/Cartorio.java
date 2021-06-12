package br.com.cartorio.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_cartorio")
public class Cartorio {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String endereco;
	
	@OneToMany(mappedBy = "cartorio", cascade = CascadeType.ALL, orphanRemoval = true)
	@JsonIgnoreProperties("cartorio")
	private List<Certidao> certidoes;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
