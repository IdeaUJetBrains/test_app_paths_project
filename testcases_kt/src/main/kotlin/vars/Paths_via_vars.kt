package vars

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces

@Produces("application/json")
@Path("jaxrs_class_path_vars_kt")
class Paths_via_vars {
    @GET
    @Path(PATH_SECTION_VAR1 + "var2")
    fun get2(): String {
        return "test"
    }

    companion object {
        private const val PATH_SECTION_VAR1 = "var1"
    }
}
