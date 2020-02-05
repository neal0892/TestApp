import java.util.Scanner;

public class NL {

    public static void main(String[] args) {

        int count;
        Scanner s = new Scanner(System.in);
        count = s.nextInt();
        s.nextLine();

        String t[] = new String[count];

        for(int i=0;i<count;i++)
        {
            t[i]=s.nextLine();
        }
            for(String c1 : t)
                System.out.println(c1);
    }
}
