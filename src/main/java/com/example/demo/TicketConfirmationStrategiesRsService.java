package com.example.demo;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.Arrays;
import java.util.List;

@Path("/")
@Produces("text/xml")
@Service
public class TicketConfirmationStrategiesRsService {

    @GET
    @Path("/operations/")
    public OperationList getOperations() {
        final OperationList operationList = new OperationList();
        operationList.setOperations(Arrays.asList(Operation.values()));
        return operationList;
    }
}
