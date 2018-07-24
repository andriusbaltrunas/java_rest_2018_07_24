package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by andriusbaltrunas on 7/24/2018.
 */
@Path("/myFirstRest")
public class MyFirstRestExample {

    @GET
    @Path("/sayHi")
    public String sayHi(){
        return "Labas";
    }

    @GET
    @Path("/hiNumber")
    public int myNumber(){
        return 10;
    }

    @GET
    @Path("/sayHi/{name}")
    public String sayHiToUser(@PathParam("name") String userName){
        return "Labas " + userName;
    }

    @GET
    @Path("/getStudent")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(){
        Student st = new Student(10, "Andrius", "Baltruna", "andrius@test.com");
        return st;
    }

}
