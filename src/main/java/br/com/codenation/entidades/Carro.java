package br.com.codenation.entidades;

import java.util.Optional;

public class Carro {

	public Usuario dono;

	public Optional<Usuario> getDono() {
		return Optional.ofNullable( dono );
	}

	public void setDono(Usuario dono) {
		this.dono = dono;
	}
}
