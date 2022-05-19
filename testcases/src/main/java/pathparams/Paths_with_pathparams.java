package pathparams;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

//TODO check 2 url references
//  /root_path1/jaxrs_with_pathparams/{pathparam_field}/foo{path_test}
// /root_path1/jaxrs_with_pathparams/{pathparam_field}/{pathparam_method}

@Produces("application/atom+xml")
@Path("/jaxrs_with_pathparams/{pathparam_field}")
public class Paths_with_pathparams {
    @PathParam("pathparam_field")
    private String pathparam;

    @GET
    @Path("/{pathparam_method}")
    public String getFoo1(@PathParam("pathparam_method") String pathparam_method) {  return "test"; }

    @GET
    @Path("/foo{path_test}")
    public String getFoo(@PathParam("path_test") String path) {
        return "Hello World" + path;
    }
}
