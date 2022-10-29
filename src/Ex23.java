import java.util.ArrayList;
import java.util.List;

public class Ex23 {
    public static int main() {
        List<Integer> list = new ArrayList<Integer>();
        boolean[] nums = new boolean[28123];
        int sum = 0;
        for (int i = 0; i < 28123; i++) {
            if (isAbundant(i)){
                list.add(i);
            }
        }
        for (int i = 0; i < list.size(); i++){
            for (int j = i; j < list.size(); j++){
                if(list.get(i)+list.get(j) < 28123) nums[list.get(i) + list.get(j)] = true;

            }
        }
        for (int i = 0; i < 28123; i++){
            if (!nums[i]){
                sum += i;
            }
        }
        return sum;
    }
    private static boolean isAbundant(int num){
        int sum = 0;
        for (int i = 1; i < num/2 + 1; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        return sum > num;
    }
}
