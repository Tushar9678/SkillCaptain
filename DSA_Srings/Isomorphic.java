import java.util.HashMap;
import java.util.Map;

public class Isomorphic{

    static boolean check_string(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        Map<Character, Character> str1_to_str2 = new HashMap<>();
        Map<Character, Character> str2_to_str1 = new HashMap<>();


        for(int i=0; i<str1.length(); i++){
            char str1_char = str1.charAt(i);
            char str2_char = str2.charAt(i);
            
            // check mapping from str1 to str2

            if(str1_to_str2.containsKey(str1_char)){
                if(str1_to_str2.get(str1_char) != str2_char ){
                    return false;
                }

            }else{
                str1_to_str2.put(str1_char, str2_char);

            }

            // check mapping from str2 to str1

            if(str2_to_str1.containsKey(str2_char)){
                if(str2_to_str1.get(str2_char) != str1_char){
                    return false;
                }
            }else{
                str2_to_str1.put(str2_char ,  str1_char);

            }

        }
        return true;

    }


    public static void main(String[] args){
        String s1 = "egg";
        String t1 = "app";
        System.out.println(check_string(s1, t1));

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(check_string(s2, t2));

    }
}