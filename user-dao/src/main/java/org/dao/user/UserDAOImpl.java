package org.dao.user;


import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.user.db.configuration.DatabaseConfiguration;
import org.user.model.Users;

/**
 * 
 * @author sk
 *
 */
public class UserDAOImpl implements UserDAO{

	@Override
	public Long save(Users user) {
		Session session = DatabaseConfiguration.getSession();
		Transaction transaction = session.beginTransaction();
		user.setCreatedDate(LocalDateTime.now());
		Long userId = (Long) session.save(user);
		transaction.commit();
		return userId;
	}

	
	
	

}
