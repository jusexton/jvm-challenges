package com.sexton.challenges.codewars;

public final class ExpandNumbers {
    // public static String expand(int number) {
    //     String com.sexton.challenges.codewars.digits = String.valueOf(number);
    //     String[] numbers = new String[com.sexton.challenges.codewars.digits.length()];
    //
    //     int place = 1;
    //     for (int i = com.sexton.challenges.codewars.digits.length() - 1; i >= 0; i--) {
    //         char digit = com.sexton.challenges.codewars.digits.charAt(i);
    //         numbers[i] = digit != '0' ? String.format("%-" + place + "s", digit).replace(' ', '0') : "";
    //         place++;
    //     }
    //
    //     return Arrays.stream(numbers).filter(s -> !s.equals("")).collect(Collectors.joining(" + "));
    // }

    public static String expand(int number) {
        String expanded = "";

        for (int i = 10; i < number; i *= 10) {
            int remainder = number % i;
            expanded = (remainder > 0) ? " + " + remainder + expanded : expanded;
            number -= remainder;
        }

        expanded = number + expanded;

        return expanded;
    }
}
