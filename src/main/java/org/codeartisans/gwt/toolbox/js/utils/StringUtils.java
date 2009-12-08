package org.codeartisans.gwt.toolbox.js.utils;

public final class StringUtils
{

    private StringUtils()
    {
    }

    public static String sayHello(String name)
    {
        return "Hello " + name + "!";
    }

    public static boolean isEmpty(String s)
    {
        return (s == null || s.length() == 0);
    }

}
