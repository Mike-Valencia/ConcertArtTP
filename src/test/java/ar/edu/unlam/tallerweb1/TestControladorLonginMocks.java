package ar.edu.unlam.tallerweb1;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.web.servlet.ModelAndView;
import static org.mockito.Mockito.*;//agregar import 

import ar.edu.unlam.tallerweb1.controladores.*;
import ar.edu.unlam.tallerweb1.modelo.Usuario;
import ar.edu.unlam.tallerweb1.servicios.ServicioLogin;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;


public class TestControladorLonginMocks {
	private ControladorUsuario controladorUsuarioMock = new ControladorUsuario();
	private Usuario usuarioMock;
	private HttpServletRequest requestMock;
	private HttpSession sessionMock;
	private ServicioLogin servicioLoginMock;
	
	@Before
	public void init(){
		usuarioMock = mock(Usuario.class);
		requestMock = mock (HttpServletRequest.class);
		sessionMock = mock (HttpSession.class);
		servicioLoginMock = mock(ServicioLogin.class);
		controladorUsuarioMock.setServicioLogin(servicioLoginMock);
		}
	
	@Test
	 public void whenCreateSpy_thenCreate() {
	     List spyList = Mockito.spy(new ArrayList());
	     spyList.add("one");
	     Mockito.verify(spyList).add("one");

	     assertEquals(1, spyList.size());
	 }
		
//	 @Test
//	 public void UsuarioQueLogueaCorrectamente() throws Exception {
//		 when(servicioLoginMock.consultarUsuario(usuarioMock)).thenReturn(usuarioMock);
//	  when(requestMock.getSession()).thenReturn(sessionMock);
//	  
//	  //ejecuto
//	  ModelAndView mav = controladorUsuarioMock.verificarLogin(usuarioMock.getEmail(),usuarioMock.getPassword());
//	  //compruebo que me lleva a la vista correcta, siempre lleva a Iniciar Sesion que es la de error
//	  assertThat(mav.getViewName()).isEqualTo("Inicio");
//	 }
 
	 


}