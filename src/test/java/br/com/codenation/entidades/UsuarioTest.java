package br.com.codenation.entidades;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void usuarioTest() {
		List<BigDecimal> listaDeBigdecimals = Arrays
				.asList( BigDecimal.valueOf( 50 ), BigDecimal.valueOf( 10 ), BigDecimal.valueOf( 60 ) );

		int i = listaDeBigdecimals.stream().mapToInt( (bigDecimal -> {
			return bigDecimal.intValue();
		}) ).max().orElse( 0 );
	}

	private void makeUsuario(Usuario abc) {

	}

	private Usuario abcd() {
		Usuario usuario = new Usuario();
		usuario.setNome( "bruno" );
		usuario.setIdade( 14 );
		return usuario;
	}

	private Usuario abc() {
		return Usuario.builder()
				.nome( "bruno" )
				.idade( 14 ).build();
	}

	private void mostraNoConsole(Usuario obj) {
		System.out.println( buscarFIlhoDoDonoDoCarro( obj ).orElse( "Não encontrado" ) );
	}

	private Optional<String> buscarFIlhoDoDonoDoCarro(Usuario bruno) {
		return Optional.ofNullable( bruno )
				.flatMap( usuario -> usuario.getCarro() )
				.flatMap( carro -> carro.getDono() )
				.flatMap( dono -> dono.getFilho() )
				.map( filho -> filho.getNome() );
	}

	private Usuario criarUsuario(String nomeDoFilho) {
		Usuario usuario = new Usuario();
		usuario.setIdade( 15 );
		usuario.setNome( "Bruno" );
		usuario.setCarro( criarCarro( nomeDoFilho ) );
		return usuario;
	}

	private Carro criarCarro(String nomeDoFilho) {
		Carro carro = new Carro();
		carro.setDono( criarDono( nomeDoFilho ) );
		return carro;
	}

	private Usuario criarDono(String nomeDoFilho) {
		Usuario dono = new Usuario();
		dono.setNome( "Ricardo" );
		dono.setFilho( criarFilho( nomeDoFilho ) );
		return dono;
	}

	private Usuario criarFilho(String nomeDoFilho) {
		Usuario filho = new Usuario();
		filho.setNome( nomeDoFilho );
		return filho;
	}

}
