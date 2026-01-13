public static int marsExploration(String s) {
    int numberOfDifference = 0;

    for (int i = 0; i < s.length(); i++) {
        char expected;
        if (i % 3 == 0) expected = 'S';    // first char of SOS
        else if (i % 3 == 1) expected = 'O'; // second char of SOS
        else expected = 'S';                 // third char of SOS

        if (s.charAt(i) != expected) numberOfDifference++;
    }

    return numberOfDifference;
}
