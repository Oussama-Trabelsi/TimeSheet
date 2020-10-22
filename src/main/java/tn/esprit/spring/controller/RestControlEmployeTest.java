package tn.esprit.spring.controller;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;

public class RestControlEmployeTest {
	
	RestControlEmploye myClass = new RestControlEmploye();
	private static final Logger l = Logger.getLogger(RestControlEmployeTest.class);
	// Sadok

	@Test
	public void testajouterEmploye() {
		Employe e = new Employe();
		
		e.setNom("Laouissi");
		e.setPrenom("Sadok");
		e.setActif(true);
		e.setEmail("Sadok.laouissi@esprit.tn");
		e.setRole(Role.ADMINISTRATEUR);
		l.info(e.getNom());
		assertEquals(e,myClass.ajouterEmploye(e));
	}
	@Test
	public void testmettreAjourEmailByEmployeId() {
		fail("Not yet implemented");
	}
	@Test
	public void testaffecterEmployeADepartement() {
		fail("Not yet implemented");
	}
	@Test
	public void testdesaffecterEmployeDuDepartement() {
		fail("Not yet implemented");
	}
	@Test
	public void testajouterContrat() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testaffecterContratAEmploye() {
		fail("Not yet implemented");
	}
	
	// end Sadok
	
		// Chantouf
	@Test
	public void testgetEmployePrenomById() {
		int employeId =1;
		assertNotNull(myClass.getEmployePrenomById(employeId));
		
	}
	@Test
	public void testdeleteEmployeById() {
		fail("Not yet implemented");
	}
	@Test
	public void testdeleteContratById() {
		fail("Not yet implemented");
	}
	@Test
	public void testgetNombreEmployeJPQL() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testgetAllEmployeNamesJPQL() {
		fail("Not yet implemented");
	}
	@Test
	public void testgetAllEmployeByEntreprise() {
		fail("Not yet implemented");
	}
	
	// end Chantouf
	
	// Kimo
	@Test
	public void testmettreAjourEmailByEmployeIdJPQL() {
		fail("Not yet implemented");
	}
	@Test
	public void testdeleteAllContratJPQL() {
		fail("Not yet implemented");
	}
	@Test
	public void testgetSalaireByEmployeIdJPQL() {
		fail("Not yet implemented");
	}
	@Test
	public void testgetSalaireMoyenByDepartementId() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testgetTimesheetsByMissionAndDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testgetAllEmployes() {
		fail("Not yet implemented");
	}
}
