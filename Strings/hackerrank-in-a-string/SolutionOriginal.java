public static String hackerrankInString(String s) {
    // Write your code here
    String desired = "hackerrank";
    int desiredFound = 0;
    s = s.toLowerCase();
    List<Character> underEvaluation = new ArrayList<>();
    for(int i = 0; i < s.length(); i ++){
        underEvaluation.add(s.charAt(i));
    }
    for(int i = 0; i<desired.length(); i++){
        char c = desired.charAt(i);
        for(char ch : underEvaluation){
            if(ch == c){
                desiredFound++;
                underEvaluation = underEvaluation.subList(underEvaluation.indexOf(ch)+1, underEvaluation.size());
                break;
            }
        }   
    }
    if(desiredFound == desired.length())
        return "YES";
    else
        return "NO";
}
