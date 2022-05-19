package inheritance.two

import javax.ws.rs.DELETE
import javax.ws.rs.Path
import javax.ws.rs.PathParam

abstract class BaseAbstract : ICRUD {
    override fun createREST(transferObject: String): String {
        return create(transferObject)
    }

    @DELETE
    @Path("delete1/{id1}")
    override fun deleteREST(@PathParam("id1") id: String): String {
        return delete(id)
    }

    private fun delete(id: String): String {
        return id
    }

    private fun create(transferObject: String): String {
        return transferObject
    }
}
