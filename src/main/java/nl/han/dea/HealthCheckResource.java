package nl.han.dea;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import nl.han.dea.crosscuttingconcerns.dto.HealthStatusDTO;

@Path("/health")
public class HealthCheckResource {


    private UserService userService; // new UserService();

    @Inject
    public void setUserService(UserService userService) {
        System.out.println("HealthCheckResource: Setter aangeroepen (inject?).");
        this.userService = userService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public HealthStatusDTO healthy() {

        // Gebruik van UserService.healthy();
        var result = new HealthStatusDTO();
        var response =
        result.status = userService.healthy();
        result.errorOccurred = false;
        return result;

    }




}
