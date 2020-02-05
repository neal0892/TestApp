import java.io.*;
import java.util.*;

public class BreakingTheRecord {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int count_min=0;
        int count_max=0;
        int min = scores[0];
        int max = scores[0];
        for(int i : scores)
        {
            if(i<min)
            {
                min=i;
                count_min++;
            }
            if(i>max)
            {
                max=i;
                count_max++;
            }
            int[] out = new int[2];
            out[0]=count_min;
            out[1]=count_max;
            return out;
        }


        return null;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


   //     BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
      //      bufferedWriter.write(String.valueOf(result[i]));
            System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
      //          bufferedWriter.write(" ");
                System.out.println(String.valueOf(result[i]));
            }
        }

     //   bufferedWriter.newLine();

      //  bufferedWriter.close();

        scanner.close();
    }
}
