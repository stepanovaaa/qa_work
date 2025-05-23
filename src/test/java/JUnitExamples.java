import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @Test
    void firstTest() {
        System.out.println("  Here is firstTest");
    }

    @Test
    void secondTest() {
        System.out.println("  Here is secondTest");
    }

    @BeforeAll
    static void beforeTest() {
        System.out.println("Here is beforeTest");
    }

    @AfterAll
    static void afterTest() {
        System.out.println("Here is afterTest");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    Here is beforeEach");
    }
}
