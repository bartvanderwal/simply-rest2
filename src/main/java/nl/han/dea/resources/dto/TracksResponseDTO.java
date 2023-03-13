package nl.han.dea.resources.dto;

public class TracksResponseDTO {
    private int id; // "id": 1,

    public TracksResponseDTO(int id, String date) {
        this.id = id;
        this.publicationDate = date;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    private String title; // "Song for someone",
//            "performer": "The Frames",
//            "duration": 350,
//            "album": "The cost",
//            "playcount": undefined,
    private String publicationDate; // "publicationDate": undefined,
//            "description": undefined,
//            "offlineAvailable": false


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
