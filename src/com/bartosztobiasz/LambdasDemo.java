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
        // composing functions in reverse order
        String result = addBraces
                .compose(replaceColon)
                .apply("key:value");
        /*
        from docs of compose(Function):
        return (V v) -> apply(before.apply(v));
        return ("key:value") -> apply(replaceColon.apply("key:value"));
        return ("key:value") -> apply("key=value");
        return ("key:value") -> addBraces.apply("key=value");
        return ("key:value") -> "{key=value}";
        result = "{key=value}";
         */

        System.out.println(result);
    }
}
