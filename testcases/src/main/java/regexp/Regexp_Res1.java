package regexp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/regexp1/a/{month:\\d{4}-\\d{2}}/b")
public class Regexp_Res1 {

    @GET
    public Response test() {
        return Response.status(Response.Status.OK).build();
    }

}
