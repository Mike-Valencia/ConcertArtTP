package ar.edu.unlam.tallerweb1.dao;

import java.util.List;

import ar.edu.unlam.tallerweb1.modelo.Evento;
import ar.edu.unlam.tallerweb1.modelo.Reunion;
import ar.edu.unlam.tallerweb1.modelo.Usuario;

public interface ReunionDao {
	
	public void crearReunionDAO(Reunion reunion);
	public List<Reunion> listReunionesDAO(Long idevento);
	public void agregarUsuarioAReunionDAO(Reunion reunion,Usuario usuario);
	public Reunion datosReunionDAO(Long idReunion);
	public void actualizarReunionDao(Reunion reunion);
	public List<Reunion> listaDeReunionesEnPerfilDao(Usuario usuarioLog);
	
	/*Muestro reuniones en IndexAdmin (Reuniones) */
	public List<Reunion> listReunionesDAOenPerfil(Long idevento);
	public Reunion reunionporid(Long idevento);
	public List<Usuario> listUsuariosPorReunionDAO(Long idReunion);
	//Usuario uniendose a reunion ya creada
	public void unirUsuarioAReunionDAO(Reunion reu,Usuario usu);
	public void salirDeReunionDao(Usuario usuario, Reunion reunion);
	public List<Reunion> busquedaReunionesDao(String data);
	public List<Reunion> listaDeReunionesEnPerfilDaoEmail(String email);
}