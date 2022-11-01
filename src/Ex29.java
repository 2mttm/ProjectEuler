import java.util.SortedSet;
import java.util.TreeSet;

public class Ex29 extends TreeSet<String>{
    private final int a;
    private final int b;
    private final SortedSet<Double> set = new TreeSet<>();
    public Ex29(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        for (int i = 2; i <= a; i++) {
            for (int j = 2; j <= b; j++) {
                set.add(Math.pow(i, j));
            }
        }
        return set.toArray().length;
    }

}
