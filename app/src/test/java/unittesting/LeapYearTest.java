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
@Test
public void TeilenDurch100AberNichtDurch400 (){
    assertFalse(LeapYear.isLeapYear(2100)); // 2100 ist  durch 100 teilbar, aber nicht durch 400
    assertTrue(LeapYear.isLeapYear(2400)); // 2100 ist  durch 100 und durch 400 teilbar
}


