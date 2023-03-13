package nl.han.dea.resources.dto;

public class PlaylistDTO {
     public double id;
     public String name;
     public boolean owner;

    public PlaylistDTO(double id, String name, boolean owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }
}


