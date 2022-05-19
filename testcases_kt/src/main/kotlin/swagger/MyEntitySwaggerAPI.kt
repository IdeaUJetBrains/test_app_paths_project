package swagger

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import io.swagger.annotations.ApiResponses
import org.apache.http.HttpStatus
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("swagger_annot_res_kt/myEntity1")
@Api(value = "Swagger API: MyEntity")
@Consumes(MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML)
@Produces(
    MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML
)
class MyEntitySwaggerAPI {
    @get:ApiResponses(
        ApiResponse(
            code = HttpStatus.SC_OK,
            message = "Http status 200 OK",
            response = MyEntity::class
        )
    )
    @get:ApiOperation(httpMethod = HttpMethod.GET, value = "getMyEntity")
    @get:Path("/")
    @get:GET
    val myEntity: Response
        get() {
            val myEntity = MyEntity()
            myEntity.id = "myEntity - id - 1"
            myEntity.code = "myEntity - code - 1"
            myEntity.desc = "myEntity - desc - 1"
            return Response.ok(myEntity).build()
        }
}
