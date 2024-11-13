import java.util.*;

public class Isomorphic {

    private static boolean isIsomorphic(String s, String t) {
        // Base case
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> s_To_t = new HashMap<>();
        Map<Character, Character> t_To_s = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char char_s = s.charAt(i);
            char char_t = t.charAt(i);

            // Check mapping from s to t
            if (s_To_t.containsKey(char_s)) {
                if (s_To_t.get(char_s) != char_t) {
                    return false;  
                }
            } else {
                s_To_t.put(char_s, char_t);  
            }

            // Check mapping from t to s
            if (t_To_s.containsKey(char_t)) {
                if (t_To_s.get(char_t) != char_s) {
                    return false;  // If the reverse mapping doesn't match, return false
                }
            } else {
                t_To_s.put(char_t, char_s);  
            }
        }
        return true;
    }

    public static void main(String args[]) {
        // Initialize
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));  

        String s1 = "foo";
        String t1 = "bar";
        System.out.println(isIsomorphic(s1, t1)); 
    }
}
