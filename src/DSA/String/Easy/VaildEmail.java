
package DSA.String.Easy;

import java.util.Scanner;

class MyRegex{
//  String pattern ="^[7-9]{1}+[0-9]{9}$";
   String pattern="^((25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9]?[0-9])$";
//  String pattern ="^[a-zA-Z0-9._]+@[a-zA-Z0-9.]+\\.[a-zA-Z]{2,4}$";
  
  
}

public class VaildEmail {
    public static void main(String[] args) {
  
        MyRegex r=new MyRegex();
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String s=sc.next();
System.out.println(s.matches(r.pattern));
            }
        }
    }
    
}
