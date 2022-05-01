public class BackspaceStringCompare {
    public static boolean backspaceCompare(String s, String t) {
        StringBuilder ssb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '#' && !ssb.isEmpty()){
                ssb.deleteCharAt(ssb.length()-1);
            } else if (c != '#'){
                ssb.append(c);
            }
        }
        StringBuilder tsb = new StringBuilder();
        for (char c : t.toCharArray()) {
            if (c == '#' && !tsb.isEmpty()){
                tsb.deleteCharAt(tsb.length()-1);
            } else if (c != '#'){
                tsb.append(c);
            }
        }
        return ssb.toString().equals(tsb.toString());
    }

    public static void main(String[] args) {
        System.out.println(backspaceCompare("y#fo##f",
                "y#f#o##f"
        ));
    }
}
