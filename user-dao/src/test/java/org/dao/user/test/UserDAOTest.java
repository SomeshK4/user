package org.dao.user.test;



import org.dao.test.configuration.AbstractDAOTest;
import org.dao.user.UserDAO;
import org.dao.user.UserDAOImpl;
import org.junit.Test;
import org.user.model.Users;

/**
 * 
 * @author sk
 *
 */
public class UserDAOTest extends AbstractDAOTest {

	public UserDAOTest(String name) {
		super(name);
	}

	@Test
	public void testSaveUser() {
		UserDAO userDAO = new UserDAOImpl();
		Users user = new Users();
		user.setEmail("sk@gmail.com");
		user.setLanguage("english");
		assertNotNull(userDAO.save(user));
	}

	
}
