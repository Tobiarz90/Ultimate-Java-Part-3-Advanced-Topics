package com.bartosztobiasz;

import java.util.function.Function;

public class LambdasDemo {
    public static void show() {
        // "key:value"
        // 1st transformation: "key=value"
        // 2nd transformation: "{key=value}"
        Function<String, String> replaceColon = str -> str.replace(":", "=");
        Function<String, String> addBraces = str -> "{" + str + "}";

        // Declarative Programming
        // composing functions
        String result = replaceColon
                .andThen(addBraces)
                .apply("key:value");
        /*
        from docs of andThen(Function):
        return (T t) -> after.apply(apply(t));
        return ("key:value") -> after.apply(apply("key:value"));
        return ("key:value") -> after.apply(replaceColon.apply("key:value"));
        return ("key:value") -> after.apply("key=value");
        return ("key:value") -> addBraces.apply("key=value");
        return ("key:value") -> "{key=value}";
        result "{key=value}"
         */

        System.out.println(result);
    }
}
