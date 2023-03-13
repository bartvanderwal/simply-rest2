package nl.han.dea.data;

import jakarta.enterprise.context.ApplicationScoped;
import nl.han.dea.crosscuttingconcerns.dto.TokenDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@ApplicationScoped
public class TokenStorage {
    List<TokenDTO> tokens = new ArrayList<>();

    public void addToken(TokenDTO token) {
        // Controleer eerst dat het token en de username niet al voorkomen in de lijst.
        // TODO: Nicify.
        if (tokens.stream().map(t -> t.getToken()).toList()
                .contains(token.getToken())) {
            if (tokens.stream().map(t -> t.getUsername()).toList().contains(token.getUsername())) {
                tokens.add(token);
            }
        }
    }

    // TODO: Should we expose that a token is UUID, or keep it as simple String?
    public String dertermineUserForToken(UUID token) {
        return "bart";
    }
}
