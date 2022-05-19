package recursive.inheritance_and_recursive

import javax.ws.rs.DELETE
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.PathParam

interface ICRUD {

    @DELETE
    @Path("delete/{id}")
    fun deleteREST(@PathParam("id") id: String): String
}
