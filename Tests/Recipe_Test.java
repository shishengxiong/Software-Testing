import static org.junit.Assert.*;

public class Recipe_Test {

    @org.junit.Test
    public void test_1() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertNotNull(null);
    }

    @org.junit.Test
    public void test_2() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(test.get_title(), "Chinese Dumplings");
    }

    @org.junit.Test
    public void test_3() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(test.get_description(), "Traditional Recipe");
    }

    @org.junit.Test
    public void test_4() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(java.util.Optional.ofNullable(test.get_time()),0.20);
    }

    @org.junit.Test
    public void test_5() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");
        assertEquals(test.get_instructions(), "1- Place dumplings on bamboo steamer");
    }

    @org.junit.Test
    public void test_6() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        test.set_title("Korean Dumplings");

        assertEquals(test.get_title(), "Korean Dumplings");
    }

    @org.junit.Test
    public void test_7() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        test.set_description("Traditional Korean Dumplings recipe");

        assertEquals(test.get_description(), "Traditional Korean Dumplings recipe");
    }

    @org.junit.Test
    public void test_8() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        test.set_time(0.45);

        assertEquals(java.util.Optional.ofNullable(test.get_time()),0.45);
    }

    @org.junit.Test
    public void test_9() {
        Recipe test = new Recipe ("Chinese Dumplings", "Traditional Recipe",0.20,"1- Place dumplings on bamboo steamer");

        test.set_instructions("1- Place dumplings on boiling water");

        assertEquals(test.get_instructions(), "1- Place dumplings on boiling water");
    }

}
