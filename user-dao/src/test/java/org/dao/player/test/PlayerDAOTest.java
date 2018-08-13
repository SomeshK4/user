package org.dao.player.test;



import org.dao.player.PlayerDAO;
import org.dao.player.PlayerDAOImpl;
import org.dao.test.configuration.AbstractDAOTest;
import org.junit.Test;
import org.user.model.Players;
import org.user.model.Users;

/**
 * 
 * @author sk
 *
 */
public class PlayerDAOTest extends AbstractDAOTest {

	public PlayerDAOTest(String name) {
		super(name);
	}

	@Test
	public void testSavePlayer() {
		PlayerDAO playerDAO = new PlayerDAOImpl();
		Players player = new Players();
		player.setAge(30);
		player.setGender("Male");
		player.setName("Somesh");
		
		Users user1 = new Users();
		user1.setUserId(1l);
		player.setUsers(user1);
		assertNotNull(playerDAO.save(player));
	}

	
}
