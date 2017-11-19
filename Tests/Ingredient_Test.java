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
        assertEquals("Chinese Carrots", test.get_name());
    }

    @org.junit.Test
    public void test_3() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        assertEquals("Traditional root from ZhenSheng",test.get_description());
    }

    @org.junit.Test
    public void test_4() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        assertEquals(Classification.VEGETABLE, test.get_classification());
    }

    @org.junit.Test
    public void test_5() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        test.set_name("Grey Hog Chops");
        assertEquals("Grey Hog Chops",test.get_name());
    }

    @org.junit.Test
    public void test_6() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        test.set_description("Wild Board from Beijing");
        assertEquals("Wild Board from Beijing",test.get_description());
    }

    @org.junit.Test
    public void test_7() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        test.set_classification(Classification.MEAT);
        assertEquals(Classification.MEAT,test.get_classification());
    }

    @org.junit.Test
    public void test_8() {
        Ingredient test = new Ingredient("Chinese Carrots","Traditional root from ZhenSheng", Classification.VEGETABLE);
        assertEquals("Chinese Carrots: Traditional root from ZhenSheng",test.print_full());
    }

}