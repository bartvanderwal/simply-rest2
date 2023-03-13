package nl.han.dea;

import jakarta.enterprise.inject.Default;

import java.util.UUID;

@Default
public class UserService implements IUserService {

    public UserService() {
        System.out.println("Constructor of UserService called.");
    }

    // Login de user met gegeven username, mits password erbij klopt.
    // Geeft een token terug als login slaagt, anders gooit deze AuthenticationException.
    @Override
    public String login(String username, String password) {
        // TODO login met echt paswoord check.
        return UUID.randomUUID().toString();
    }

    @Override
    public String healthy() {

        return "Up & Running";
    }

}
