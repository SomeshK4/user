package org.user.rs;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.player.service.PlayerService;
import org.player.service.PlayerServiceImpl;
import org.user.dto.PlayerDTO;
import org.user.rs.converter.PlayersConverter;

/**
 * 
 * @author sk
 *
 */
@Path("/player")
public class PlayerRS {
	
	private PlayerService playerService = new PlayerServiceImpl();
	
	@Path("/create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response savePlayer(PlayerDTO playerDTO){
		return Response.status(200)
				.entity(playerService.createPlayer(PlayersConverter.fromPlayersDTOToPlayers(playerDTO)))
				.build();
	}

}
