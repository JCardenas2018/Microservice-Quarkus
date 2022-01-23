package com.vallegrande.Controller;

import com.vallegrande.Entity.Person;
import com.vallegrande.Service.PersonService;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
public class PersonController {

    @Inject
    PersonService personService;

    @GET
    @Path("/allPerson")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Person> getPersons(){
        return personService.getPersons();
    }

    @GET
    @Path("/onlyPerson/{idPerson}")
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson(@PathParam("idPerson") int idPerson){
        return personService.getPerson(idPerson);
    }

    @PUT
    @Path("/updatePerson/{idPerson}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updatePerson(@PathParam("idPerson") int idPerson, Person person){
        personService.updatePerson(idPerson, person);
    }

    @POST
    @Path(("/addPerson"))
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Person addPerson(Person person){
        return personService.addPerson(person);
    }

    @DELETE
    @Path("/deletePerson/{idPerson}")
    public void deletePerson(@PathParam("idPerson") int idPerson){
        personService.deletePerson(idPerson);
    }
}
