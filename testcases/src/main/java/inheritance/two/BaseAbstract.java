package inheritance.two;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public abstract class BaseAbstract implements ICRUD {

    @Override
    public String createREST(String transferObject) {
        return create(transferObject);
    }



    @Override
    @DELETE
    @Path("delete1/{id1}")
    public String deleteREST( @PathParam("id1") String id) {
        return delete(id);
    }





    private String delete(String id) {
        return id;
    }
    private String create(String transferObject) {
        return transferObject;
    }


}

