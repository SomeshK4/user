package org.user.db.configuration;

import static org.user.db.configuration.DatabaseProperties.DATABASE_DIALECT;
import static org.user.db.configuration.DatabaseProperties.DATABASE_DRIVER;
import static org.user.db.configuration.DatabaseProperties.DATABASE_PASSWORD;
import static org.user.db.configuration.DatabaseProperties.DATABASE_URL;
import static org.user.db.configuration.DatabaseProperties.DATABASE_USERNAME;

import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.user.model.Players;
import org.user.model.Users;

/**
 * 
 * @author sk
 *
 */
public class DatabaseConfiguration {

	private static final SessionFactory sessionFactory;
	
	static {
			try{
				Properties settings = new Properties();
				settings.setProperty("hibernate.connection.driver_class", DATABASE_DRIVER);
				settings.setProperty("hibernate.connection.url", DATABASE_URL);
				settings.setProperty("hibernate.connection.username", DATABASE_USERNAME);
				settings.setProperty("hibernate.connection.password", DATABASE_PASSWORD);
				settings.setProperty("dialect", DATABASE_DIALECT);
				sessionFactory = new Configuration()
							.addProperties(settings)
							.addAnnotatedClass(Users.class)
							.addAnnotatedClass(Players.class)
							.buildSessionFactory();
			
			}catch(Exception ex){
				throw new ExceptionInInitializerError(ex);
			}
	}
	
	public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }
		
}
