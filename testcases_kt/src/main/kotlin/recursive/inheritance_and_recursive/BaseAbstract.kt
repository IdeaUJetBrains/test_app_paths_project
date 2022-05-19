package recursive.inheritance_and_recursive

abstract class BaseAbstract : ICRUD {


    override fun deleteREST(id: String): String {
        return delete(id)
    }



    private fun delete(id: String): String {
        return id
    }
}
