package com.solis.apply.position;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriBuilder;

import java.net.URI;

@Path("api/v1/position")
public class PositionResource {

    @Inject
    PositionService service;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response list(){
        return Response.ok(service.list()).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(PositionRecord record){

        URI uri =UriBuilder.fromPath(
                PositionResource.class.getResource(this.getClass().getName()).getPath()).build();
        return Response.created(uri).build();
    }
}
