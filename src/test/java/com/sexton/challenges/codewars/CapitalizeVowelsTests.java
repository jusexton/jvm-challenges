package com.sexton.challenges.codewars;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CapitalizeVowelsTests {
    @ParameterizedTest
    @ArgumentsSource(CapitalizeVowelsArgumentProvider.class)
    public void testCapitalizeVowels(final String expected, final String input) {
        final String actual = CapitalizeVowels.capitalize(input);
        assertEquals(expected, actual);
    }

    private static class CapitalizeVowelsArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    arguments("", ""),
                    arguments("HEllOWOrld!", "HelloWorld!"),
                    arguments("SUndAy", "Sunday"),
                    arguments("bbb", "bbb")
            );
        }
    }
}
