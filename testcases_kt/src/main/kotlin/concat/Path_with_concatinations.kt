package concat

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("jaxrs_class_path_with_concat_kt")
class Path_with_concatinations {
    @GET
    @Path("/c1" + "/c2")
    fun get1(): String {
        return "test"
    }
}
