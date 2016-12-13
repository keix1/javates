import java.io.Serializable;

public class Katahan {
    public static void main(String... args) {
        int a = 12;
        String b = "ねこ";
        Object obj = b;

        if(obj instanceof Object) {
            System.out.println("犯人はObject");
        }

        if(obj instanceof Integer) {
            System.out.println("犯人はInteger");
        }

        if(obj instanceof String) {
            System.out.println("犯人はString");
        }


    }
}
