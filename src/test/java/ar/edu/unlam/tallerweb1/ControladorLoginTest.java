package ar.edu.unlam.tallerweb1;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.springframework.web.servlet.ModelAndView;
import org.mockito.*;

import ar.edu.unlam.tallerweb1.controladores.ControladorUsuario;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

import static org.assertj.core.api.Assertions.assertThat;

public class ControladorLoginTest {
	 
    @InjectMocks
    ControladorUsuario controladorUsuario = Mockito.spy(ControladorUsuario.class);
 
    @Mock
    ServicioLogin servicioLogin;
 
    Usuario usuario;
 
    @Before
    public void inicio(){
        usuario = new Usuario();
        usuario.setEmail("pepe@pepe.com");
        usuario.setPassword("123");
        MockitoAnnotations.initMocks(this);
    }
 
    @Test
    public void usuarioQueLogueaCorrectamente(){
    	Mockito.doReturn(usuario).when(servicioLogin).traerUsuarioPorEmail("pepe@pepe.com");
    	//ejecuto
     	ModelAndView mav = controladorUsuario.verificarLogin(usuario.getEmail(),usuario.getPassword());
        //compruebo que me lleva a la vista correcta, siempre lleva a Iniciar Sesion que es la de error
  	    assertThat(mav.getViewName()).isEqualTo("Inicio");
    }
 
}