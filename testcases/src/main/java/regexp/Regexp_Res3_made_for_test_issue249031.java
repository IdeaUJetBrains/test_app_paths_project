package regexp;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("regexp3")
public class Regexp_Res3_made_for_test_issue249031 {

//   http://localhost:8080/Rest_glassfish_hello_world2_war_exploded/root_path/regexp3/some-some-some

    @GET
    public String get1(){ return "test";    }

    @GET
    @Path("test1/{some}-{code}-{progress}")
    public String getData0(@PathParam("code") String code,
                           @PathParam("some") String some,
                           @PathParam("progress") String progress) {
        return  "some = " + some + ", " + "code = " + code + ", " + "progress = " + progress + ". ";
    }
    @GET
    @Path("/test2/{some:[0-9]{8}}-{code}-{progress}")
    public String getData(@PathParam("code") String code,
                          @PathParam("some") String some,
                          @PathParam("progress") String progress) {
        return "";
    }

    @GET
    @Path("/test3/test2{some:[0-9]{8}}-{code}-{progress}/test")
    public String getData1(@PathParam("code") String code,
                           @PathParam("some") String some,
                           @PathParam("progress") String progress) {
        return "";
    }

    @GET
    @Path("test4/{username1: [a-zA-Z][a-zA-Z_0-9]*}/{username2: [a-zA-Z][a-zA-Z_0-9]*}")
    public String getData2(@PathParam("username1") String username,
                           @PathParam("username2") String username2) {
        return "";
    }
    @GET
    @Path("test5/test{username1: [a-zA-Z][a-zA-Z_0-9]*}/test{username2: [a-zA-Z][a-zA-Z_0-9]*}")
    public String getData3(@PathParam("username1") String username,
                           @PathParam("username2") String username2) {
        return "";
    }

    @GET
    @Path("test6/{username2:[a-z]\\d{2,3}}")
    public String getData4(@PathParam("username2") String username2) {
        return "";
    }

    @GET
    @Path("/test7/{orderId2:[a-z]\\d{2,3}}")
    public String getData5(@PathParam("orderId2") String orderId) {
        return "orderId: " + orderId;
    }

    @GET
    @Path("/test8/{pathparam1:[0-9]{8}}-{pathparam2}-{pathparam3}-{pathparam4:[a-z]\\d{2,3}}-{pathparam5:\\d{3,5}}")
    public String getData6(@PathParam("pathparam1") String pathparam1,
                           @PathParam("pathparam2") String pathparam2,
                           @PathParam("pathparam3") String pathparam3,
                           @PathParam("pathparam4") String pathparam4) {
        return "pathparams" ;
    }

    //* */
    @GET
    @Path("/test9/{hard: [a-z]aa\\d{9}}/{easy}")
    public String getData6(@PathParam("hard") String pathparam1,
                           @PathParam("easy") String pathparam2) {
        return "pathparams";
    }

    @GET
    @Path("test10/{var:.+}/pathZ")
    public String getData7(@PathParam("var") String path){
        return  path;
    }

// _ah
    @Path("test11/{id: ^(?!_ah).*$}")
    public String getData8(@PathParam("id") String path){
        return  path;
    }

    @PUT
    @Path("test12/{id: ^(jobs)}")
    public String getData9(@PathParam("id") String path) {return  path;}

    @PUT
    @Path("test13/{id: ^a*}")
    public String getData10(@PathParam("id") String path) {return  path;}

    @PUT
    @Path("test14/{id:^a*}")
    public String getData10_1(@PathParam("id") String path) {return  path;}




    @Path("/test15/{path: (?!create|read|update|delete).*}")
    public String getData12(@PathParam("path") String path) {return  path;}

    @GET
    @Path("/test16/{empName: [a-zA-Z\\s]+}")
    public Response getEmployeeByName(@PathParam("empName") String name){

        return Response.status(200).entity("Got employee with name : " + name).build();
    }

}
