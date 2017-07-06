package ar.edu.unlam.tallerweb1;


import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unlam.tallerweb1.dao.ClienteDao;
import ar.edu.unlam.tallerweb1.modelo.CBU;
import ar.edu.unlam.tallerweb1.modelo.Cliente;

public class TestPersistenciaCliente extends SpringTest{
	@Inject
	ClienteDao dao;
	
	@Test
	@Transactional
	@Rollback(true)
	public void pruebaInsertarCliente(){
	
		Cliente mike = new Cliente();
		mike.setNombre("Mike");
		mike.setApellido("Valencia");
		mike.setDni("94218836");	
		
		dao.guardar(mike);
		
		Cliente x = getSession().get(Cliente.class, mike.getId());	
		
		Assert.assertNotNull(x);
		
	}
	
	
	@Test
	@Transactional
	@Rollback(false)
	public void pruebaClienteConCBU(){
	
		Cliente mike = new Cliente();
		mike.setNombre("Mike");
		mike.setApellido("Valencia");
		mike.setDni("94218836");	
		
		CBU micbu = new CBU();
		
		mike.setCbu(micbu);
		
		
		dao.guardar(mike);
		
		Cliente x = getSession().get(Cliente.class, mike.getId());	
		
		Assert.assertNotNull(x);
		
	}
}
