package duplicates

import javax.ws.rs.GET
import javax.ws.rs.Path

// TODO check thqat by completion it doesn't suggest "duplicates" two times  in clients/HTTP requests
@Path("duplicates_kt")
class Res_duplicate1 {
    @GET
    fun foo(): String {
        return "foo"
    }

    @GET
    @Path("bar")
    fun bar(): String {
        return "bar"
    }
}
