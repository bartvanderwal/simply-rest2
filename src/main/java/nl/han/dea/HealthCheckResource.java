package nl.han.dea;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/health")
public class HealthCheckResource {

    UserService userService = new UserService();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String healthy() {

        // TODO Refactor naar gebruik van UserService.healthy();
        return "Up & Running";
    }




}
