package swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.http.HttpStatus;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("swagger_annot_res/myEntity1")
@Api(value = "Swagger API: MyEntity")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class MyEntitySwaggerAPI {
    @GET
    @Path("/")
    @ApiOperation(httpMethod = HttpMethod.GET, value = "getMyEntity")
    @ApiResponses({ @ApiResponse(code = HttpStatus.SC_OK, message = "Http status 200 OK", response = MyEntity.class) })
    public Response getMyEntity() {
        MyEntity myEntity = new MyEntity();

        myEntity.setId("myEntity - id - 1");
        myEntity.setCode("myEntity - code - 1");
        myEntity.setDesc("myEntity - desc - 1");

        return Response.ok(myEntity).build();
    }
}
