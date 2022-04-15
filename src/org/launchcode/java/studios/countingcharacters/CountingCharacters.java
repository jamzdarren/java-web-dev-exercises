package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> characters = new HashMap<>();

        for (char c : charactersInString) {
            if (characters.containsKey(c)) {
                characters.put(c, characters.get(c) + 1);
            } else {
                characters.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> element : characters.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }
}
