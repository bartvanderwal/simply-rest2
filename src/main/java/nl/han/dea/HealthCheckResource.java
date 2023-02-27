package nl.han.dea;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/health")
public class HealthCheckResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String healthy() {
        return "Up & Running";
    }

}
