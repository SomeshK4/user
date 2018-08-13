package org.user.rs;


import static org.junit.Assert.assertNotNull;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.http.HTTPException;

import org.junit.Before;
import org.junit.Test;
import org.user.dto.PlayerDTO;
import org.user.dto.UserDTO;

import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.AppDescriptor;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;

public class CheckIntegration extends JerseyTest{
	
	
	@Before
	public void setUp(){
	}
	
	@Override
	public AppDescriptor configure(){
		return new WebAppDescriptor.Builder("org.user.rs").build();
	}
	
	
	@Test
	public void testSaveUser() {
		UserDTO userDTO = new UserDTO();
		userDTO.setEmail("a@b.com");
		userDTO.setLanguage("Hindi");
		WebResource webResource = resource();
		ClientResponse response = webResource.path("/user/create")
			.type(MediaType.APPLICATION_JSON)
			.post(ClientResponse.class, userDTO);
		if(response.getStatus()!=200){
			throw new HTTPException(500);
		}
		Long userId = response.getEntity(Long.class);
		assertNotNull(userId);
	}
	
	
	@Test
	public void testSavePlayer() {
		WebResource webResource = null;
		ClientResponse response  = null;
		UserDTO userDTO = new UserDTO();
		userDTO.setEmail("sk@gmail.com");
		userDTO.setLanguage("English");
		webResource = resource();
		response = webResource.path("/user/create")
			.type(MediaType.APPLICATION_JSON)
			.post(ClientResponse.class, userDTO);
		if(response.getStatus()!=200){
			throw new HTTPException(500);
		}
		Long userId = response.getEntity(Long.class);
		PlayerDTO playerDTO = new PlayerDTO();
		playerDTO.setAge(20);
		playerDTO.setGender("Male");
		playerDTO.setName("somesh");
		playerDTO.setUserId(userId);
		webResource = resource();
	    response = webResource.path("/player/create")
			.type(MediaType.APPLICATION_JSON)
			.post(ClientResponse.class, playerDTO);
		if(response.getStatus()!=200){
			throw new HTTPException(500);
		}
		Long playerId = response.getEntity(Long.class);
		assertNotNull(playerId);
	}
	
	
	
	

}
