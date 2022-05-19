package inheritance.two;

import javax.ws.rs.*;

public interface ICRUD {

    @POST
    @Path("create")
    public String createREST(String transferObject);


    @DELETE
    @Path("delete/{id}")
    public String deleteREST(@PathParam("id") String id);
}
