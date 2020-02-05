import org.jetbrains.annotations.NotNull;

public class FindAllSubsets {
    static int call = 0;

    public static void printAllSubsets(int[] array) {
        int[] subset = new int[array.length];
        helper(array, subset, 0);
    }

    private static void helper(@NotNull int[] array, int[] subset, int i) {
        if (i == array.length)
            print(subset);
        else {
            subset[i] = 0;
             helper(array, subset, i + 1);
            subset[i] = array[i];
            helper(array, subset, i + 1);
        }
    }

    private static void print(int[] subset) {
        call ++;
        boolean flag = false;
        for (int i : subset) {
            if (i != 0) {
                flag = true;
                System.out.print(i + ",");
            }
        }
        if (!flag) System.out.print("-");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2};
        printAllSubsets(arr);
    }
}