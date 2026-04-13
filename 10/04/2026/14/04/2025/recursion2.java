public class recursion2 {
    static int rev = 0;
    static int  reverse(int n)
    {
        if(n==0)
        {
            try {
                return rev;
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return rev = rev* 10 + n%10;

    }
    public static void main(String[] args) {
        int n =123;

        
    }
}
