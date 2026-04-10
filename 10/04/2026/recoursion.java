

public class recoursion {
    public static void main(String[] args) {
        String Str1 ="abc";
        int count = 0;  
        for(int i =0;i<Str1.length();i++){
            for(int j=1; j<Str1.length();i++){
                if(Str1.charAt(i)==Str1.charAt(j)){
                    count++;
                }

            }

        }
        
    }
}
