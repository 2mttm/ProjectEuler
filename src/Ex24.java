import java.util.ArrayList;
import java.util.List;

public class Ex24 { //get permutation by its index
    public static String main(int digits, int index) {
        List<Integer> list = new ArrayList<>();
        StringBuilder ret = new StringBuilder();
        for (int i = 0; i < digits; i++){
            list.add(i);
        }
        for (int i = 0; i < digits; i++){
            int f = factorial(digits - i - 1);
            int d = index / f;
            ret.append(list.get(d));
            list.remove(d);
            index %= f;
        }
        return ret.toString();
    }
    private static int factorial(int num){
        if (num <= 1) return 1;
        return factorial(num-1)*num;
    }
}
