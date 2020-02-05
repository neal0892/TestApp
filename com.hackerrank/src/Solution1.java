import java.util.Scanner;

public class Solution1 {

    static boolean isAnagram(String first, String second)
    {
        java.util.HashMap hm = new java.util.HashMap<>();
        if(first.isBlank() || second.isBlank() || first == null || second ==null )
            return false;
        if(first.length()!=second.length())
            return false;

        char[] cfirst = first.toLowerCase().toCharArray();
        for(char c : cfirst)
        {

            if(!hm.containsKey(c))
            {
                hm.put(c,1);
            }
            else
            {
                int frequency = (int)hm.get(c);
                hm.put(c,++frequency);
            }

        }
        char[] csecond = second.toLowerCase().toCharArray();
        for(char c : csecond) {
            if (!hm.containsKey(c))
                return false;


                int frequency = (int)hm.get(c);
                if(frequency==0)
                    return false;
                hm.put(c,--frequency);
            }
        return true;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

/*
        String s2 = "welcometojava";
   //     String smallest = s2.substring(0,3);
        int k =3 ;
        String smallest = s2.substring(0,k);
        String largest = smallest;
        for(int i = 1 ;i  < (s2.length()-(k-1));i++)
        {
            String it = s2.substring(i,i+3);
            StringBuilder s. = new StringBuilder("asdasd");
            s.reverse().toString()
            if(smallest.compareTo(it) > 0)
            {
                smallest = it;
            }
            if(largest.compareTo(it) < 0)
            {
                largest = it;
            }

        }

        System.out.println(smallest + " "+ largest );
*/


    }


}
