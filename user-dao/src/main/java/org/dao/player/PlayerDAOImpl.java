package org.dao.player;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.user.db.configuration.DatabaseConfiguration;
import org.user.model.Players;

/**
 * 
 * @author sk
 *
 */
public class PlayerDAOImpl implements PlayerDAO{

	@Override
	public Long save(Players players) {
		Session session = DatabaseConfiguration.getSession();
		Transaction transaction = session.beginTransaction();
		Long playerId = (Long) session.save(players);
		transaction.commit();
		return playerId;
	}

}
