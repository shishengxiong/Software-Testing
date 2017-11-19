import org.junit.Assert;
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

    @Test
    public void test_12() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here

        test.add_recipe("recipe");
        assertNotNull(test.fetch_recipe("recipe title"));
    }

    @Test
    public void test_13() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here

        test.add_recipe("recipe");
        assertEquals(test.fetch_recipe("recipe title"), "recipe");
    }

    @Test
    public void test_14() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);
        //mock recipe here
        test.add_recipe("recipe");
        test.remove_recipe("recipe title");
        Assert.assertNull(test.fetch_recipe("recipe title"));
    }

    @Test
    public void test_15() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here
        //mock recipe here
        //mock recipe here

        test.add_recipe("recipe1");
        test.add_recipe("recipe2");
        test.add_recipe("recipe3");

        assertEquals(test.getNumber_recipes(), 3);
    }

    @Test
    public void test_16() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here
        //mock recipe here
        //mock recipe here

        test.add_recipe("recipe1");
        test.add_recipe("recipe2");
        test.add_recipe("recipe3");

        assertEquals(test.indexBook(), "- Chinese Dumplings\t- Beijing Fried Duck\t- Korean BBQ");
    }

    @Test
    public void test_17() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here
        //mock recipe here
        //mock recipe here

        test.add_recipe("recipe1");
        test.add_recipe("recipe2");
        test.add_recipe("recipe3");

        assertEquals(test.indexBook(), "- Chinese Dumplings\t- Beijing Fried Duck\t- Korean BBQ");
    }

    @Test
    public void test_18() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here
        //mock recipe here
        //mock recipe here

        test.add_recipe("recipe1");
        test.add_recipe("recipe2");
        test.add_recipe("recipe3");

        assertEquals(test.indexBook(), "Title: Chinese Dumplings \tDescription: Traditional Recipe \tCooking Time: 20 min \t\tINGREDIENTS:\t- Chinese Baby Carrots\t- Spinach\t- Noodles \t\tPREPARATION:\t1- Place dumplings on bamboo steamer\t\t" +
                "Title: Chinese Dumplings \tDescription: Traditional Recipe \tCooking Time: 20 min \t\tINGREDIENTS:\t- Chinese Baby Carrots\t- Spinach\t- Noodles \t\tPREPARATION:\t1- Place dumplings on bamboo steamer\t\t" +
                "Title: Chinese Dumplings \tDescription: Traditional Recipe \tCooking Time: 20 min \t\tINGREDIENTS:\t- Chinese Baby Carrots\t- Spinach\t- Noodles \t\tPREPARATION:\t1- Place dumplings on bamboo steamer\t\t");
    }




}