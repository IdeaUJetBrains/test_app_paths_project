package regexp

import javax.ws.rs.GET
import javax.ws.rs.PUT
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.core.Response

@Path("regexp3")
class Regexp_Res3_made_for_test_issue249031 {
    //    http://localhost:8080/Rest_glassfish_hello_world2_war_exploded/root_path/regexp3/some-some-some
    @GET
    fun get1(): String {
        return "test"
    }

    @GET
    @Path("test1/{some}-{code}-{progress}")
    fun getData0(
        @PathParam("code") code: String,
        @PathParam("some") some: String,
        @PathParam("progress") progress: String
    ): String {
        return "some = $some, code = $code, progress = $progress. "
    }

    @GET
    @Path("/test2/{some:[0-9]{8}}-{code}-{progress}")
    fun getData(
        @PathParam("code") code: String?,
        @PathParam("some") some: String?,
        @PathParam("progress") progress: String?
    ): String {
        return ""
    }

    @GET
    @Path("/test3/test2{some:[0-9]{8}}-{code}-{progress}/test")
    fun getData1(
        @PathParam("code") code: String?,
        @PathParam("some") some: String?,
        @PathParam("progress") progress: String?
    ): String {
        return ""
    }

    @GET
    @Path("test4/{username1: [a-zA-Z][a-zA-Z_0-9]*}/{username2: [a-zA-Z][a-zA-Z_0-9]*}")
    fun getData2(
        @PathParam("username1") username: String?,
        @PathParam("username2") username2: String?
    ): String {
        return ""
    }

    @GET
    @Path("test5/test{username1: [a-zA-Z][a-zA-Z_0-9]*}/test{username2: [a-zA-Z][a-zA-Z_0-9]*}")
    fun getData3(
        @PathParam("username1") username: String?,
        @PathParam("username2") username2: String?
    ): String {
        return ""
    }

    @GET
    @Path("test6/{username2:[a-z]\\d{2,3}}")
    fun getData4(@PathParam("username2") username2: String?): String {
        return ""
    }

    @GET
    @Path("/test7/{orderId2:[a-z]\\d{2,3}}")
    fun getData5(@PathParam("orderId2") orderId: String): String {
        return "orderId: $orderId"
    }

    @GET
    @Path("/test8/{pathparam1:[0-9]{8}}-{pathparam2}-{pathparam3}-{pathparam4:[a-z]\\d{2,3}}-{pathparam5:\\d{3,5}}")
    fun getData6(
        @PathParam("pathparam1") pathparam1: String?,
        @PathParam("pathparam2") pathparam2: String?,
        @PathParam("pathparam3") pathparam3: String?,
        @PathParam("pathparam4") pathparam4: String?
    ): String {
        return "pathparams"
    }

    //* */
    @GET
    @Path("/test9/{hard: [a-z]aa\\d{9}}/{easy}")
    fun getData6(
        @PathParam("hard") pathparam1: String?,
        @PathParam("easy") pathparam2: String?
    ): String {
        return "pathparams"
    }

    @GET
    @Path("test10/{var:.+}/pathZ")
    fun getData7(@PathParam("var") path: String): String {
        return path
    }

    // _ah
    @Path("test11/{id: ^(?!_ah).*$}")
    fun getData8(@PathParam("id") path: String): String {
        return path
    }

    @PUT
    @Path("test12/{id: ^(jobs)}")
    fun getData9(@PathParam("id") path: String): String {
        return path
    }

    @PUT
    @Path("test13/{id: ^a*}")
    fun getData10(@PathParam("id") path: String): String {
        return path
    }

    @PUT
    @Path("test14/{id:^a*}")
    fun getData10_1(@PathParam("id") path: String): String {
        return path
    }

    @Path("/test15/{path: (?!create|read|update|delete).*}")
    fun getData12(@PathParam("path") path: String): String {
        return path
    }

    @GET
    @Path("/test16/{empName: [a-zA-Z\\s]+}")
    fun getEmployeeByName(@PathParam("empName") name: String): Response {
        return Response.status(200).entity("Got employee with name : $name").build()
    }
}
