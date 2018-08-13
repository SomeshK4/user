package org.user.service.test;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.dao.user.UserDAO;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.test.configuration.AbstractMockitoTest;
import org.user.model.Users;
import org.user.service.UserServiceImpl;

/**
 * 
 * @author sk
 *
 */
public class UserServiceTest extends AbstractMockitoTest{
	
	@Mock
	private UserDAO userDAO;
	
	@InjectMocks
	private UserServiceImpl userService;
	
	@Test
	public void testCreateUser(){
		when(userDAO.save(any(Users.class))).thenReturn(2l);
		Users user = new Users();
		user.setEmail("abc@gmail.com");
		Long id = userService.createUser(user);
		assertNotNull(id);
		
	}

}
