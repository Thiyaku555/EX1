import java.util.ArrayList;
import java.util.List;

public class Vowel {
    public static void main(String[] args) {

        List<String> Vl1 = new ArrayList<String>();
        List<String> list = new ArrayList<String>();

        Vl1.add("apple");
        Vl1.add("123");
        Vl1.add("cheery");
        Vl1.add("pear");
        Vl1.add("xyz");

        // int b = Vl1.toArray().length;
        for (int i = 0; i < Vl1.size(); i++) {
            String str = Vl1.get(i).toString();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && (!list.contains(str))) {
                    list.add(str);

                }

            }
        }

        System.out.println(list);

    }
}
