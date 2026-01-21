public static String pangrams(String s) {
    // Write your code here
    s = s.toLowerCase();
    List<Character> englishAlphabet = new ArrayList<>();
    for(char c='a'; c<='z'; c++){
        englishAlphabet.add(c);
    }
    List<Character> charList = new ArrayList<>();
    for(int i =0; i<s.length(); i++){
            charList.add(s.charAt(i));
    }
    if(charList.stream().distinct().sorted().filter(c -> !c.equals(' ')).collect(Collectors.toList()).equals(englishAlphabet))
        return "pangram";
    else
        return "not pangram";
    }
        return "not panagram";
}
