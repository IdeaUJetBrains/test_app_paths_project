package recursive

import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("recursive_kt")
class RecurciveRes {
    @get:GET
    val text: String
        get() = "foo"

    @get:Path("some_path")
    val subResource: RecurciveRes
        get() = RecurciveRes()
}
