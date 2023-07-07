package com.bartosztobiasz;

public class LambdasDemo {
    public static void show() {
        // Method Reference signature: ClassName/ObjectName::methodName
        greet(System.out::println);
        /*
         Tworząc Method Reference (pol. referencja do metody) [tu: System.out::println],
         tworzymy implementację Functional Interface (pol. interfejs funkcyjny) [tu: Printer]
         w postaci anonimowej klasy,
         która implementuje (interfejs funkcyjny może zawierać tylko jedną metodę abstrakcyjną) metodę abstrakcyjną [tu: print()],
         która korzysta z Method Reference [tu: println()].
        */
        /*
         ClassName/ObjectName::methodName
         - ClassName/ObjectName -> Jaka klasa lub jaki obiekt będzie implementować interfejs funkcyjny?
         - methodName -> Jaka metoda tej klasy lub tego obiektu będzie implementować metodę abstrakcyjną tego interfejsu?
        */
    }

    public static void greet(Printer printer) {
        printer.print("Hello World");
    }
}
