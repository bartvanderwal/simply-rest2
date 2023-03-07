package nl.han.dea;

import jakarta.ws.rs.core.Response;
import nl.han.dea.crosscuttingconcerns.dto.HealthStatusDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class HealthCheckResourceTest {

    HealthCheckResource sut = new HealthCheckResource();

    @Test
    public void test() {
        // Arrange
        var expected = new HealthStatusDTO("Up & Running", true);
        var mockedUserService = Mockito.mock(nl.han.dea.UserService.class);
        sut.setUserService(mockedUserService);
        Mockito.when(sut.healthy()).thenReturn(expected);

        // Act
        var actual = sut.healthy();

        // Assert.
        Assertions.assertEquals(expected, actual);
    }

}