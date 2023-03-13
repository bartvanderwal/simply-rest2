package nl.han.dea.crosscuttingconcerns.dto;

import org.joda.time.DateTime;

import java.util.UUID;

public class TokenDTO {
    private String username;

    private UUID token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UUID getToken() {
        return token;
    }

    public void setToken(UUID token) {
        this.token = token;
    }

    public DateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(DateTime createdAt) {
        CreatedAt = createdAt;
    }

    // Nog 'de tijd' voor token invalidatie t.z.t.
    // Comment: Please don’t teach the young ones the outdated classes Date and Calendar, at least not as the first option and not without a warning or reservation. Instant, LocalDate, ZonedDateTime and friends are so much better. – Ole V.V. Jul 19, 2017 at 20:26
    // Bron: https://stackoverflow.com/questions/45199303/which-class-to-use-for-keeping-time-and-date-in-java
    private org.joda.time.DateTime CreatedAt;
}
