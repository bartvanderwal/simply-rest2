package nl.han.dea;

import java.util.UUID;

public class LoginResponse {
    private final String userName;
    private final UUID token;

    public LoginResponse(String username) {
        this.userName = username;
        this.token = UUID.randomUUID();
    }
}
