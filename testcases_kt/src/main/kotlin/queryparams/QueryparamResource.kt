package queryparams

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.QueryParam

//TODO check in HTTP client completion for:   ?var1&var2
// http://localhost:8080/root_path1/queryparam/foo?var1&var2
// check OpenApi in Endpoints
@Path("queryparam_kt")
class QueryparamResource {
    @GET
    @Path("foo")
    fun foo(@QueryParam("var1") var1: String, @QueryParam("var2") var2: String): String {
        return "$var1, $var2"
    }
}
