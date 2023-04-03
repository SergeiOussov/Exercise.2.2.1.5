package koschei.models;

public class Egg6 {

    private final Needle7 needl;
    public Egg6(Needle7 needl) {this.needl = needl;}

    @Override
    public String toString() {
        return ", в яйце иголка " + needl.toString();
    }
}
