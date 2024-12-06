package ma.dcc.sectani;

import ma.dcc.sectani.entity.Nombres;
import ma.dcc.sectani.service.CalculService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ApplicationTests {
    private final CalculService calculService;

    ApplicationTests(CalculService calculService) {
        this.calculService = calculService;
    }

    @Test
    void contextLoads() {
    }

    @Test
    void testAddition() {

        Nombres nombres = new Nombres(5,7);

        // Act
        int result = calculService.add(nombres);

        // Assert
        assertEquals(12, result, "The addition of 5 and 7 should be 12");
    }

}
