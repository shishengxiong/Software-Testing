import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Chef_Test {

    @Test
    public void test_1() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        assertNotNull(null);
    }

    @Test
    public void test_2() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        assertEquals(test.get_name(), "John Wattson");
    }

    @Test
    public void test_3() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        assertEquals(test.get_nationality(), Country.UNITED_STATES);
    }

    @Test
    public void test_4() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        assertEquals(test.get_description(), "American born specialized on South Chinese dishes");
    }

    @Test
    public void test_5() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        assertEquals(test.get_specialty(), "American born specialized on South Chinese dishes");
    }

    @Test
    public void test_6() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        assertEquals(test.get_stars(), 3);
    }

    @Test
    public void test_7() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        test.set_name("Albin Defonse");
        assertEquals(test.get_name(), "Albin Defonse");
    }

    @Test
    public void test_8() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
         test.set_nationality(Country.FRANCE);
        assertEquals(test.get_nationality(), Country.FRANCE);
    }

    @Test
    public void test_9() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        test.set_description("Paris Chef with 15 years of experience");
        assertEquals(test.get_description(), "Paris Chef with 15 years of experience");
    }

    @Test
    public void test_10() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        test.set_specialty("French Cuisine");
        assertEquals(test.get_specialty(), "French Cuisine");
    }

    @Test
    public void test_11() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        test.set_starts(5);
        assertEquals(test.get_stars(), 5);
    }


}