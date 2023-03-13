package nl.han.dea.resources.dto;

/**
 * Voorbeeld:
 * {
 *   "token":  "1234-1234-1234",
 *   "user":   "Meron Brouwer"
 * }
 */

public class LoginResponseDTO {
    public String user;

    public String token;

    public LoginResponseDTO(String user, String token) {
        this.user = user;
        this.token = token;
    }
}


