public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    public static String build(String s){
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#' && !sb.isEmpty()){
                sb.deleteCharAt(sb.length()-1);
            } else if (c != '#'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
