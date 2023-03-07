package nl.han.dea.crosscuttingconcerns.dto;

public class HealthStatusDTO {

    public String status;
    public boolean errorOccurred;

    public HealthStatusDTO(String status, boolean errorOccurred) {
        this.status = status;
        this.errorOccurred = errorOccurred;
    }

    // Eisen van een JavaBean:
    // parameterless constructor
    // Private properties
    // En getters en setters voor alle velden.
    public HealthStatusDTO() {

    }
}
