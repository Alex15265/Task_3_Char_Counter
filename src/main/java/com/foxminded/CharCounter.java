package com.foxminded;

import java.util.*;

public class CharCounter {

    private Map<String, String> cache = new HashMap<>();

    public String counterOfUniqueCharacters (String sourceString) {

        if (sourceString == null) throw new IllegalArgumentException();

        if (sourceString.equals("")) {
            return "";
        }

        if (cache.containsKey(sourceString)) {
            return cache.get(sourceString);
        }

        Map<String, Integer> numberOfUniqueChars = new LinkedHashMap<>();

        for (String character : sourceString.split("")) {
            Integer frequency = numberOfUniqueChars.get(character);
            numberOfUniqueChars.put(character, frequency == null ? 1 : frequency + 1);
        }

        StringBuilder result = new StringBuilder();
        result.append(sourceString).append("\n");
        numberOfUniqueChars.forEach((k, v) -> result.append("\"").append(k).append("\" - ").append(v).append("\n"));

        cache.put(sourceString, result.toString());

        return result.toString();
    }
}
