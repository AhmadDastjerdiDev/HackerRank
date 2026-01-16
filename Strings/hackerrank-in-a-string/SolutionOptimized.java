 public static String hackerrankInString(String s) {
        String target = "hackerrank";
        int index = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length() && index < target.length(); i++) {
            if (s.charAt(i) == target.charAt(index)) {
                index++;
            }
        }
        return index == target.length() ? "YES" : "NO";
    }
