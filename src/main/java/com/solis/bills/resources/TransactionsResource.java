package com.solis.bills.resources;


import com.solis.bills.dto.AddTransactionRecord;
import com.solis.bills.service.ITransactionService;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URI;


@Path("api/v1/transaction")
public class TransactionsResource {


    @Inject
    ITransactionService transactionService;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addTransaction(AddTransactionRecord record){
        transactionService.addTransaction(record);
        return Response.created(URI.create("http://pg")).build();
    }

}
