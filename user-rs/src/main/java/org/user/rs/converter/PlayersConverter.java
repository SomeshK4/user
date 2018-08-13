package org.user.rs.converter;

import org.user.dto.PlayerDTO;
import org.user.model.Players;
import org.user.model.Users;

/**
 * 
 * @author sk
 *
 */
public final class PlayersConverter {
	
	private PlayersConverter(){
		
	}
	
	public static Players fromPlayersDTOToPlayers(PlayerDTO playerDTO){
		Players players = new Players();
		players.setAge(playerDTO.getAge());
		players.setGender(playerDTO.getGender());
		players.setName(playerDTO.getName());
		Users users = new Users();
		users.setUserId(playerDTO.getUserId());
		players.setUsers(users);
		return players;
		
	}

}
