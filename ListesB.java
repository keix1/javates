public class ListesB implements IListesListener {
    GameMode nowMode = GameMode.modeB;

    @Override
    public void stateChanged(GameMode mode) {
        System.out.println("Now Class is " + getClass().getName());
        System.out.println("GameMode old is " + nowMode.toString());
        System.out.println("GameMode now is " + mode.toString());
        nowMode = mode;
    }

}
