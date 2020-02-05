import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BirthdayCounter {

    // 1 3 2 4
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar[i] + ar[j]) % k == 0)
                    count++;
            }
        }
        return count;
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        Arrays.sort(keyboards);
        int bal, temp = 0, max = 0;
        Arrays.sort(drives);
        if (keyboards[0] + drives[0] > b)
            bal = -1;
        else if (keyboards[0] + drives[0] == b) {
            bal = b;
        } else {
            for (int i = keyboards.length - 1; i >= 0; i--) {
                for (int j = drives.length - 1; j >= 0; j--) {
                    if (keyboards[i] + drives[j] <= b)
                        temp = keyboards[i] + drives[j];
                    max = Math.max(max, temp);
                }
            }
            bal = max;
        }
        return bal;
    }


    static int countingValleys(int n, String s) {
        char[] cs = s.toCharArray();
        int valley = 0;
        for (int i = 0; i < cs.length - 1; i++) {
            int count = 0;
            if (cs[i] == 'U') {
                int j;
                count++;
                for (j = i + 1; ; j++) {
                    if (cs[j] == 'U')
                        count++;
                    else
                        count--;
                    if (count == 0) {
                        i = j;
                        break;
                    }
                }

                //continue till level
            } else {
                int j;
                count--;
                for (j = i + 1; ; j++) {
                    if (cs[j] == 'U')
                        count++;
                    else
                        count--;
                    if (count == 0) {
                        i = j;
                        ++valley;
                        break;
                    }
                }

            }

        }
        return valley;
    }


    static void bonAppetit(List<Integer> bill, int k, int b) {
        int owe = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i == k)
                continue;//redundant
            else owe += bill.get(i);
        }
        owe /= 2;
        if (owe == b)
            System.out.println("Bon Apetit");
        else
            System.out.println(b - owe);

    }

    static long marcsCakewalk(int[] calorie) {
        long sum = 0, i = calorie.length - 1;
        Arrays.sort(calorie);
        for (int c : calorie) {
            sum += Math.pow(2, i) * c;
            if (i < 0)
                break;
            --i;
        }
        return sum;
    }


    static int[] matchingStrings(String[] strings, String[] queries) {
        int i = 0;
        int[] count = new int[queries.length];
        for (String s : queries) {

            for (String s1 : strings) {
                if (s.equals(s1)) {
                    ++count[i];
                }
            }
            i++;
        }
        return count;
    }

    static int migratoryBirds(List<Integer> arr) {
        int max = 0;
        int[] ar = new int[6];
        for (int i = 0; i < arr.size(); i++) {// TODO: 2/5/2020 replace with foreach 
            ar[arr.get(i)]++;
        }
        int ind = 0;
        for (int j = 1; j < ar.length - 1; j++) {
            if (max == ar[j])
                continue;
            if (max < ar[j]) {
                max = ar[j];
                ind = j;
            }
        }
        return ind;
    }

    static int minimumAbsoluteDifference(int[] ar) {
        int l = ar.length;
        int abs_diff = (int) (2 * Math.pow(10, 9));
        Arrays.sort(ar);
        for (int i = 0; i < l - 1; i++) {
            int diff = Math.abs(ar[i] - ar[i + 1]);
            abs_diff = Math.min(abs_diff, diff);
        }
        return abs_diff;
    }

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        if (s.size() == 1 && m == 1) {
            if (s.get(0) == d)
                return 1;
            else
                return 0;
        }
        int count = 0;
        for (int i = 0; i <= (s.size() - 1) - (m - 1); i++)//first loop
        {
            int sum = 0;
            for (int j = i; j < m + i; j++)//second loop for month
            {

                sum += s.get(j);
            }
            if (sum == d)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(4);
        ls.add(3);
        ls.add(2);
        ls.add(3);
        ls.add(1);
        ls.add(2);
        ls.add(1);
        ls.add(3);
        ls.add(3);
        int[] a = {1, 3, 2};
        int[] numbers = new int[]{-8, 7, 5, 9, 10, -2, 3};
        Arrays.sort(numbers);

        //    System.out.println(countingValleys(6,"DUDUDU"));
        // System.out.println(marcsCakewalk(a));
        //    System.out.println(BirthdayCounter.migratoryBirds(ls));
        // String name = null;
        //   System.out.println(Objects.requireNonNull(name,"Input is null"));
        List<Integer> ls1 = new ArrayList<>();
        ls1.add(1);
        ls1.add(2);
        ls1.add(1);
        ls1.add(3);
        ls1.add(0);
        //2 5 1 3 4 4 3 5 1 1 2 1 4 1 3 3 4 2 1
        //   System.out.println(birthday(ls,18,7));

    }
}
