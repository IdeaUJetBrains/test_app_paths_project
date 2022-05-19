package recursive.inheritance_and_recursive;

import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface ICRUD {

    @POST
    @Path("create")
    public String createREST(String transferObject);


    @DELETE
    @Path("delete/{id}")
    public String deleteREST(@PathParam("id") String id);
}
