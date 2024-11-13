public class Reverse_Vowels{

    static String Reverse(String s){
        char[] word = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        String vowels = "aeiouAEIOU";

        while(start<end){

            if(start<end && vowels.indexOf(word[start])== -1){
                start++;
            }

            char temp = word[start];
            word[start] = word[end];
            word[end] = temp;

            start++;
            end--;
        }
        return new String(word);
    }

    public static void main(String[] args){
        Reverse_Vowels obj =  new Reverse_Vowels();
        String input = "Hello";
        System.out.println(Reverse_Vowels.Reverse(input));
    }
}
