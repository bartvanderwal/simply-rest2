package nl.han;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import nl.han.dea.LoginResponse;
import nl.han.dea.UserService;

public class LoginRequest {
    // TODO: Properties private maken en instelbaar/opvraagbar via getters en setters
    // conform de (Java) Beans specificatie. Deze geldt voor DTO die JAX-RS kan serialiseren/deserialseren.
    public String user;

    public String password;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public LoginResponse login() {
        var userName = user;

        var userService = new UserService();
        userService.login(user, password);
        return new LoginResponse(userName);
    }
}
