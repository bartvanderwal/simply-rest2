package nl.han.dea;

import java.util.UUID;

public class UserService {
    // Login de user met gegeven username, mits password erbij klopt.
    // Geeft een token terug als login slaagt, anders gooit deze AuthenticationException.
    public String login(String username, String password) {
        // TODO login met echt paswoord check.
        return UUID.randomUUID().toString();
    }
}
