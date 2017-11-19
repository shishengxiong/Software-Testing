import static org.junit.Assert.*;

import junit.framework.TestCase;
import org.junit.Test;

public class Ingredient_Test extends TestCase {

    protected void setUp() throws Exception {
        super.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    @org.junit.Test
    public void test_1() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        assertNotNull(test);
    }

    @org.junit.Test
    public void test_2() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        assertEquals(test.get_name(),"Chinese Carrots");
    }

    @org.junit.Test
    public void test_3() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        assertEquals(test.get_description(),"Traditional root from ZhenSheng");
    }

    @org.junit.Test
    public void test_4() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        assertEquals(test.get_classification(),Classification.VEGETABLE);
    }

    @org.junit.Test
    public void test_5() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        test.set_name("Grey Hog Chops");
        assertEquals(test.get_name(),"Grey Hog Chops");
    }

    @org.junit.Test
    public void test_6() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        test.set_description("Wild Board from Beijing");
        assertEquals(test.get_description(),"Wild Board from Beijing");
    }

    @org.junit.Test
    public void test_7() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        test.set_classification(Classification.MEAT);
        assertEquals(test.get_classification(),Classification.MEAT);
    }

    @org.junit.Test
    public void test_8() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        assertEquals(test.print_full(),"Chinese Carrots: Traditional root from ZhenSheng");
    }

}