public class Listes implements IListesListener {
    GameMode nowMode = GameMode.modeA;

    @Override
    public void stateChanged(GameMode mode) {
        System.out.println("Now Class is " + getClass().getName());
        System.out.println("GameMode old is " + nowMode.toString());
        System.out.println("GameMode now is " + mode.toString());
        nowMode = mode;
    }

}
