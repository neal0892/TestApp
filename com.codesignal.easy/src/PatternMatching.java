public class PatternMatching {


    int main
    public int [] fun(String s , String p) //S = inpt string,p=pattern
    {
        char [] s1 = s.toCharArray();
        char [] p1 = p.toCharArray();
        String matches =null;
        for(int i=0;i<(s.length()-p.length()+1);i++)
        {
            for(int j=0;j<p.length();j++)
            {
                if(s1[i+j] != p1[j])
                    break;
                else
                    matches += String.valueOf(i)+" ";
            }
        }

    }

}
