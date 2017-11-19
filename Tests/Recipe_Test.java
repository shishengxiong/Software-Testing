import junit.framework.TestCase;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;

public class Recipe_Test extends TestCase {

    protected void setUp() throws Exception {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
    @org.junit.Test
    public void test_1() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertNotNull(test);
    }

    @org.junit.Test
    public void test_2() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals("Chinese Dumplings", test.get_title());
    }

    @org.junit.Test
    public void test_3() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals("Traditional Recipe",test.get_description());
    }

    @org.junit.Test
    public void test_4() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(0.20,test.get_time());
    }

    @org.junit.Test
    public void test_5() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals("1- Place dumplings on bamboo steamer",test.get_instructions());
    }

    @org.junit.Test
    public void test_6() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        test.set_title("Korean Dumplings");

        assertEquals("Korean Dumplings", test.get_title());
    }

    @org.junit.Test
    public void test_7() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        test.set_description("Traditional Korean Dumplings recipe");

        assertEquals("Traditional Korean Dumplings recipe", test.get_description());
    }

    @org.junit.Test
    public void test_8() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        test.set_time(0.45);

        assertEquals(0.45, test.get_time());
    }

    @org.junit.Test
    public void test_9() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        test.set_instructions("1- Place dumplings on boiling water");

        assertEquals("1- Place dumplings on boiling water", test.get_instructions());
    }

    @org.junit.Test
    public void test_10() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        //mock ingredient here
        Ingredient ingredient_1 = mock (Ingredient.class);
        ingredient_1.set_name("Chinese Baby Carrots");

        test.add_ingredient(ingredient_1);

        assertEquals("- Chinese Baby Carrots",test.print_ingredients());
    }

    @org.junit.Test
    public void test_11() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        //mock ingredient here
        Ingredient ingredient_1 = mock (Ingredient.class);
        ingredient_1.set_name("Chinese Baby Carrots");

        test.add_ingredient(ingredient_1);
        test.remove_ingredient("Chinese Baby Carrots");

        assertEquals("This recipe has no ingredients yet.", test.print_ingredients());
    }

    @org.junit.Test
    public void test_12() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        //mock ingredient here
        Ingredient ingredient_1 = mock (Ingredient.class);
        Ingredient ingredient_2 = mock (Ingredient.class);
        Ingredient ingredient_3 = mock (Ingredient.class);
        Ingredient ingredient_4 = mock (Ingredient.class);

        ingredient_1.set_name("Chinese Baby Carrots");
        ingredient_2.set_name("Spinach");
        ingredient_3.set_name("Noodles");
        ingredient_4.set_name("White Sauce");

        test.add_ingredient(ingredient_1);
        test.add_ingredient(ingredient_2);
        test.add_ingredient(ingredient_3);
        test.add_ingredient(ingredient_4);


        assertEquals("Title: Chinese Dumplings \tDescription: Traditional Recipe \tCooking Time: 20 min \t\tINGREDIENTS:\t- Chinese Baby Carrots\t- Spinach\t- Noodles\t- White Sauce\t\tPREPARATION:\t1- Place dumplings on bamboo steamer\t\t", test.print_recipe());
    }

}
