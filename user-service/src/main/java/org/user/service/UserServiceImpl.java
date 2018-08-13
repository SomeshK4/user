package org.user.service;

import org.dao.user.UserDAO;
import org.dao.user.UserDAOImpl;
import org.user.model.Users;

/**
 * 
 * @author sk
 *
 */
public class UserServiceImpl implements UserService{
	
	private UserDAO userDAO = new UserDAOImpl();

	@Override
	public Long createUser(Users user) {
		return userDAO.save(user);
	}


}
