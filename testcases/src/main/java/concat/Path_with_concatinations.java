package concat;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("jaxrs_class_path_with_concat")
public class Path_with_concatinations {

    @GET
    @Path("/c1" + "/c2")
    public String get1() {  return "test";   }


}
