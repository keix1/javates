import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String... args) {
        ArrayList<IListesListener> lA = new ArrayList<>();
        Listes listes = new Listes();
        ListesB listesB = new ListesB();
        lA.add(listes);
        lA.add(listesB);

        Scanner scan = new Scanner(System.in);

        String str = "";
        while(!(str = scan.next()).equals("")) {
            if(str.equals("A")) {
                for(IListesListener lis : lA) {
                    lis.stateChanged(GameMode.modeA);
                }
            }
            if(str.equals("B")) {
                for(IListesListener lis : lA) {
                    lis.stateChanged(GameMode.modeB);
                }
            }
            if(str.equals("C")) {
                for(IListesListener lis : lA) {
                    lis.stateChanged(GameMode.modeC);
                }
            }
        }
    
    }
}
