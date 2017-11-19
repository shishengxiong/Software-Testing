import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class Chef_Test extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

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
        Recipe recipe_1 = mock (Recipe.class);
        recipe_1.set_title("Chinese Dumplings");

        test.add_recipe(recipe_1);
        assertNotNull(test.fetch_recipe("Chinese Dumplings"));
    }

    @Test
    public void test_13() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here
        Recipe recipe_1 = mock (Recipe.class);
        recipe_1.set_title("Chinese Dumplings");

        test.add_recipe(recipe_1);
        assertEquals(test.fetch_recipe("Chinese Dumplings").get_title(), "Chinese Dumplings");
    }

    @Test
    public void test_14() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here
        Recipe recipe_1 = mock (Recipe.class);
        recipe_1.set_title("Chinese Dumplings");

        test.add_recipe(recipe_1);
        test.remove_recipe("Chinese Dumplings");
        Assert.assertNull(test.fetch_recipe("Chinese Dumplings"));
    }

    @Test
    public void test_15() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here
        Recipe recipe_1 = mock (Recipe.class);
        Recipe recipe_2 = mock (Recipe.class);
        Recipe recipe_3 = mock (Recipe.class);

        test.add_recipe(recipe_1);
        test.add_recipe(recipe_2);
        test.add_recipe(recipe_3);

        assertEquals(test.getNumber_recipes(), 3);
    }

    @Test
    public void test_16() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);

        //mock recipe here
        Recipe recipe_1 = mock (Recipe.class);
        recipe_1.set_title("Chinese Dumplings");
        Recipe recipe_2 = mock (Recipe.class);
        recipe_1.set_title("Beijing Fried Duck");
        Recipe recipe_3 = mock (Recipe.class);
        recipe_1.set_title("Korean BBQ");

        test.add_recipe(recipe_1);
        test.add_recipe(recipe_2);
        test.add_recipe(recipe_3);

        assertEquals(test.indexBook(), "- Chinese Dumplings\t- Beijing Fried Duck\t- Korean BBQ");
    }


    @Test
    public void test_17() {
        Chef test = new Chef("John Wattson", Country.UNITED_STATES, "American born specialized on South Chinese dishes", "Chinese Cuisine", 3);


        //mock ingredients here
        Ingredient ingredient_1 = mock (Ingredient.class);
        ingredient_1.set_name("Chinese Baby Carrots");
        Ingredient ingredient_2 = mock (Ingredient.class);
        ingredient_2.set_name("Spinach");
        Ingredient ingredient_3 = mock (Ingredient.class);
        ingredient_3.set_name("Noodles");
        Ingredient ingredient_4 = mock (Ingredient.class);
        ingredient_4.set_name("White Sauce");
        Ingredient ingredient_5 = mock (Ingredient.class);
        ingredient_5.set_name("Duck Fillet");

        //mock recipes here
        Recipe recipe_1 = mock (Recipe.class);
        recipe_1.set_title("Chinese Dumplings");
        recipe_1.set_description("Traditional Recipe");
        recipe_1.set_time(0.20);
        recipe_1.set_instructions("1 - Place dumplings on bamboo steamer");
        recipe_1.add_ingredient(ingredient_1);
        recipe_1.add_ingredient(ingredient_2);
        recipe_1.add_ingredient(ingredient_3);
        recipe_1.add_ingredient(ingredient_4);

        Recipe recipe_2 = mock (Recipe.class);
        recipe_2.set_title("Beijing Fried Duck");
        recipe_2.set_description("Recipe 2");
        recipe_2.set_time(1.00);
        recipe_2.set_instructions("1 - Place duck fillet on frying machine");
        recipe_2.add_ingredient(ingredient_5);

        // Test
        test.add_recipe(recipe_1);
        test.add_recipe(recipe_2);

        assertEquals(test.indexBook(), "Title: Chinese Dumplings \tDescription: Traditional Recipe \tCooking Time: 20 min \t\tINGREDIENTS:\t- Chinese Baby Carrots\t- Spinach\t- Noodles \t- White Sauce \t\tPREPARATION:\t1- Place dumplings on bamboo steamer\t\t" +
                "Title: Beijing Fried Duck \tDescription: Recipe 2 \tCooking Time: 60 min \t\tINGREDIENTS:\t- Duck Fillet \t\tPREPARATION:\t1 - Place duck fillet on frying machine\t\t");
    }




}