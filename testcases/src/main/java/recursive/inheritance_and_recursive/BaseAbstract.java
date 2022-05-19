package recursive.inheritance_and_recursive;

public abstract class BaseAbstract implements ICRUD {

    @Override
    public String createREST(String transferObject) {
        return create(transferObject);
    }

    @Override
    public String deleteREST( String id) {
        return delete(id);
    }






    private String delete(String id) {
        return id;
    }

    private String create(String transferObject) {
        return transferObject;
    }


}

