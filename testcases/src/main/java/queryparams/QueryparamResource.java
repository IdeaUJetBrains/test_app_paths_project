package queryparams;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

//TODO check in HTTP client completion for:   ?var1&var2
// http://localhost:8080/root_path1/queryparam/foo?var1&var2
// check OpenApi in Endpoints
@Path("queryparam")
public class QueryparamResource {
    @GET
    @Path("foo")
    public String foo(@QueryParam("var1") String var1, @QueryParam("var2") String var2 ) {  return var1 + ", " + var2;   }
}
