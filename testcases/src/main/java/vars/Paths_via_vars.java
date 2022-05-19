package vars;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Produces("application/json")
@Path("jaxrs_class_path_vars")
public class Paths_via_vars {

    private static final String PATH_SECTION_VAR1 = "var1";

    @GET
    @Path(PATH_SECTION_VAR1 + "var2")
    public String get2() {  return "test";   }

}
