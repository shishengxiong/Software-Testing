import static org.junit.Assert.*;

public class Recipe_Test {

    @org.junit.Test
    public void test_1() {
        Recipe recipe_1 = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertNotNull(recipe_1);
    }

    @org.junit.Test
    public void test_2() {
        Recipe recipe_1 = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(recipe_1.get_title(), "Chinese Dumplings");
    }

    @org.junit.Test
    public void test_3() {
        Recipe recipe_1 = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(recipe_1.get_description(), "Traditional Recipe");
    }

    @org.junit.Test
    public void test_4() {
        Recipe recipe_1 = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(java.util.Optional.ofNullable(recipe_1.get_time()),0.20);
    }

    @org.junit.Test
    public void test_5() {
        Recipe recipe_1 = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(recipe_1.get_instructions(), "1- Place dumplings on bamboo steamer");
    }

    @org.junit.Test
    public void test_6() {
        Recipe recipe_1 = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        recipe_1.set_title("Korean Dumplings");
        
        assertEquals(recipe_1.get_title(), "Korean Dumplings");
    }

}
