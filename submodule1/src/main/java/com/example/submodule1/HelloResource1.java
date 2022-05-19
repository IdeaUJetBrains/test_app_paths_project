package com.example.submodule1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello-world")
public class HelloResource1 {
    @GET
    @Produces("text/plain")
    public String hello() {
        return "Hello, World!";
    }
}
