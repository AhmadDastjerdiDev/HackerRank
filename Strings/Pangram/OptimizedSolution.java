public static String pangrams(String s) {
    boolean[] seen = new boolean[26];
    int count = 0;

    s = s.toLowerCase();

    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);

        if (c >= 'a' && c <= 'z') {
            int index = c - 'a';
            if (!seen[index]) {
                seen[index] = true;
                count++;
            }
        }
    }

    return count == 26 ? "pangram" : "not pangram";
}
