package recursive.inheritance_and_recursive

import javax.ws.rs.Path

// TODO check 2 url references (enter inheritance1 in the Endpoints view):
// root_path/inheritance/create
// root_path/inheritance/delete/{id}
@Path("inheritance_recursive_kt")
class Inherritance_and_Recursive : BaseAbstract() {
    @get:Path("some_path")
    val subResource: Inherritance_and_Recursive
        get() = Inherritance_and_Recursive()
}
