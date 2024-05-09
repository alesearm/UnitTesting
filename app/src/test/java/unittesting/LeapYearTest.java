package unittesting;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Test
    public void testIsLeapYear() {
        assertTrue(LeapYear.isLeapYear(2024)); 
        assertTrue(LeapYear.isLeapYear(2008));
        assertTrue(LeapYear.isLeapYear(984));
        assertTrue(LeapYear.isLeapYear(2104));
    }  
    
    @Test
    public void testIsNotLeapYear() {
        assertFalse(LeapYear.isLeapYear(2023)); // 2023 ist nicht durch 4 teilbar
        assertFalse(LeapYear.isLeapYear(2009)); // 2009 ist nicht durch 4 teilbar
        assertFalse(LeapYear.isLeapYear(1743)); // 1743 ist nicht durch 4 teilbar
        assertFalse(LeapYear.isLeapYear(1999)); // 1999 ist nicht durch 4 teilbar
}

    @Test
    public void TeilenDurch100AberNichtDurch400 (){
        assertFalse(LeapYear.isLeapYear(2100)); // 2100 ist  durch 100 teilbar, aber nicht durch 400
        assertTrue(LeapYear.isLeapYear(2400)); // 2100 ist  durch 100 und durch 400 teilbar
    }

    @Test
    public void TeilenDurch100undDurch400 (){
        assertTrue(LeapYear.isLeapYear(1600)); // 1600 ist  durch 400 teilbar und durch 400
        assertTrue(LeapYear.isLeapYear(2000));
    }


}

