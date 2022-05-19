package pathparams

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces

//TODO check 2 url references
//  /root_path1/jaxrs_with_pathparams/{pathparam_field}/foo{path_test}
// /root_path1/jaxrs_with_pathparams/{pathparam_field}/{pathparam_method}
@Produces("application/atom+xml")
@Path("/jaxrs_with_pathparams_kt/{pathparam_field}")
class Paths_with_pathparams {
    @PathParam("pathparam_field")
    private val pathparam: String? = null
    @GET
    @Path("/{pathparam_method}")
    fun getFoo1(@PathParam("pathparam_method") pathparam_method: String?): String {
        return "test"
    }

    @GET
    @Path("/foo{path_test}")
    fun getFoo(@PathParam("path_test") path: String): String {
        return "Hello World$path"
    }
}
