package nl.han.dea.resources;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.han.dea.resources.dto.LoginRequestDTO;
import nl.han.dea.resources.dto.LoginResponseDTO;

@Path("/login")

public class LoginResource {
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/")
    public LoginResponseDTO login(
            LoginRequestDTO request
    ) {

        // TODO: Dynamisch maken en naar service refactoren.
        // userService.login(username, password);
        var token = "1234-1234-1234";

        return new LoginResponseDTO(request.user, token);
    }
}
