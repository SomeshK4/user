package org.user.rs;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.user.dto.UserDTO;
import org.user.rs.converter.UserConverter;
import org.user.service.UserService;
import org.user.service.UserServiceImpl;

/**
 * 
 * @author sk
 *
 */
@Path("/user")
public class UserRS {
	
	private UserService userService = new UserServiceImpl();

	@Path("/create")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveUser(UserDTO userDTO){
		return Response.status(200)
				.entity(userService.createUser(UserConverter.fromUsersDTOToUsers(userDTO)))
				.build();
	}
}
