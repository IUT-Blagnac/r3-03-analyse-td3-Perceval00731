package com.iutblagnac.r303trace;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println(hello());
    }

    public static String hello() {
        return "Hello World!";
    }

    public static String hello(String param) {
        return param;
    }


    public void testAuRevoirEmptyParameter()
    {
        assertEquals("au revoir", App.auRevoir());
    }

    public void testAuRevoirParameter()
    {
        assertEquals("au revoir JMB!", App.auRevoir("au revoir JMB!"));
    }
}
