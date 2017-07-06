package ar.edu.unlam.tallerweb1;
import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

import ar.edu.unlam.tallerweb1.modelo.Tambor;
import ar.edu.unlam.tallerweb1.modelo.Tragamonedas;

public class TestPruebasTambor {
	
	@Test
	public void girar(){
		Tambor tambor = new Tambor();
		
		tambor.girar();
		
		assertThat(tambor.getPosicion()).isBetween(1, 8);
	}
	
//	@Test
//	public void probarTragamonedas(){
//		
//		Tambor t1Fake = mock(Tambor.class);
//		
//		Tragamonedas tragamonedas = new Tragamonedas();
//		
//		tragamonedas.activar();
//		
//		assertThat(tragamonedas.entregaPremio()).isEqualTo(true);
//	}
}

