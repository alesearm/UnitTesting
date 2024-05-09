package unittesting;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Test
    public void testIsLeapYear() {
        assertFalse(LeapYear.isLeapYear(2023)); // 2023 ist nicht durch 4 teilbar
        assertTrue(LeapYear.isLeapYear(2024));  // 2024 ist durch 4 teilbar
    }
}




