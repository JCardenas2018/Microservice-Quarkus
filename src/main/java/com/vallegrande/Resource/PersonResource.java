package com.vallegrande.Resource;

import com.vallegrande.Entity.Person;
import com.vallegrande.Repository.PersonRepository;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/api")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    PersonRepository personService;

    @GET
    @Path("/allPerson")
    public List<Person> getPersons() {
        return personService.getPersons();
    }

    @GET
    @Path("/onlyPerson/{idPerson}")
    public Person getPerson(@PathParam("idPerson") int idPerson) {
        return personService.getPerson(idPerson);
    }

    @PUT
    @Path("/updatePerson/{idPerson}")
    public void updatePerson(@PathParam("idPerson") int idPerson, Person person) {
        personService.updatePerson(idPerson, person);
    }

    @POST
    @Path(("/addPerson"))
    public Person addPerson(Person person) {
        return personService.addPerson(person);
    }

    @DELETE
    @Path("/deletePerson/{idPerson}")
    public void deletePerson(@PathParam("idPerson") int idPerson) {
        personService.deletePerson(idPerson);
    }
}
