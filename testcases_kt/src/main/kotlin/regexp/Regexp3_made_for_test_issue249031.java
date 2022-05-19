package regexp;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/regexp3_kt/")
public class Regexp3_made_for_test_issue249031 {

//    http://localhost:8080/Rest_glassfish_hello_world2_war_exploded/app_path/api/users0/some-some-some

    @GET
    public String get1(){ return "test";    }

    @GET
    @Path("users0/{some}-{code}-{progress}")
    public String getData0(@PathParam("code") String code,
                           @PathParam("some") String some,
                           @PathParam("progress") String progress) {
        return  "some = " + some + ", " + "code = " + code + ", " + "progress = " + progress + ". ";
    }
    @GET
    @Path("/users/{some:[0-9]{8}}-{code}-{progress}")
    public String getData(@PathParam("code") String code,
                          @PathParam("some") String some,
                          @PathParam("progress") String progress) {
        return "";
    }

    @GET
    @Path("/users1/test2{some:[0-9]{8}}-{code}-{progress}/test")
    public String getData1(@PathParam("code") String code,
                           @PathParam("some") String some,
                           @PathParam("progress") String progress) {
        return "";
    }

    @GET
    @Path("users2/{username1: [a-zA-Z][a-zA-Z_0-9]*}/{username2: [a-zA-Z][a-zA-Z_0-9]*}")
    public String getData2(@PathParam("username1") String username,
                           @PathParam("username2") String username2) {
        return "";
    }
    @GET
    @Path("users3/test{username1: [a-zA-Z][a-zA-Z_0-9]*}/test{username2: [a-zA-Z][a-zA-Z_0-9]*}")
    public String getData3(@PathParam("username1") String username,
                           @PathParam("username2") String username2) {
        return "";
    }

    @GET
    @Path("users4/{username2:[a-z]\\d{2,3}}")
    public String getData4(@PathParam("username2") String username2) {
        return "";
    }

    @GET
    @Path("/users5/{orderId2:[a-z]\\d{2,3}}")
    public String getData5(@PathParam("orderId2") String orderId) {
        return "orderId: " + orderId;
    }

    @GET
    @Path("/users6/{pathparam1:[0-9]{8}}-{pathparam2}-{pathparam3}-{pathparam4:[a-z]\\d{2,3}}-{pathparam5:\\d{3,5}}")
    public String getData6(@PathParam("pathparam1") String pathparam1,
                           @PathParam("pathparam2") String pathparam2,
                           @PathParam("pathparam3") String pathparam3,
                           @PathParam("pathparam4") String pathparam4) {
        return "pathparams" ;
    }

    //* */
    @GET
    @Path("/users7/{hard: [a-z]aa\\d{9}}/{easy}")
    public String getData6(@PathParam("hard") String pathparam1,
                           @PathParam("easy") String pathparam2) {
        return "pathparams";
    }

    @GET
    @Path("users8/{var:.+}/pathZ")
    public String getData7(@PathParam("var") String path){
        return  path;
    }

// _ah
    @Path("users9/{id: ^(?!_ah).*$}")
    public String getData8(@PathParam("id") String path){
        return  path;
    }

    @PUT
    @Path("users10/{id: ^(jobs)}")
    public String getData9(@PathParam("id") String path) {return  path;}

    @PUT
    @Path("users11/{id: ^a*}")
    public String getData10(@PathParam("id") String path) {return  path;}

    @PUT
    @Path("users11_1/{id:^a*}")
    public String getData10_1(@PathParam("id") String path) {return  path;}




    @Path("/users12/{path: (?!create|read|update|delete).*}")
    public String getData12(@PathParam("path") String path) {return  path;}

    @GET
    @Path("/name/{empName: [a-zA-Z\\s]+}")
    public Response getEmployeeByName(@PathParam("empName") String name){

        return Response.status(200).entity("Got employee with name : " + name).build();
    }

}
