import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */
    public static List<Integer> gradingStudents(List<Integer> grades) {
        //iterating the list
        List<Integer> l = new ArrayList<Integer>();
        for (int a:
             grades) {
            if(a<38){
                l.add(a);}
            else
                {
                    int mod = a%5;
                    if((mod)>2)
                    {
                        l.add((a-mod)+5);
                    }
                    else
                        l.add(a);
                }
            }
        return l;
    }
    }



public class GradingStudents {
    public static void main(String[] args) throws IOException {
      //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner s = new Scanner(System.in);

       // int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());
        int gradesCount = s.nextInt();
        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
         //   int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            int gradesItem = s.nextInt();
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(String.valueOf(result.get(i)));
          /*  bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");*/
            }
        }
/*
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    }

