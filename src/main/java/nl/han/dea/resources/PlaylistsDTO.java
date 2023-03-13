package nl.han.dea.resources;

import nl.han.dea.resources.dto.PlaylistDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Voorbeeld uit spec
 * {
 *    "playlists": [
 *       {
 *          "id": 1,
 *          "name": "Heavy Metal",
 *          "owner": true,
 *          "tracks": []
 *       },
 *       {
 *          "id": 2,
 *          "name": "Pop",
 *          "owner": false,
 *          "tracks": []
 *       }
 *    ],
 *    "length": 123445
 * }
 */
public class PlaylistsDTO {

    public List<PlaylistDTO> playlists;

    public double length;
}
