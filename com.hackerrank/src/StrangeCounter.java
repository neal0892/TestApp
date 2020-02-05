import org.jetbrains.annotations.TestOnly;

public class StrangeCounter {


    public static long strngcounter(long t)
    {
        int n;
        long t_base;
        for(n=0;;n++)
        {
            t_base =(long)(3* Math.pow(2,n)-2);
            if(t < t_base )
            {
                break;
            }
        }
       long  t_real = (long)(3* Math.pow(2,(n-1))-2);
        return 2*(t_real+1)-t;
    }
    public static void main(String[] args) {
        System.out.println(StrangeCounter.strngcounter(10));//12
        System.out.println(StrangeCounter.strngcounter(21));//1
        System.out.println(StrangeCounter.strngcounter(3));//1
        System.out.println(StrangeCounter.strngcounter(12));//10
        System.out.println(StrangeCounter.strngcounter(22));//24


    }


}
