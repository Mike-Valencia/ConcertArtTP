package ar.edu.unlam.tallerweb1.servicios;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Evento;
import ar.edu.unlam.tallerweb1.modelo.Reunion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ServicioReunion {

	public void crearReunionService(Reunion reunion);
	public List<Reunion> listReunionesService(Long idevento);
	public void agregarUsuarioAReunionService(Reunion reunion,Usuario usuario);
	public Reunion reunionporidService(Long idReunion);
	public void actualizarReunionService(Reunion reunion);
	public List<Reunion> listaDeReunionesEnPerfilService(Usuario usuarioLog);
	
	
	/*Mostrar Lista Reuniones en IndexAdmin*/
	public void crearReunionServicePerfil(Reunion reunion);
	public List<Reunion> listReunionesServicePerfil(Reunion reunion);

	public List<Reunion> listReunionesServicePerfil();
	
	//Unir usuario a reunion creada
	public void unirUsuarioAReunionService(Reunion reu,Usuario usu);
	public void salirReunionService(Reunion reu,Usuario usu);
	
	public List<Reunion> listaDeReunionesEnPerfilServiceEmail(String Email);
	public List<Reunion> busquedaReuniones(String data);
}
