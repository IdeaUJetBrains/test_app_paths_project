package root_paths

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

//TODO check with 2 root paths
@ApplicationPath("/root_path1_kt")
class RestApp1 : Application() {
    override fun getClasses(): Set<Class<*>> {
        //        sets.add();
        return HashSet()
    }
}
