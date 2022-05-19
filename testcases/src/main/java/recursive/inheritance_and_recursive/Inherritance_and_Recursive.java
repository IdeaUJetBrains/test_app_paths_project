package recursive.inheritance_and_recursive;

import javax.ws.rs.Path;

// TODO check 2 url references (enter inheritance1 in the Endpoints view):
// root_path/inheritance/create
// root_path/inheritance/delete/{id}
@Path("inheritance_recursive")
public class Inherritance_and_Recursive extends BaseAbstract {

    @Path("some_path")
    public Inherritance_and_Recursive getSubResource() {
        return new Inherritance_and_Recursive();
    }
}
