package nl.han.dea;

public interface IUserService {
    // Login de user met gegeven username, mits password erbij klopt.
    // Geeft een token terug als login slaagt, anders gooit deze AuthenticationException.
    String login(String username, String password);

    String healthy();
}
