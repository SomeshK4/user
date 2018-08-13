package org.player.service;

import org.dao.player.PlayerDAO;
import org.dao.player.PlayerDAOImpl;
import org.user.model.Players;

public class PlayerServiceImpl implements PlayerService{
	
	private PlayerDAO playerDAO = new PlayerDAOImpl();

	@Override
	public Long createPlayer(Players players) {
		return playerDAO.save(players);
	}

}
