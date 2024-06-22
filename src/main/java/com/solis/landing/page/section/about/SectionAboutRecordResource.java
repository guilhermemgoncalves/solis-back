package com.solis.landing.page.section.about;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("landing-page/section-about")
public class SectionAboutRecordResource {


    @Inject
    SectionAboutService sectionAboutService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getSection(){
        return Response.ok().entity(sectionAboutService.get()).build();
    }


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(SectionAboutRecord section){
        SectionAboutRecord sectionSaved = sectionAboutService.save(section);

        return Response.ok(sectionSaved).build();
    }
}
