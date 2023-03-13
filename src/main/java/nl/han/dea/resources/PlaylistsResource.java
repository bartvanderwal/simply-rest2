package nl.han.dea.resources;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import nl.han.dea.data.TokenStorage;
import nl.han.dea.resources.dto.PlaylistDTO;
import nl.han.dea.resources.dto.TracksResponseDTO;

import java.util.ArrayList;

@Path("/playlists/")
public class PlaylistsResource {

    private final TokenStorage tokenStorage;

    public PlaylistsResource(TokenStorage tokenStorage) {
        this.tokenStorage = tokenStorage;
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{token}")
    public void playlists(
            @QueryParam("token")
            String token
    ) {
        // TODO Checken of token klopt, zo niet, dan 401 retourneren.
        // TODO refactoren naar gebruik service.
        var result = new PlaylistsDTO();

        result.playlists = new ArrayList<>();
        PlaylistDTO playlist1 = new PlaylistDTO(1, "Heavy metal", true);
        PlaylistDTO playlist2 = new PlaylistDTO(2, "Jazz", false);

        result.playlists.add(playlist1);
        result.playlists.add(playlist2);

        result.length = 12123;
    }

    // Get all tracks that belong to a Playlist.
    @GET
    @Path("/{id}/tracks")
    @Produces(MediaType.APPLICATION_JSON)
    public TracksResponseDTO getAllTracksForPlaylist(@PathParam("id") int playlistId) {
        // TODO Checken of token klopt, zo niet, dan 401 retourneren.
        tokenStorage.ch

        // TODO refactoren naar gebruik service.
        return new TracksResponseDTO(1, "3-12-2001");
    }
}
