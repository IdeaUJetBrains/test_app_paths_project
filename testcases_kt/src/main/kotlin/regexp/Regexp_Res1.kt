package regexp

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.Response

@Path("/regexp1_kt/a/{month:\\d{4}-\\d{2}}/b")
class Regexp_Res1 {
    @GET
    fun test(): Response {
        return Response.status(Response.Status.OK).build()
    }
}
