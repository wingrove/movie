package movie;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class MovieApplication extends Application {
	private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> empty = new HashSet<Class<?>>();

    public MovieApplication() {
        singletons.add(new MovieResource());
    }

    @Override
    public Set<Class<?>> getClasses() {
        return empty;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
