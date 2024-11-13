import java.util.ArrayList;
import java.util.List;

public class AddParentheses {
    public static void main(String[] args) {
        AddParentheses obj = new AddParentheses();
        System.out.println(obj.compute("2-1-1"));
    }

    public List<Integer> compute(String input) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '-' || c == '+' || c == '*') {
                String a = input.substring(0, i);
                String b = input.substring(i + 1);

                List<Integer> al = compute(a);
                List<Integer> bl = compute(b);

                for (int x : al) {
                    for (int y : bl) {
                        if (c == '-') {
                            res.add(x - y);
                        } else if (c == '+') {
                            res.add(x + y);
                        } else if (c == '*') {
                            res.add(x * y);
                        }
                    }
                }
            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(input));
        }
        return res;
    }
}
