import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class SavePrisoner {

        // Complete the saveThePrisoner function below.
        static int saveThePrisoner(int n, int m, int s) {
             //  |  |  |  |  |
            int seat = s + (m-1);
            if(seat%n==0)//means the candy is on the same seat where it started https://www.hackerrank.com/challenges/save-the-prisoner/
                return n;
            else
                return seat%n;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
           // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int t = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int tItr = 0; tItr < t; tItr++) {
                String[] nms = scanner.nextLine().split(" ");

                int n = Integer.parseInt(nms[0]);

                int m = Integer.parseInt(nms[1]);

                int s = Integer.parseInt(nms[2]);

                int result = saveThePrisoner(n, m, s);

                System.out.println(result);
//                bufferedWriter.write(System.out);
//                bufferedWriter.newLine();
            }

          //  bufferedWriter.close();

            scanner.close();
        }
    }

