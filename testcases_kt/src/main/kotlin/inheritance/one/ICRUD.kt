package inheritance.one

import javax.ws.rs.DELETE
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam

interface ICRUD {
    @POST
    @Path("create")
    fun createREST(transferObject: String): String

    @DELETE
    @Path("delete/{id}")
    fun deleteREST(@PathParam("id") id: String): String
}
