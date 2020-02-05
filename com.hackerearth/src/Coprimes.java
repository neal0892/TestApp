public class Coprimes {


    public static int coprime(int n)
    {
        int start = n-1;
        for(int i = start-1;i>1;i--) {
            if (n % i != 0)
                return i;

        }
        return 1;

    }
}
