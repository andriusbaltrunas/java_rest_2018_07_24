package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

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
        Student st = new Student(10, "Andrius", "Baltrunas", "andrius@test.com");
        return st;
    }

    @GET
    @Path("/getStudents")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(12, "Andrius", "Baltrunas", "abaltrunas@kcs.com"));
        students.add(new Student(33, "Jonas", "Jonukas", "jonukas@kcs.com"));
        return students;
    }

    @POST
    @Path("/saveStudent")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Student save(Student student){
        student.setId(11);
        student.setName(student.getName() + "!!!!");
        student.setSurname(student.getSurname() + "!!!!!");
        student.setEmail(student.getEmail() + "!!!!!");
        return student;
    }
}
