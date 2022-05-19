package regexp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/regexp2/")
public class Regexp_Res2 {


    @GET
    @Path("/test1/{pat_hp_---a-r-____---a-m}")
    public Response test1(@PathParam("pat_hp_---a-r-____---a-m") String pathParam) {
        return Response.status(Response.Status.OK).build();
    }


    @GET
    @Path("test2/{some}-{code}-{progress}")
    public Response test2(@PathParam("code") String code,  @PathParam("some") String some, @PathParam("progress")  String progress) {
        return Response.status(Response.Status.OK).build();
    }

    @GET
    @Path("/test3/{some:[0-9]{8}}-{code}-{progress}")
    public Response test3(@PathParam("code") String code,  @PathParam("some") String some, @PathParam("progress")  String progress) {
        return Response.status(Response.Status.OK).build();
    }
}
