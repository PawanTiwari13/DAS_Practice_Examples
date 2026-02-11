package DSA.String.Easy;

public class Palindrome {

    public void isPalindrome(String pa) {
        int s = 0;
        int e = pa.length() - 1;
        while (s < e) {
            if (pa.charAt(s) != pa.charAt(e)) {
                System.out.println("It's not Palindorme : " + pa);
                return;
            }
            s++;
            e--;
        }
        System.out.println("It's Palindrome : "+pa);
    }
    public static void main(String[] args) {
        Palindrome pl=new Palindrome();
        String p="level";
        pl.isPalindrome(p);
        
    }
}
