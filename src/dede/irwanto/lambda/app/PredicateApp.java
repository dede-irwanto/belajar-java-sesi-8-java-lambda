package dede.irwanto.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicateCheckBlank = s -> s.isBlank();

        System.out.println(predicateCheckBlank.test(""));
        System.out.println(predicateCheckBlank.test("Dede"));
    }
}
