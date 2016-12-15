import java.util.ArrayList;


/**
 * 別スレッドの値を呼び出してみる実験
 * 参照値を渡している
 */

public class CallValue {
    public static void main(String... args) {
        ArrayList<String> arStr = new ArrayList<>();
        arStr.add("ねこ");
        Ok ok = new Ok(arStr);
        ok.setValue(arStr);
        System.out.println("-------");
        arStr.add("はらぺこ");
        ok.getValue();



        new Thread(new Runnable() {
            ArrayList<String> arStr;

            public Runnable setValue(ArrayList<String> arStr) {
                this.arStr = arStr;
                return this;
            }

            public void run() {
                int a = 0;
                while(true) {
                    arStr.add(a+"");
                    a++;
                    try {
                        Thread.sleep(1000);
                    } catch(Exception e) {

                    }
                }
            }
        }.setValue(arStr)
        ).start();



        new Thread(new Runnable() {
            ArrayList<String> arStr;

            public Runnable setValue(ArrayList<String> arStr) {
                this.arStr = arStr;
                return this;
            }

            public void run() {
                while(true) {
                    for(String str : arStr) {
                        System.out.println(str);
                    }
                    System.out.println("--------");

                    try {
                        Thread.sleep(3000);
                    } catch(Exception e) {

                    }
                }
            }
        }.setValue(arStr)
        ).start();


   }
}

class Ok {
    int a;
    String b;
    ArrayList<String> arStr2 = null;

    public Ok(ArrayList<String> arStr) {
        arStr2 = arStr;
        arStr2.add("わかめ");
    }
    
    public void setValue(ArrayList<String> ar) {
        ar.add("いぬ");
    }

    public void getValue() {
         for(String str : arStr2) {
            System.out.println(str);
        }
    }


}

