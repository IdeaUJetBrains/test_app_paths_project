package recursive;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
@Path("recursive")
public class RecurciveRes {

    @GET
    public String getText() { return "foo"; }

    @Path("some_path")
    public RecurciveRes getSubResource() {
        return new RecurciveRes();
    }
}
