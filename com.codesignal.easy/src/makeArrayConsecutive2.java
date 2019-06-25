import java.util.Arrays;
//import java.util.Collections;

public class makeArrayConsecutive2 {


    public static void main(String[] args) {
        int[] a = {6, 2, 3, 8};
        System.out.println(makeArrayConsecutive2.fun(a));
    }
    static int fun(int [] statues) {
        if (statues.length <= 1)
            return 0;
        else {
            int sum = 0;
            Arrays.sort(statues);
            for (int i = 0; i < statues.length - 1; i++) {
                int diff = statues[i + 1] - statues[i];
                if (diff > 1)
                    sum += (diff - 1);
            }
            return sum;
        }
    }
}
