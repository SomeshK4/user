package org.user.rs.converter;



import org.user.dto.UserDTO;
import org.user.model.Users;

/**
 * 
 * @author sk
 *
 */
public final class UserConverter {
	
	private UserConverter(){
		
	}
	
	public static Users fromUsersDTOToUsers(UserDTO userDTO) {
		Users user = new Users();
		user.setEmail(userDTO.getEmail());
		user.setLanguage(userDTO.getLanguage());
		user.setPassword(userDTO.getPassword());
		user.setAdditionalInfo(userDTO.getAdditionalInfo());
		return user;
	}
	
	

}
