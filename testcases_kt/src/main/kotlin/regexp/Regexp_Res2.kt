package regexp

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.core.Response

@Path("/regexp2_kt/")
class Regexp_Res2 {
    @GET
    @Path("/test1/{pat_hp_---a-r-____---a-m}")
    fun test1(@PathParam("pat_hp_---a-r-____---a-m") pathParam: String?): Response {
        return Response.status(Response.Status.OK).build()
    }

    @GET
    @Path("test2/{some}-{code}-{progress}")
    fun test2(
        @PathParam("code") code: String?,
        @PathParam("some") some: String?,
        @PathParam("progress") progress: String?
    ): Response {
        return Response.status(Response.Status.OK).build()
    }

    @GET
    @Path("/test3/{some:[0-9]{8}}-{code}-{progress}")
    fun test3(
        @PathParam("code") code: String?,
        @PathParam("some") some: String?,
        @PathParam("progress") progress: String?
    ): Response {
        return Response.status(Response.Status.OK).build()
    }
}
