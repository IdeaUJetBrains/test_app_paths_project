package inheritance.one

abstract class BaseAbstract : ICRUD {
    override fun createREST(transferObject: String): String {
        return create(transferObject)
    }

    override fun deleteREST(id: String): String {
        return delete(id)
    }

    private fun delete(id: String): String {
        return id
    }

    private fun create(transferObject: String): String {
        return transferObject
    }
}
