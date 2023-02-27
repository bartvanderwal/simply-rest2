package nl.han.dea;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HealthCheckResourceTest {

    HealthCheckResource sut = new HealthCheckResource();

    @Test
    public void test() {
        // Arrange
        var expected = "Up & Running";

        // Act
        var actual = sut.healthy();

        // Assert.
        Assertions.assertEquals(expected, actual);
    }

}