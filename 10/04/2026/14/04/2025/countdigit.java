public class countdigit {
    static int countdigit(int n)
    {
        if (n == 0) return 0;   // base case correct
        return 1 + countdigit(n / 10);
    }

    public static void main(String[] args) {
        int n = 1234564+7;
        System.out.println(countdigit(n));
    }
}