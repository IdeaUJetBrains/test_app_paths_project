package root_paths;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

//TODO check with 2 root paths
@ApplicationPath("/root_path1")
public class RestApp1 extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> sets = new HashSet<Class<?>>();
//        sets.add();
        return sets;
    }
}
