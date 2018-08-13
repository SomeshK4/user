package org.user.db.configuration;

/**
 * 
 * @author sk
 *
 */
public interface DatabaseProperties {
	String DATABASE_DRIVER = "org.mariadb.jdbc.Driver";
	String DATABASE_URL = "jdbc:mariadb://localhost:3306/user";
	String DATABASE_USERNAME = "root";
	String DATABASE_PASSWORD = "root";
	String DATABASE_DIALECT = "org.hibernate.dialect.MariaDBDialect";

}
