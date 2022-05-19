package duplicates;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
// TODO check thqat by completion it doesn't suggest "duplicates" two times  in clients/HTTP requests
@Path("duplicates")
public class Res_duplicate1 {

    @GET
    public String foo() { return "foo"; }

    @GET
    @Path("bar")
    public String bar() {
        return "bar";
    }
}
