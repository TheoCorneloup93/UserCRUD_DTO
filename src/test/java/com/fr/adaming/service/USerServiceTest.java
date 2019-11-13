package com.fr.adaming.service;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fr.adaming.entity.User;

@SpringBootTest
public class UserServiceTest {

	@Autowired
	private UserService service;
	
	@Test
	public void createValidUSer_shouldReturnUserNotNull() {
		
		//preparer input
		User u = new User();
		
		
		u.setNom("NomA");
		u.setEmail("adming@adaming.fr");
		u.setPwd("azerty");
		
		// invoquer la methode
		User returnedUser = service.save(u);
		
		//verifier le retour de la méthode
		assertNotNull(returnedUser);
		assertNotNull(returnedUser.getId());
		
	}
	
}
