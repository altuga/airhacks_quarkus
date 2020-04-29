package com.airhacks.workshops.boundary;

import java.time.LocalDate;
import java.util.List;

import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.airhacks.workshops.entity.Workshop;

@Produces(MediaType.APPLICATION_JSON)
@Path("workshops")
public class WorkshopsResource {

    @GET
    public List<Workshop> all() {
        return Workshop.listAll();
    }

    @POST
    @Transactional
    public void save(Workshop workshop) {
        workshop.persist();
    }

    @GET
    @Path("sample")
    public Workshop sample() {
        return new Workshop("sample", LocalDate.now(),"endless hacking");
    }
}