package org.player.service.test;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.dao.player.PlayerDAO;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.player.service.PlayerServiceImpl;
import org.test.configuration.AbstractMockitoTest;
import org.user.model.Players;

/**
 * 
 * @author sk
 *
 */
public class PlayerServiceTest extends AbstractMockitoTest{
	
	@Mock
	private PlayerDAO playerDAO;
	
	@InjectMocks
	private PlayerServiceImpl playerService;
	
	@Test
	public void testCreateUser(){
		when(playerDAO.save(any(Players.class))).thenReturn(5l);
		Players players = new Players();
		players.setAge(30);
		Long id = playerService.createPlayer(players);
		assertNotNull(id);
		
	}

}
