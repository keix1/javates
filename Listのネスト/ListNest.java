import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListNest {
    public static void main(String... args) {
        ArrayList<ArrayList<String>> stlsls = new ArrayList<ArrayList<String>>();
        ArrayList<String> stls1 = new ArrayList<>();
        stls1.add("ねこ");
        stls1.add("いぬ");
        stls1.add("とり");
        
        ArrayList<String> stls2 = new ArrayList<>();
        stls2.add("おとこ");
        stls2.add("あかちゃん");
        stls2.add("おんな");

        stlsls.add(stls1);
        stlsls.add(stls2);

        for(ArrayList<String> stls : stlsls) {
            for(String str : stls) {
                System.out.println(str);
            }
        }


        HashMap<Integer, ArrayList<String>> hsinar = new HashMap<Integer, ArrayList<String>>();
        hsinar.put(1, stls1);
        hsinar.put(2, stls2);
        
        for(Map.Entry<Integer, ArrayList<String>> e : hsinar.entrySet()) {
            System.out.println(e.getKey()+"");
            for(String str : e.getValue()) {
                System.out.println(str);
            }
        }

    }
}
