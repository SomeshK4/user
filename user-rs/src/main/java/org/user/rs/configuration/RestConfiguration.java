package org.user.rs.configuration;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.user.rs.PlayerRS;
import org.user.rs.UserRS;
/**
 * 
 * @author sk
 *
 */
@ApplicationPath("/rest")
public class RestConfiguration extends Application{
	
	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> set = new HashSet<Class<?>>();
		set.add(UserRS.class);
		set.add(PlayerRS.class);
		return set;
	}

}
