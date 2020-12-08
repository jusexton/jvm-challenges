package com.sexton.challenges.codewars;

import java.util.regex.Pattern;

public final class CapitalizeVowels {
    // First implementation. Was written roughly 4 years ago.
    // public static final Set<Character> VOWELS = Set.of('a', 'e', 'i', 'o', 'u');
    // public static String capitalize(final String string) {
    // final char[] characters = string.toCharArray();
    //
    //     for (int i = 0; i < characters.length; i++) {
    //         final char character = characters[i];
    //         final boolean isVowel = VOWELS.contains(character);
    //         if (isVowel) {
    //             characters[i] = Character.toUpperCase(character);
    //         }
    //     }
    //
    //     return new String(characters);
    // }

    public static String capitalize(final String string) {
        return Pattern.compile("[aeiou]")
                .matcher(string)
                .replaceAll(match -> match.group().toUpperCase());
    }
}
