package nl.han.dea.resources;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;

import nl.han.dea.IUserService;
import nl.han.dea.crosscuttingconcerns.dto.HealthStatusDTO;

@Path("/health")
public class HealthCheckResource {


    private IUserService userService; // new UserService();

    @Inject
    public void setUserService(IUserService userService) {
        System.out.println("HealthCheckResource: Setter aangeroepen (inject?).");
        this.userService = userService;
    }

    @GET
    // @Produces(MediaType.TEXT_PLAIN)
    public String healthy() {

        // Gebruik van UserService.healthy();
        var result = new HealthStatusDTO();

        result.status = userService.healthy();
        result.errorOccurred = false;
        return result.status;
    }


}
