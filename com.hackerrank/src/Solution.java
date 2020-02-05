import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {


    public static void main(String[] args) {
        int[] a = {1,3,5,4,5};
        MinMaxSum1(a);
        System.out.println(birthdayCakeCandles(a));
    }

    static int birthdayCakeCandles(int[] candles){
        int count =0;
        int max = Collections.max(Arrays.stream(candles).boxed().collect(Collectors.toList()));
        for (int a : candles)
        {
            if(max ==a )
                count++;
        }
            return count;
    }

    static void MinMaxSum1(int[] param)
    {
        List<Integer> list = Arrays.stream(param).boxed().collect(Collectors.toList());
        Collections.sort(list);
        int sum =0;
        for(int i : list)
        {
            sum+=i;
        }
        System.out.print(sum - list.get(list.size()-1));
        System.out.print("  ");
        System.out.print(sum-list.get(0));

    }

}