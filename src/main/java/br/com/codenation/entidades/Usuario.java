package br.com.codenation.entidades;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {

	private Long id;
	private String nome;
	private Integer idade;
	private Carro carro;
	private Usuario filho;


	public Optional<Carro> getCarro() {
		return Optional.ofNullable( carro );
	}

	public Optional<Usuario> getFilho() {
		return Optional.ofNullable( filho );
	}

}
