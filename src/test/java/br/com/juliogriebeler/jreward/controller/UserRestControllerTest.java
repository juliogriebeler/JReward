package br.com.juliogriebeler.jreward.controller;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.com.juliogriebeler.jreward.model.User;

public class UserRestControllerTest {

	private UserRestController userRestController;
	@Before
	public void setUp() throws Exception {
		userRestController = new UserRestController();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCreateUser() {
		User user = new User();
		user.setFisrtName("Nome");
		userRestController.createUser(user);
	}

	@Test
	public void testReadUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testReadUsers() {
		fail("Not yet implemented");
	}

	@Test
	public void testUpdateUser() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteUser() {
		fail("Not yet implemented");
	}

}
